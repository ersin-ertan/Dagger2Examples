package com.nullcognition.practice03;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module public class AppModule{

	protected Application application;
	public AppModule(Application a){application = a;}

//	@Provides @AppScope public Application provideApplication(){return application;}
}

// extending the module requires a change in both the AppComponent, and in the app component builder()

// todo now provide a class with two different scopes, then change it to have an @Inject constructor
