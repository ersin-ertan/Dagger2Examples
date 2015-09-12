package com.nullcognition.practice01;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

public class UserManager{

	private ApiService apiService;
	public UserManager(ApiService apiService){this.apiService = apiService;}

	public String getUser(String username){ return apiService.getUser(username); }
}


class ApiService{

	String getUser(String username){return username;}
}


@Module class ApiModule{

//	@Provides @Singleton ApiService provideApiService(RestAdapter restAdapter){
//		return restAdapter.create(GithubApiService.class);
//	}

	@Provides
	@Singleton UserManager provideUserManager(ApiService apiService){ return new UserManager(apiService); }
}
