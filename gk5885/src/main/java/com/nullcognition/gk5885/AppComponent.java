package com.nullcognition.gk5885;
// ersin 09/09/15 Copyright (c) 2015+ All rights reserved.

import dagger.Component;

@Component(modules = AppModule.class)
public interface AppComponent{

	App injectApp(App app);
}
