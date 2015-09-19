package com.nullcognition.practice05;
// ersin 15/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Activity;

import autodagger.AutoExpose;
import dagger.Module;
import dagger.Provides;

@Module public class MainActivityModule{ // required to be in own class, and not as public static inner class because of a provideActivityFactory mis generation

	private MainActivity activity;
	public MainActivityModule(MainActivity a){activity = a;}

	@Provides @MainActivity.ActivityScope(MainActivity.class) @AutoExpose(MainActivity.class)
	public MainActivity provideActivity(){return activity;}

	@Provides(type = Provides.Type.MAP)
	@StringKey("theStringKey") Integer providetheStringKeysValue(){ return 2; }

	@Provides @MainActivity.ActivityScope(MainActivity.class)
	public Producer provideProducer(MainActivity activity){
		return new Producer(activity);
	}

//	@dagger.MembersInjector // not needed if you allow dagger to create the graph for you

//	@Provides public SomeInjectedType provideSomeInjectType(Map map){ return new SomeInjectedType(map); }

//	@Provides @MainActivity.ActivityScope(MainActivity.class) public MainActivity.ProvidedLazily provideProvidedLazy(){ return new MainActivity.ProvidedLazily(); }

} // @Provide may be swapped with a constructor @Inject if no external state is needed
