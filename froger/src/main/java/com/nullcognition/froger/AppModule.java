package com.nullcognition.froger;
// ersin 03/09/15 Copyright (c) 2015+ All rights reserved.

import android.app.Application;

import com.nullcognition.froger.utils.AnalyticsManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule{

	private Application application;
	public AppModule(Application app){application = app;}


	@Provides @Singleton public Application provideAplication(){return application;}

	// this is an provide that uses the application as its constructor
	@Provides @Singleton AnalyticsManager provideAnalyticsManager(){ return new AnalyticsManager(application); }


//	@Provides @Singleton Validator provideValidator(){ return new Validator();}

}
