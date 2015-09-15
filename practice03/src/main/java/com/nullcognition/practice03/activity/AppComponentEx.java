package com.nullcognition.practice03.activity;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice03.AppComponent;
import com.nullcognition.practice03.AppScope;
import com.nullcognition.practice03.plus.PlusComponent;
import com.nullcognition.practice03.plus.PlusModule;

import dagger.Component;

@AppScope @Component(modules = AppModuleEx.class)
public interface AppComponentEx extends AppComponent{

	// using this a the injection for main activity will not provide an application from the AppModule
//	void inject(Activity activity);

	// must be type specific
	void inject(MainActivity mainActivity);

	PlusComponent plus(PlusModule plusModule);

}
