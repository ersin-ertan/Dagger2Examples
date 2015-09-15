package com.nullcognition.practice04;
// ersin 15/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;
import android.content.Context;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

// properly showcases the 2 instances of an object from different components under different scopes

public class App extends Application{

	private AppComponent appComponent;
	public AppComponent getAppComponent(){ return appComponent; }

	@Override public void onCreate(){
		super.onCreate();

		appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
	}

	public static App get(Context context){ return (App) context.getApplicationContext(); }


}


@Scope @Retention(RetentionPolicy.RUNTIME) @interface AppScope{ }


@Component(modules = AppModule.class) @AppScope interface AppComponent{

	void inject(App app);
	Application getApplication();
}


@Module class AppModule{

	private Application application;
	public AppModule(Application a){application = a;}

	@Provides @AppScope Application provideApplication(){ return application;}
}
