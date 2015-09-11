package com.nullcognition.subcomponents;

import android.app.Application;
import android.content.Context;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import autodagger.AutoComponent;
import dagger.Module;
import dagger.Provides;

// follows a similar structure to https://github.com/frogermcs/GithubClient

@AppScope(App.class) @AutoComponent(modules = { App.AppModule.class, ApiModule.class }, superinterfaces = SubComponentPlus.class)
public class App extends Application{

	private AppComponent appComponent;
	public AppComponent getAppComponent(){return appComponent;}

	private User.UserComponent userComponent;
	public User.UserComponent getUserComponent(){return userComponent;}

	public User.UserComponent createUserComponent(User user){
		userComponent = appComponent.plus(new User.UserModule(user));
		return userComponent;
	}
	public void releaseUserComponent(){userComponent = null;}

	@Override public void onCreate(){
		super.onCreate();
		if(appComponent == null){
			appComponent = DaggerAppComponent.builder()
			                                 .appModule(new AppModule(this))
			                                 .build();
		}
	}

	public static App get(Context context) {
		return (App) context.getApplicationContext();
	}


	@Module public static class AppModule{

		private Application application;
		public AppModule(Application application){this.application = application;}

		@Provides @AppScope(App.class)
		public Application provideApplication(){return application;}
	}
}


@Scope @Retention(RetentionPolicy.RUNTIME) @interface AppScope{

	Class<?> value();
}
