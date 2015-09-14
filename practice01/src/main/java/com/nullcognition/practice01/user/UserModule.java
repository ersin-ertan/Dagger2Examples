package com.nullcognition.practice01.user;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice01.Classes;
import com.nullcognition.practice01.api.ApiService;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Singleton @Module public class UserModule{

	private String user; // a primitive does not work, as it must be passed to the provideManager my class type
	// via the previout provideUser
	public UserModule(String user){this.user = user;}

	@Provides @UserScope String provideUser(){return user;}

	@Provides @UserScope Classes.SomeDeeperManager provideManager(String user, ApiService apiService){
		return new Classes.SomeDeeperManager(user, apiService);
	}
}
