package com.nullcognition.practice01;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


public class MainActivityPresenter{

	public String username;

	private MainActivity      mainActivity;
	private Classes.SomeClass someClass;
	private UserManager       userManager;

	public MainActivityPresenter(MainActivity mainActivity, Classes.SomeClass someClass, UserManager userManager){
		this.mainActivity = mainActivity;
		this.someClass = someClass;
		this.userManager = userManager;
	}

	public void onShowReposClick(){
		int i = 1;
		if(someClass.method(i) == i){
			mainActivity.showLoading(true);
			userManager.getUser(username);
			// arbitrary method calls
			mainActivity.showLoading(false);
			mainActivity.showValidationError();
			mainActivity.showReposForUser(username);
		}
	}
}
