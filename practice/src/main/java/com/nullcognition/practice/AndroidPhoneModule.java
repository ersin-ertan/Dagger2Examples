package com.nullcognition.practice;
// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AndroidPhoneModule{

	@Provides @Singleton public AndroidPhone provideAndroidPhone(){return new AndroidPhone();}
}
