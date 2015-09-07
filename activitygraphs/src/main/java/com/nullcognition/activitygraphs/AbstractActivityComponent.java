package com.nullcognition.activitygraphs;
// ersin 06/09/15 Copyright (c) 2015+ All rights reserved.

import android.app.Activity;

import dagger.Component;

@PerActivity
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface AbstractActivityComponent{

	Activity activity();
}
