package com.nullcognition.gk5885;
// ersin 09/09/15 Copyright (c) 2015+ All rights reserved.

/*
	To reduce the boilerplate code required by Dagger2 when you have "empty" or simple components.
	It is usually the case in Android development.
*/


import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule{

	private final Activity activity;
	public ActivityModule(Activity act){activity = act;}

	@Provides Activity activity(){ return activity;}

}
