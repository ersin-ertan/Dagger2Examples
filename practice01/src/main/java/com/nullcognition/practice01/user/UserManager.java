package com.nullcognition.practice01.user;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice01.api.ApiService;

public class UserManager{

	private ApiService apiService;
	public UserManager(ApiService apiService){this.apiService = apiService;}

	public String getUser(String username){ return apiService.getUser(username); }
}
