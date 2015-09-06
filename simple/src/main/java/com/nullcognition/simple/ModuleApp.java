package com.nullcognition.simple;
// ersin 06/09/15 Copyright (c) 2015+ All rights reserved.


import android.content.Context;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ModuleApp{

	private final App app;
	public ModuleApp(App ap){app = ap;}

	@Provides @Singleton @ScopeApplication Context provideApplicationContext(){ return app;}

	@Provides @Singleton LocationManager provideLocationManager(){
		return (LocationManager) app.getSystemService(Context.LOCATION_SERVICE);
	}
}
