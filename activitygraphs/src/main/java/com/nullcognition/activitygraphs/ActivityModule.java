package com.nullcognition.activitygraphs;
// ersin 06/09/15 Copyright (c) 2015+ All rights reserved.

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule{

	private final Activity activity;
	public ActivityModule(Activity act){ activity = act;}

	@Provides @PerActivity Activity activity(){return activity;}
}
