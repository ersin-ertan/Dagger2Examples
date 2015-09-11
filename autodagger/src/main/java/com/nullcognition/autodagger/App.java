package com.nullcognition.autodagger;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;

import autodagger.AutoComponent;
import autodagger.AutoExpose;
import dagger.Provides;

@AutoComponent(modules = App.Module.class)
@AppScope(App.class)
public class App extends Application{

	private AppComponent component;
	public AppComponent getAppComponent(){return component;}

	@Override
	public void onCreate(){
		super.onCreate();

		component = DaggerAppComponent.create();
	}


	@dagger.Module
	public static class Module{

		@Provides
		@AutoExpose(App.class)
		@AppScope(App.class)
		public Provideable providesProvideable(){
			return new Provideable();
		}
	}
}


