//package com.nullcognition.froger;
//// ersin 03/09/15 Copyright (c) 2015+ All rights reserved.
//
//
//import android.app.Application;
//import android.content.Context;
//
//public class GithubClientApplication extends Application{
//
//	private AppComponent appComponent;
//	public AppComponent getAppComponent(){ return appComponent; }
//
//	private UserComponent userComponent;
//	public UserComponent getUserComponent(){ return userComponent; }
//
//	public void releaseUserComponent(){ userComponent = null; }
//	public UserComponent createUserComponent(User user){
//		userComponent = appComponent.addToGraph(new UserModule(user));
//		return userComponent;
//	}
//
//	@Override public void onCreate(){
//		super.onCreate();
//
//		// component = DaggerComponentName.builder().componentName(new Module()).build();
//		appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
//		// AppModule take this as an argument
//
//	}
//
//	public static GithubClientApplication get(Context context){
//		return (GithubClientApplication) context.getApplicationContext();
//		// replacement for ((GithubClientApplication)getApplication())  <---    getGoogleComponent().inject(this);
//	}
//}
