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

//	public void onShowRepositoriesClick(){
//		if(someClass.validUsername(username)){
//			mainActivity.showLoading(true);
//			userManager.getUser(username).subscribe(new SimpleObserver<User>(){
//				@Override
//				public void onNext(User user){
//					mainActivity.showLoading(false);
//					mainActivity.showRepositoriesListForUser(user);
//				}
//
//				@Override
//				public void onError(Throwable e){
//					mainActivity.showLoading(false);
//					mainActivity.showValidationError();
//				}
//			});
//		}
//		else{
//			mainActivity.showValidationError();
//		}
//	}
}
