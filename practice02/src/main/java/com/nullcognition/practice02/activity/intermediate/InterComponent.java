package com.nullcognition.practice02.activity.intermediate;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice02.activity.ActivityScope;
import com.nullcognition.practice02.activity.activity01.Activity01Module;
import com.nullcognition.practice02.activity.activity01.Scope01ActivityComponent;
import com.nullcognition.practice02.activity.activity02.Activity02Module;
import com.nullcognition.practice02.activity.activity02.Scope02ActivityComponent;

import dagger.Subcomponent;

@ActivityScope @Subcomponent(modules = InterModule.class) public interface InterComponent{

//  does not work both the return and the input type are generalized
//	AbstractActivityComponent plusActivity(ActivityModule activityModule);

//	does not work,
//  AbstractActivityComponent plusActivity01(Activity01Module activityModule);

	// both return and input arg must be type specific
	Scope01ActivityComponent plusActivity01(Activity01Module activityModule);

	Scope02ActivityComponent plusActivity02(Activity02Module activityModule);

}
