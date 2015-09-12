package com.nullcognition.practice01;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton @Module public class AppModule{

	private Application application;

	public AppModule(Application application){ this.application = application; }

	@Provides @Singleton public Application provideApplication(){ return application; }

	@Provides @Singleton Classes.SomeManager provideSomeManager(){ return new Classes.SomeManager(application); }

	@Provides @Singleton Classes.SomeClass provideSomeClass(){return new Classes.SomeClass();}
}
