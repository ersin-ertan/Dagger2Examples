package com.nullcognition.practice02.activity.activity02;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice02.activity.ActScopeClass;
import com.nullcognition.practice02.activity.ActivityModule;
import com.nullcognition.practice02.activity.ActivityScope;

import dagger.Module;
import dagger.Provides;

@Module public class Activity02Module extends ActivityModule{

	public Activity02Module(final Activity02 a, final int externalInt){super(a, externalInt);}

	@ActivityScope02 @Provides public ActScopeClass provideActScopeClass(){ return new ActScopeClass(externalInt);}

}
