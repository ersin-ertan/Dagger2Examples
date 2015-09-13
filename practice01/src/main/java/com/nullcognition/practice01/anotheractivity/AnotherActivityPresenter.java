package com.nullcognition.practice01.anotheractivity;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice01.user.UserManager;

public class AnotherActivityPresenter{

	private AnotherActivity anotherActivity;
	private UserManager     userManager;

	public AnotherActivityPresenter(AnotherActivity repositoriesListActivity, UserManager repositoriesManager){
		this.anotherActivity = repositoriesListActivity;
		this.userManager = repositoriesManager;
	}

	public String method(String s){return s;}

}
