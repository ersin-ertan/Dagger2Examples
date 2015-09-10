package com.nullcognition.autodagger;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Named;

import autodagger.AutoComponent;
import autodagger.AutoExpose;
import autodagger.AutoInjector;
import dagger.Module;
import dagger.Provides;

@AutoComponent(
		modules = { Activity01.ModuleOne.class, Activity01.ModuleTwo.class },
		dependencies = App.class,
		superinterfaces = { DependencyOne.class, DependencyTwo.class }
)
@AutoInjector @AppScope(Activity01.class)
public class Activity01 extends Activity{

	private Activity01Component component;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		if(component == null){
			component = DaggerActivity01Component.builder()
			                                     .appComponent(((App) getApplication()).getAppComponent())
			                                     .moduleOne(new ModuleOne())
			                                     .moduleTwo(new ModuleTwo())
			                                     .build();
		}
		component.inject(this);
	}

	@Module
	public static class ModuleOne{

		@Provides @AppScope(Activity01.class)
		public MyObject01<String, String> providesMyObject01(){return new MyObject01<>();}

		@Provides @AppScope(Activity01.class)
		public MyObject02 providesMyObject02(){return new MyObject02<>();}

		@Provides @AppScope(Activity01.class) @Named("1") @AutoExpose(Activity01.class)
		public MyObject03 providesMyObject03Qualifier01(){return new MyObject03();}

		@Provides @AppScope(Activity01.class) @Named("2") @AutoExpose(Activity01.class)
		public MyObject03 providesMyObject03Qualifier02(){return new MyObject03();}
	}


	@Module
	public static class ModuleTwo{ }
}









