package com.nullcognition.practice01;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

public class App extends Application{

	public static App get(Context context){ return (App) context.getApplicationContext(); }

	AppComponent appComponent;
	public AppComponent getAppComponent(){ return appComponent; }

	@Override public void onCreate(){
		super.onCreate();

		appComponent = DaggerAppComponent.builder()
		                                 .appModule(new AppModule(this))
		                                 .build();
	}

//	UserComponent userComponent;
//
//	public UserComponent createUserComponent(User user){
//		userComponent = appComponent.plus(new UserModule(user));
//		return userComponent;
//	}
//
//	public void releaseUserComponent(){
//		userComponent = null;
//	}
//
//	public UserComponent getUserComponent(){
//		return userComponent;
//	}
}


@Singleton @Module class AppModule{

	private Application application;

	public AppModule(Application application){ this.application = application; }

	@Provides @Singleton public Application provideApplication(){ return application; }

	@Provides @Singleton Classes.SomeManager provideSomeManager(){ return new Classes.SomeManager(application); }

	@Provides @Singleton Classes.SomeClass provideSomeClass(){return new Classes.SomeClass();}
}


@Singleton @Component(modules = AppModule.class) interface AppComponent{

	MainActivityComponent plus(MainActivityModule mainActivityModule);

}
