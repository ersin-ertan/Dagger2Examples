package com.nullcognition.practice02.activity.activity01;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice02.activity.AbstractActivityComponent;

import dagger.Subcomponent;

@ActivityScope01 @Subcomponent(modules = { Activity01Module.class })
public interface Scope01ActivityComponent extends AbstractActivityComponent{

	void inject(Activity01 activit01);
}
