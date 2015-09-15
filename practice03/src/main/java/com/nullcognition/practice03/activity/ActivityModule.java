package com.nullcognition.practice03.activity;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module public class ActivityModule{

	private Activity activity;
	public ActivityModule(Activity a){activity = a;}

	@Provides @ActivityScope public Activity provideActivity(){return activity;}


}
