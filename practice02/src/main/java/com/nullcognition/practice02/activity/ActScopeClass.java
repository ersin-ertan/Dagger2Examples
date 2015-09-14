package com.nullcognition.practice02.activity;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice02.activity.activity01.ActivityScope01;

import javax.inject.Inject;

// this class is provided twice, across activityscope01 and 02 via an @Injects constructor and an @Provided with
// a constructor argument

@ActivityScope01
public class ActScopeClass{

	private int externalSelectedActivity = 1;
	public int getSelectedActivity(){return externalSelectedActivity; }
	public ActScopeClass(int ei){ externalSelectedActivity = ei;}
	@Inject public ActScopeClass(){}
}
