package com.nullcognition.practice01.api;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice01.user.UserManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module public class ApiModule{

	@Provides @Singleton ApiService provideApiService(){
		return new ApiService();
	}

	@Provides
	@Singleton UserManager provideUserManager(ApiService apiService){ return new UserManager(apiService); }
}
