package com.nullcognition.practice;
// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.

import dagger.Module;
import dagger.Provides;

@Module
public class ApplePhoneModule{

	// note different from Android phone, does not have @Singleton
	@Provides public ApplePhone getApplePhone(){return new ApplePhone();}
}
