package com.nullcognition.gk5885;
// ersin 09/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;

public class App extends Application{

	private AppComponent component;
	public AppComponent getComponent(){return component;}


	@Override public void onCreate(){
		super.onCreate();

		this.component = DaggerAppComponent.builder()
		                                   .appModule(new AppModule(this))
		                                   .build();
		component.injectApp(this);
	}
}
