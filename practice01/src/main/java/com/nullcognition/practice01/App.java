package com.nullcognition.practice01;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;
import android.content.Context;

import com.nullcognition.practice01.user.UserComponent;
import com.nullcognition.practice01.user.UserModule;

public class App extends Application{

	AppComponent appComponent;
	UserComponent userComponent;
	public static App get(Context context){ return (App) context.getApplicationContext(); }
	public AppComponent getAppComponent(){ return appComponent; }
	@Override public void onCreate(){
		super.onCreate();

		appComponent = DaggerAppComponent.builder()
		                                 .appModule(new AppModule(this))
		                                 .build();
	}
	public UserComponent getUserComponent(){ return userComponent; }

	public UserComponent createUserComponent(String user){
		userComponent = appComponent.plus(new UserModule(user));
		return userComponent;
	}
	public void releaseUserComponent(){ userComponent = null; }


}

