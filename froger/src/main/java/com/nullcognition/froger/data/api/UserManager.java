//package com.nullcognition.froger.data.api;
//// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.
//
//
//import android.database.Observable;
//
//import com.nullcognition.froger.data.model.User;
//
//public class UserManager{
//
//	private GithubApiService githubApiService;
//
//	public UserManager(GithubApiService githubApiService) {
//		this.githubApiService = githubApiService;
//	}
//
//	public Observable<User> getUser(String username) {
//		return githubApiService.getUser(username)
//		                       .map(new Func1<UserResponse, User>() {
//			                       @Override
//			                       public User call(UserResponse userResponse) {
//				                       User user = new User();
//				                       user.login = userResponse.login;
//				                       user.id = userResponse.id;
//				                       user.url = userResponse.url;
//				                       user.email = userResponse.email;
//				                       return user;
//			                       }
//		                       })
//		                       .subscribeOn(Schedulers.io())
//		                       .observeOn(AndroidSchedulers.mainThread());
//	}
//}
