// Template example

//package com.nullcognition.autodagger;
//// ersin 09/09/15 Copyright (c) 2015+ All rights reserved.
//
//
//import android.app.Application;
//
//import javax.inject.Scope;
//
//import autodagger.AutoComponent;
//import autodagger.AutoExpose;
//import dagger.Module;
//import dagger.Provides;
//
//@AppScope(App.class) @AutoComponent(modules = App.AppModule.class)
//public class App extends Application{
//
//	private AppComponent appComponent;
//	public AppComponent getAppComponent(){return appComponent;}
//
//	@Override public void onCreate(){
//		super.onCreate();
//		if(appComponent == null){ appComponent = DaggerAppComponent.create();}
//	}
//
//	@Module public static class AppModule{
//
//		@Provides @AppScope(App.class) @AutoExpose(App.class)
//		public Provideable provideProvideable(){return new Provideable();}
//	}
//}
//
//@Scope
//@interface AppScope{
//
//	Class<?> value();
//}
