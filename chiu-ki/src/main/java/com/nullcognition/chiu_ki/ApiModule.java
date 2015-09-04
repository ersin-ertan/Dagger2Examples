package com.nullcognition.chiu_ki;
// ersin 03/09/15 Copyright (c) 2015+ All rights reserved.

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApiModule{

	@Provides @Singleton
	public Api provideApi(){return new Api();}
}
