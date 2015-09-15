package com.nullcognition.practice03.activity;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;

import com.nullcognition.practice03.AppModule;
import com.nullcognition.practice03.AppScope;
import com.nullcognition.practice03.Provided;

import dagger.Module;
import dagger.Provides;

@Module public class AppModuleEx extends AppModule{

	public AppModuleEx(Application application){
		super(application);}

	@Provides @AppScope public Application provideApplication(){return application;}
	// both providing from the parent or child will yield the application
	// but you cannot override, thus you must have only one

	// comment this out to test the @Inject provision
	@Provides public Provided provideProvided(){ return new Provided(2);}
}
