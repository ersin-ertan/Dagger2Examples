package com.nullcognition.chiu_ki;
// ersin 03/09/15 Copyright (c) 2015+ All rights reserved.

import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component(modules = ApiModule.class)
public interface GoogleComponent{
	void inject(MainActivity mainActivity);

}
