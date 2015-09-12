package com.nullcognition.practice01;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;
import android.content.Context;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

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

	UserComponent userComponent;

	public UserComponent createUserComponent(String user){
		userComponent = appComponent.plus(new UserModule(user));
		return userComponent;
	}

	public void releaseUserComponent(){
		userComponent = null;
	}

	public UserComponent getUserComponent(){
		return userComponent;
	}
}


@Singleton @Module class AppModule{

	private Application application;

	public AppModule(Application application){ this.application = application; }

	@Provides @Singleton public Application provideApplication(){ return application; }

	@Provides @Singleton Classes.SomeManager provideSomeManager(){ return new Classes.SomeManager(application); }

	@Provides @Singleton Classes.SomeClass provideSomeClass(){return new Classes.SomeClass();}
}


@Singleton @Component(modules = { AppModule.class, ApiModule.class }) interface AppComponent{

	MainActivityComponent plus(MainActivityModule mainActivityModule);

	UserComponent plus(UserModule userModule);


}


@Singleton @Module class UserModule{

	private String user;
	public UserModule(String user){this.user = user;}

	@Provides @UserScope String provideUser(){return user;}

	@Provides @UserScope Classes.SomeDeeperManager provideManager(String user, ApiService apiService){
		return new Classes.SomeDeeperManager(user, apiService);
	}
}


@UserScope @Subcomponent(modules = UserModule.class) interface UserComponent{

	AnotherActivityComponent plus(AnotherActivityModule anotherActivityModule);

}


@Scope @Retention(RetentionPolicy.RUNTIME) @interface UserScope{ }
