package com.nullcognition.practice02.app;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;

import com.nullcognition.practice02.activity.Activity00;
import com.nullcognition.practice02.activity.ActivityModule;
import com.nullcognition.practice02.activity.activity01.Scope01ActivityComponent;
import com.nullcognition.practice02.activity.intermediate.InterComponent;
import com.nullcognition.practice02.activity.intermediate.InterModule;
import com.nullcognition.practice02.appclasses.Caser;

import dagger.Component;

@AppScope
@Component(modules = { AppModule.class, GloballyNeededModule.class })
public interface AppComponent{

	void inject(Activity00 activity00);

	// exposed at runtime, no need to @Inject, accessed via ((App)getApplication).whatever();
	// normal syntax is 'caser' but provided is more descriptive for me as it refers to the object being
	// injectable and thus annotated with @Provides/@Inject constructor
	Caser providedCaser();

	// generic type returned, and stored in module, why explained in AbstractActivityComponent
	Application getApplication();

	// gives the ability for the appcomponent to add the subcomponent, which in turn can add its own subcomponent
	InterComponent plusInter(InterModule interModule);

}
