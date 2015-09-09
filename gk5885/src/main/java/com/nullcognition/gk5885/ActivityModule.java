package com.nullcognition.gk5885;
// ersin 09/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule{

	private final Activity activity;
	public ActivityModule(Activity act){activity = act;}

	@Provides Activity activity(){ return activity;}

}
