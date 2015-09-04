package com.nullcognition.practice.modules;
// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.

import com.nullcognition.practice.models.ApplePhone;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplePhoneModule{

	@Provides public ApplePhone getApplePhone(){return new ApplePhone();}
}
