package com.nullcognition.practice03;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;
import android.content.Context;

import com.nullcognition.practice03.activity.AppComponentEx;
import com.nullcognition.practice03.activity.AppModuleEx;
import com.nullcognition.practice03.activity.DaggerAppComponentEx;
import com.nullcognition.practice03.plus.PlusComponent;
import com.nullcognition.practice03.plus.PlusModule;
import com.nullcognition.practice03.plus.plustwo.PlusTwoComponent;
import com.nullcognition.practice03.plus.plustwo.PlusTwoModule;

/*
the goal of this module is to try to get extended components and modules to work
while providing 2 different scopes on the same object

conclusion - whenever an object is bound, its most root binding will take precedence, no matter the @Provides or class annotations from
other sub components, you will be stopped if a component references bindings with a different scope, there is no inheritance from
the components with regards to scope overriding, which is not to be confused with subcomponents being able access parents bindings.
A bound provided object will only be able to be provided at its highest scope no matter the access, @Inject or exposed.

Continuation - test this with use of components and dependencies instead of subcomponents.
explore both subcomp and component based structure when a root @Provides providing component is released and a plus component is added which makes use of
the @Inject constructor, which should work because @ClassScope annotating the class will not affect the @Provides @TopScope

*/


public class App extends Application{

	private AppComponent appComponent;
	public AppComponent getAppComponent(){ return appComponent; }

	private PlusComponent plusComponent;
	public PlusComponent getPlusComponent(){ return plusComponent; }

	public void releasePlusComponent(){ plusComponent = null; }
	public PlusComponent createPlusComponent(){
		plusComponent = ((AppComponentEx)appComponent).plus(new PlusModule());
		return plusComponent;
	}

	private PlusTwoComponent plusTwoComponent;
	public PlusTwoComponent getPlusTwoComponent(){ return plusTwoComponent; }

	public void releasePlusTwoComponent(){ plusTwoComponent = null; }
	public PlusTwoComponent createPlusTwoComponent(){
		plusTwoComponent = plusComponent.plus(new PlusTwoModule());
		return plusTwoComponent;
	}

	@Override public void onCreate(){
		super.onCreate();

		appComponent = DaggerAppComponentEx.builder()
		                                   .appModuleEx(new AppModuleEx(this))
		                                   .build();
	}

	public static App get(Context context){ return (App) context.getApplicationContext();}
}
