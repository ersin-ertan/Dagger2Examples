package com.nullcognition.autodagger;
// ersin 09/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;

import javax.inject.Singleton;

import autodagger.AutoComponent;

@AutoComponent
@Singleton
public class App extends Application{

}

// will generate
/*
@Component
@Singleton
public interface ExampleApplicationComponent { }
*/
