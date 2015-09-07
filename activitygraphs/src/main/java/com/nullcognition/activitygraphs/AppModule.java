package com.nullcognition.activitygraphs;
// ersin 06/09/15 Copyright (c) 2015+ All rights reserved.

import android.app.Application;
import android.content.Context;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule{

	public final Application application;
	public AppModule(Application app){application = app;}

	// expose the application to the graph
	@Provides @Singleton Application application(){return application;}

	@Provides @Singleton LocationManager provideLocationManager(){
		return (LocationManager) application.getSystemService(Context.LOCATION_SERVICE);
	}
}
