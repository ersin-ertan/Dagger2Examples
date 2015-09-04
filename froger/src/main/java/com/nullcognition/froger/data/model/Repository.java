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
//public class Repository implements Parcelable{
//
//	public long   id;
//	public String url;
//	public String name;
//
//	@Override public int describeContents(){ return 0; }
//	@Override public void writeToParcel(Parcel dest, int flags){RepositoryParcelablePlease.writeToParcel(this, dest, flags);}
//	public static final Creator<Repository> CREATOR = new Creator<Repository>(){
//		public Repository createFromParcel(Parcel source){
//			Repository target = new Repository();
//			RepositoryParcelablePlease.readFromParcel(target, source);
//			return target;
//		}
//		public Repository[] newArray(int size){return new Repository[size];}
//	};
//}
