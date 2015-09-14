package com.nullcognition.practice02.activity.activity02;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice02.activity.AbstractActivityComponent;

import dagger.Subcomponent;

@Subcomponent(modules = Activity02Module.class) public interface Scope02ActivityComponent extends AbstractActivityComponent{

	void inject(Activity02 activit02);
}
