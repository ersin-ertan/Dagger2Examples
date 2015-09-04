package com.nullcognition.froger.utils;
// ersin 03/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;

public class AnalyticsManager{

	private Application app;

	public AnalyticsManager(Application app){ this.app = app; }

	public void logScreenView(String screenName){
//		Timber.d("Logged screen name: " + screenName);
	}
}
