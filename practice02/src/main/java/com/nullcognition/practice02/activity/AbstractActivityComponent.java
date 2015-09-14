package com.nullcognition.practice02.activity;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Activity;

import dagger.Subcomponent;

@Subcomponent(modules = { ActivityModule.class }) public interface AbstractActivityComponent{

	Activity providedActivity();
}
