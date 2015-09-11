package com.nullcognition.subcomponents;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.

import dagger.Component;

@AppScope(App.class) @Component(modules = User.UserModule.class)
public interface SubComponentPlus{

	User.UserComponent plus(User.UserModule userModule);

	SplashActivity.SplashActivityComponent plus(SplashActivity.SplashActivityModule splashActivityModule);
}
