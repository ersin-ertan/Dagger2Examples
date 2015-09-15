package com.nullcognition.practice03;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice03.activity.AppModuleEx;
import com.nullcognition.practice03.activity.MainActivity;

import dagger.Component;

@AppScope @Component(modules = AppModuleEx.class)
public interface AppComponent{

	// using this a the injection for main activity will not provide an application from the AppModule
//	void inject(Activity activity);

	// must be type specific
	void inject(MainActivity mainActivity);
}

