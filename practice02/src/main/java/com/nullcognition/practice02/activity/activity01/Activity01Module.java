package com.nullcognition.practice02.activity.activity01;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice02.activity.ActScopeClass;
import com.nullcognition.practice02.activity.ActivityModule;

import dagger.Module;
import dagger.Provides;

@Module public class Activity01Module extends ActivityModule{

	public Activity01Module(final Activity01 a){ super(a, 1); }

	@ActivityScope01 @Provides public ActScopeClass provideActScopeClass(){ return new ActScopeClass(); }
	// to remove this we ask, can @Inject constructors be interleaved with another @Provides which provides
	// the 2nd, non @Inject annotated constructor

}
