package com.nullcognition.practice;
// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AndroidPhoneModule.class , ApplePhoneModule.class})
public interface TechStoreComponent extends StoreComponent{

//	void inject(MainActivity activity); // inherited

	// used to get the object from the graph
	ApplePhone applePhone();
}
