package com.nullcognition.practice;
// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;

public class Mall extends Application{

	private StoreComponent storeComponent;
	public StoreComponent getStoreComponent(){return storeComponent;}

	@Override public void onCreate(){
		super.onCreate();

		if(storeComponent == null){
			storeComponent = DaggerTechStoreComponent.builder()
			                                         .androidPhoneModule(new AndroidPhoneModule())
			                                         .applePhoneModule(new ApplePhoneModule())
			                                         .build();
		}
	}
}
