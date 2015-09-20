package com.nullcognition.practice06;

import android.app.Application;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Named;
import javax.inject.Scope;

import dagger.Component;

public class App extends Application{

	private AppComponent app;
	public AppComponent getAppComponent(){return app;}

	@Override public void onCreate(){
		super.onCreate();
		if(app == null){app = DaggerApp_AppComponent.create();}
	}


	@Scope @Retention(RetentionPolicy.RUNTIME) public @interface AppScope{ }


	@Component(modules = AppModule.class) @App.AppScope public interface AppComponent{

		void inject(MainActivity mainActivity);
		void  inject(CacheCheck cacheCheck);

		@Named("2") LazyObj lazyObj();
	}

}



