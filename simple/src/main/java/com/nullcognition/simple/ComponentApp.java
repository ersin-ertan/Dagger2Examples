package com.nullcognition.simple;
// ersin 06/09/15 Copyright (c) 2015+ All rights reserved.


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ModuleApp.class)
public interface ComponentApp{

	void inject(App app);
	void inject(MainActivity mainActivity);

}
