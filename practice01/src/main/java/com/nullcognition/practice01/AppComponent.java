package com.nullcognition.practice01;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice01.api.ApiModule;
import com.nullcognition.practice01.mainactivity.MainActivityComponent;
import com.nullcognition.practice01.mainactivity.MainActivityModule;
import com.nullcognition.practice01.user.UserComponent;
import com.nullcognition.practice01.user.UserModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton @Component(modules = { AppModule.class, ApiModule.class })
public interface AppComponent{

	MainActivityComponent plus(MainActivityModule mainActivityModule);

	UserComponent plus(UserModule userModule);
}
