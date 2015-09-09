package com.nullcognition.gk5885;
// ersin 09/09/15 Copyright (c) 2015+ All rights reserved.

import dagger.Component;

@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface MainActivityComponent extends Injector{

	MainActivity injectActivity(MainActivity activity);

}
