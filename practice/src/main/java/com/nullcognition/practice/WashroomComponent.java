package com.nullcognition.practice;
// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.

import com.nullcognition.practice.modules.SinkModule;
import com.nullcognition.practice.modules.ToiletModule;

import dagger.Component;

@Component(modules = { ToiletModule.class, SinkModule.class})
public interface WashroomComponent extends StoreComponent{

//	void inject(MainActivity activity); inherited
}
