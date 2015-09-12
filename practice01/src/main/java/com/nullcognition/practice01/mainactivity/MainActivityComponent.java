package com.nullcognition.practice01.mainactivity;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import dagger.Subcomponent;

@ActivityScope @Subcomponent(modules = MainActivityModule.class) public interface MainActivityComponent{

	void inject(MainActivity mainActivity);

	MainActivityPresenter mainActivityPresenter();
}
