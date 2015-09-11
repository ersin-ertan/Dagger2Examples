package com.nullcognition.simple;
// ersin 06/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;
import android.location.LocationManager;

import javax.inject.Inject;

public class App extends Application{

	@Inject LocationManager locationManager; // not sure why this is here
	private ComponentApp component;
	// use the local injection if possible to structure the app with semantic boundaries
	LocationManager getLocationManager(){return locationManager;}
	public ComponentApp getComponentApp(){ return component;}

	@Override public void onCreate(){
		super.onCreate();

		if(component == null){
			component = DaggerComponentApp.builder()
			                              .moduleApp(new ModuleApp(this))
			                              .build();
		}
		component.inject(this);
	}
}
