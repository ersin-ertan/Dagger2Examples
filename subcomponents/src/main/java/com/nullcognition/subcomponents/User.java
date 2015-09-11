package com.nullcognition.subcomponents;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.


import android.os.Parcel;
import android.os.Parcelable;

import com.hannesdorfmann.parcelableplease.annotation.ParcelablePlease;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

import javax.inject.Scope;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

@ParcelablePlease public class User implements Parcelable{

	public String name;

	@Override public int describeContents(){ return 0; }
	@Override public void writeToParcel(Parcel dest, int flags){UserParcelablePlease.writeToParcel(this, dest, flags);}
	public static final Creator<User> CREATOR = new Creator<User>(){
		public User createFromParcel(Parcel source){
			User target = new User();
			UserParcelablePlease.readFromParcel(target, source);
			return target;
		}
		public User[] newArray(int size){return new User[size];}
	};


	@Module public static class UserModule{

		private User user;
		public UserModule(User u){user = u;}

		@Provides @UserScope User provideUser(){return user;}

		@Provides @UserScope DataManager provideUserData(User user, DataManager.ApiService apiService){
			return new DataManager(user, apiService);
		}
	}


	@UserScope @Subcomponent(modules = User.UserModule.class) public interface UserComponent{

		DataListActivity.DataListActivityComponent plus(DataListActivity.DataListActivityModule dataListActivityModule);
	}
}


@Scope @Retention(RetentionPolicy.RUNTIME) @interface UserScope{ }


class UserManager{

	private DataManager.ApiService apiService;
	public UserManager(DataManager.ApiService as){apiService = as;}

	public User getUser(String name){
		Map<User, String> map = apiService.getUserData();
		if("u00".equals(name)){ return DataManager.ApiService.u00; }
		else{ return DataManager.ApiService.u01; }
	}
}
