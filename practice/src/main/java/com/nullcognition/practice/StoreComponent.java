package com.nullcognition.practice;
// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.


public interface StoreComponent{

	void inject(MainActivity mainActivity);

	AndroidPhone provideAndroidPhone();
}
