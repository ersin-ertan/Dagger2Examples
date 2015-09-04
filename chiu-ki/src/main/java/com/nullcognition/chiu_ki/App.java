package com.nullcognition.chiu_ki;
// ersin 03/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;


public class App extends Application{

	private GoogleComponent googleComponent;
	public void setGoogleComponent(GoogleComponent gc){ googleComponent = gc; }
	public GoogleComponent getGoogleComponent(){return googleComponent;}

	@Override public void onCreate(){
		super.onCreate();

		if(googleComponent == null){
			googleComponent = DaggerGoogleComponent.builder()
			                                       .apiModule(new ApiModule())
			                                       .build();
		}
	}
}
