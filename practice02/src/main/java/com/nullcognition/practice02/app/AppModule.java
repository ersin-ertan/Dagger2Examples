package com.nullcognition.practice02.app;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;

import com.nullcognition.practice02.appclasses.ClassNeededAsArgOfProvideFromGlobalModule;

import dagger.Module;
import dagger.Provides;

@Module public class AppModule{

	private final Application application;
	public AppModule(final Application app){this.application = app;} // implementations use application instead of application

	@Provides public Application provideApplication(){ return application; }

	@Provides public ClassNeededAsArgOfProvideFromGlobalModule provideClassNeededAsArgOfProvideFromGlobalModule(){
		return new ClassNeededAsArgOfProvideFromGlobalModule();
	}
}
