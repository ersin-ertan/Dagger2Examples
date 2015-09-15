package com.nullcognition.practice03;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;
import android.content.Context;

import com.nullcognition.practice03.activity.AppComponentEx;
import com.nullcognition.practice03.activity.AppModuleEx;
import com.nullcognition.practice03.activity.DaggerAppComponentEx;

/*
the goal of this module is to try to get extended components and modules to work
while providing 2 different scopes on the same object
*/


public class App extends Application{

	private AppComponent appComponent;
	public AppComponent getAppComponent(){ return appComponent; }

	@Override public void onCreate(){
		super.onCreate();

		appComponent = DaggerAppComponentEx.builder()
		                                   .appModuleEx(new AppModuleEx(this))
		                                   .build();
	}

	public static App get(Context context){ return (App) context.getApplicationContext();}
}
