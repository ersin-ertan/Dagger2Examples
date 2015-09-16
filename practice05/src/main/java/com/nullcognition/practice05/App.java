package com.nullcognition.practice05;

import android.app.Application;
import android.content.Context;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

import autodagger.AutoComponent;
import autodagger.AutoExpose;
import dagger.Module;
import dagger.Provides;

@App.AppScope(App.class) @AutoComponent(modules = App.AppModule.class)
public class App extends Application{

	private AppComponent app;
	public AppComponent getAppComponent(){return app;}

	@Override public void onCreate(){
		super.onCreate();
		if(app == null){
			app = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
		}
	}

	public static App get(Context context){return (App) context.getApplicationContext();}

	@Module public static class AppModule{

		private Application application;
		AppModule(Application a){application = a;}

		@Provides @AppScope(App.class) @AutoExpose(App.class)
		public Application provideApplication(){return new Application();}
	} // @Provide may be swapped with a constructor @Inject if no external state is needed


	@Scope @Retention(RetentionPolicy.RUNTIME) public @interface AppScope{

		Class<?> value();
	}

}


