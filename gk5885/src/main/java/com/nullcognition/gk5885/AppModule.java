package com.nullcognition.gk5885;
// ersin 09/09/15 Copyright (c) 2015+ All rights reserved.

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule{

	private final Application application;
	public AppModule(Application app){application = app;}

	@Provides Application application(){ return application;}
}
