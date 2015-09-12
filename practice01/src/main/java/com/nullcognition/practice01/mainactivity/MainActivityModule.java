package com.nullcognition.practice01.mainactivity;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice01.Classes;
import com.nullcognition.practice01.user.UserManager;

import dagger.Module;
import dagger.Provides;

@Module public class MainActivityModule{

	private MainActivity mainActivity;

	public MainActivityModule(MainActivity mainActivity){
		this.mainActivity = mainActivity;
	}

	@Provides @ActivityScope MainActivity provideMainActivity(){ return mainActivity; }

	@Provides
	@ActivityScope MainActivityPresenter provideMainActivityPresenter(Classes.SomeClass someClass, UserManager userManager){
		return new MainActivityPresenter(mainActivity, someClass, userManager);
	}
}
