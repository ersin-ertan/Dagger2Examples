package com.nullcognition.practice01.anotheractivity;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice01.mainactivity.ActivityScope;

import dagger.Subcomponent;

@ActivityScope @Subcomponent(modules = AnotherActivityModule.class)
public interface AnotherActivityComponent{

	void inject(AnotherActivity anotherActivity);

	AnotherActivityPresenter AnotherActivityPresenter();
}

