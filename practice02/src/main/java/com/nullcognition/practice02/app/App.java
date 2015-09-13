package com.nullcognition.practice02.app;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;


public class App extends Application{

	private AppComponent appComponent;
	public AppComponent getAppComponent(){ return appComponent; }

	@Override public void onCreate(){
		super.onCreate();
		if(appComponent == null){
			appComponent = DaggerAppComponent.builder()
			                                 .appModule(new AppModule(this))
			                                 .globallyNeededModule(new GloballyNeededModule(true))
			                                 .build();
		}
	}

//	MySubcomponent mySubcomponent;
}

