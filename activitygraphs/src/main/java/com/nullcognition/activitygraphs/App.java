package com.nullcognition.activitygraphs;
// ersin 06/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;
import android.location.LocationManager;

import javax.inject.Inject;

public class App extends Application{

	private AppComponent appComponent;
	public AppComponent getAppComponent(){ return appComponent;}
	@Inject LocationManager locationManager;

	@Override public void onCreate(){
		super.onCreate();

		appComponent = DaggerAppComponent.builder()
		                                 .appModule(new AppModule(this))
		                                 .build();
	}
}
