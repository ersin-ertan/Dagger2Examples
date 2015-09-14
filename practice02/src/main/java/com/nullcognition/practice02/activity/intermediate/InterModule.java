package com.nullcognition.practice02.activity.intermediate;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice02.activity.ActScopeClass;
import com.nullcognition.practice02.activity.ActScopeClassGlobal;
import com.nullcognition.practice02.activity.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module public class InterModule{

	// both the InterManager and InterModule will have the actScopeClassGlobal
	private ActScopeClassGlobal actScopeClassGlobal;
	public InterModule(int anInt){actScopeClassGlobal = new ActScopeClassGlobal(anInt);}

	@Provides @ActivityScope ActScopeClassGlobal provideActScopeClass(){return actScopeClassGlobal;}

	// no primitives allowed as an argument
	@Provides @ActivityScope InterManager provideInterManager(ActScopeClass actScopeClass){
		return new InterManager(actScopeClass);
	}
}
