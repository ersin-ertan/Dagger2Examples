package com.nullcognition.practice04;
// ersin 15/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Activity;
import android.app.Application;
import android.widget.Toast;

import javax.inject.Inject;

public class Child{

	@Inject Application application;

	public Child(Activity activity){

		// like the fragments ability to getActivity(), we must get the activity to get the component
		// to inject into
		if(activity instanceof MainActivity){
			((MainActivity) activity).getActivityComponent().inject(this);
			// once injected, it populates an object provided by the activityModule, or exposed by the application
			// component
		}

		if(application != null){
			Toast.makeText(activity, "From child, application value injected", Toast.LENGTH_LONG).show();
		}
		// because it was exposed with Application application();
	}
}
