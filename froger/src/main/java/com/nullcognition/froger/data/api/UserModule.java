//package com.nullcognition.froger.data.api;
//// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.
//
//import com.nullcognition.froger.data.UserScope;
//import com.nullcognition.froger.data.model.User;
//
//import dagger.Module;
//import dagger.Provides;
//
//@Module
//public class UserModule{
//
//	private User user;
//	public UserModule(User us){user = us;}
//
//	@Provides @UserScope User provideUser(){ return user;}
//
//	@Provides @UserScope RepositoriesManager provideRepositoriesManager(User user, GithubApiService githubApiService){
//		return new RepositoriesManager(user, githubApiService);
//	}
//}
