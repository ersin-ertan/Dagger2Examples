package com.nullcognition.activitygraphs;
// ersin 06/09/15 Copyright (c) 2015+ All rights reserved.

import android.app.Application;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent{

	// Field injections of any dependencies of the DemoApplication
	void inject(App application);

	// Exported for child-components.
	Application application();
	LocationManager locationManager();
}
