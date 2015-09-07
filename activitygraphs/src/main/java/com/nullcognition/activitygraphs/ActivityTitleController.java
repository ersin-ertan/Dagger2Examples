package com.nullcognition.activitygraphs;
// ersin 06/09/15 Copyright (c) 2015+ All rights reserved.

import android.app.Activity;

import javax.inject.Inject;

@PerActivity
public class ActivityTitleController{

	private final Activity activity;
	@Inject public ActivityTitleController(Activity act){ activity = act;}

	public void setTitle(CharSequence title){activity.setTitle(title);}
}
