package com.nullcognition.practice02.activity.intermediate;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice02.activity.AbstractActivityComponent;
import com.nullcognition.practice02.activity.ActivityModule;
import com.nullcognition.practice02.activity.ActivityScope;
import com.nullcognition.practice02.activity.activity01.Activity01Module;

import dagger.Subcomponent;

@ActivityScope @Subcomponent(modules = InterModule.class) public interface InterComponent{

//	AbstractActivityComponent plusActivity(ActivityModule activityModule);
	AbstractActivityComponent plusActivity01(Activity01Module activity01Module);
}
