package com.nullcognition.practice.modules;
// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.

import com.nullcognition.practice.models.Soap;
import com.nullcognition.practice.models.Water;

import dagger.Module;
import dagger.Provides;

@Module
public class SinkModule{

	@Provides Water getWater(){return new Water();}

	@Provides Soap getSoap(){return new Soap();}
}
