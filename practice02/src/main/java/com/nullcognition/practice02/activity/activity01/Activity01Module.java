package com.nullcognition.practice02.activity.activity01;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice02.activity.ActScopeClass;
import com.nullcognition.practice02.activity.ActivityModule;

import dagger.Module;
import dagger.Provides;

@Module public class Activity01Module extends ActivityModule{

	public Activity01Module(final Activity01 a){ super(a, 1); }

	@ActivityScope01 @Provides public ActScopeClass provideActScopeClass(){ return new ActScopeClass(); }

	// this was removed here because ActScopeClass does not require external state, thus we can annotate
	// the no arg constructor of ActScopeClass with @Inject, however, in Activity02Module where we require
	// external state, we use the @Provides method to provide the new ActScopeClass with the constructor arg
	// but, since your assigning a scope to the class for an @Inject'ed const, we must verify that the assigned
	// scope is overriding possible other scoping

}
