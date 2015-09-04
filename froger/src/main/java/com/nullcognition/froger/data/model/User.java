//package com.nullcognition.froger.data.model;
//// ersin 03/09/15 Copyright (c) 2015+ All rights reserved.
//
//
//import android.os.Parcel;
//import android.os.Parcelable;
//
//import com.hannesdorfmann.parcelableplease.annotation.ParcelablePlease;
//
//@ParcelablePlease
//public class User implements Parcelable{
//
//	public long id;
//	public String url;
//	public String login;
//	public String email;
//
//	@Override public int describeContents(){ return 0; }
//	@Override public void writeToParcel(Parcel dest, int flags){UserParcelablePlease.writeToParcel(this, dest, flags);}
//	public static final Creator<User> CREATOR = new Creator<User>(){
//		public User createFromParcel(Parcel source){
//			User target = new User();
//			UserParcelablePlease.readFromParcel(target, source);
//			return target;
//		}
//		public User[] newArray(int size){return new User[size];}
//	};
//}
