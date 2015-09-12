package com.nullcognition.practice01.anotheractivity;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice01.mainactivity.ActivityScope;
import com.nullcognition.practice01.user.UserManager;

import dagger.Module;
import dagger.Provides;

@Module public class AnotherActivityModule{

	private AnotherActivity anotherActivity;

	public AnotherActivityModule(AnotherActivity anotherActivity){ this.anotherActivity = anotherActivity;}

	@ActivityScope @Provides AnotherActivity provideAnotherActivity(){ return anotherActivity; }

	@ActivityScope @Provides AnotherActivityPresenter provideAnotherActivityPresenter(UserManager userManager){
		return new AnotherActivityPresenter(anotherActivity, userManager);
	}
}
