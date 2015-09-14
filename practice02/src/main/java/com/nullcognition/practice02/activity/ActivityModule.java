package com.nullcognition.practice02.activity;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Activity;

import dagger.Module;
import dagger.Provides;

@Module public class ActivityModule{

	protected       int      externalInt; // can be safely ignored
	protected final Activity activity;
	public ActivityModule(Activity a, int ei){
		activity = a;
		externalInt = ei;
		// we assume that ei will be null at 0, because activity01 module does not take in
		// an external int, its super passed value is hard coded to 1/or some neutral default
		// by doing this, we can move the @Provides into the ActivityModule, however
		// you no longer reside in the individual activities scope, but instead exist in the
		// activityScope

		// you must also be careful not to depend on the externalInt value prior to creating
		// the activity specific module, which initializes the value, thus it could be
		// considered safe to move it back to the childrens implementation at the cost of
		// another line of code
	}

	// @Provides @ActivityScope public ActScopeClass provideActScopeClass(){ return new ActScopeClass(externalInt);}

	@Provides public Activity provideActivity(){ return activity;}

}
