package com.nullcognition.practice05;
// ersin 15/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Activity;

import autodagger.AutoExpose;
import dagger.Module;
import dagger.Provides;

@Module public class MainActivityModule{ // required to be in own class, and not as public static inner class because of a provideActivityFactory mis generation

	private Activity activity;
	public MainActivityModule(Activity a){activity = a;}

	@Provides @MainActivity.ActivityScope(MainActivity.class) @AutoExpose(MainActivity.class)
	public Activity provideActivity(){return activity;}

//	@Provides @MainActivity.ActivityScope(MainActivity.class) public MainActivity.ProvidedLazily provideProvidedLazy(){ return new MainActivity.ProvidedLazily(); }

} // @Provide may be swapped with a constructor @Inject if no external state is needed
