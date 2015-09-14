package com.nullcognition.practice02.app;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;
import android.content.Context;

import com.nullcognition.practice02.activity.intermediate.InterComponent;
import com.nullcognition.practice02.activity.intermediate.InterModule;


public class App extends Application{

	private AppComponent appComponent;
	public AppComponent getAppComponent(){ return appComponent; }

	@Override public void onCreate(){
		super.onCreate();
		if(appComponent == null){
			appComponent = DaggerAppComponent.builder()
			                                 .appModule(new AppModule(this))
			                                 .globallyNeededModule(new GloballyNeededModule(true))
			                                 .build();
		}
	}

	InterComponent intermediateComponent;
	public InterComponent getIntermediateComponent(){ return intermediateComponent;}

	//	// plus the subcomponent
	public InterComponent createInterComponent(int external){
		intermediateComponent = appComponent.plusInter(new InterModule(external));
		return intermediateComponent;
	}

	public void releaseInterComponent(){ intermediateComponent = null; }

	public static App get(Context c){return (App) c.getApplicationContext();}
}

