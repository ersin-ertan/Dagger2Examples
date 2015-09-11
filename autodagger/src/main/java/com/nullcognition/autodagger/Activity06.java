package com.nullcognition.autodagger;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.

import android.app.Activity;
import android.os.Bundle;

import autodagger.AutoComponent;
import autodagger.AutoInjector;

@AutoComponent(
		modules = Activity06.Module.class,
		includes = AutoComponentedAnnotation.class)
@AppScope(Activity06.class)
@AutoInjector
public class Activity06 extends Activity{

	private Activity06Component component;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		component = DaggerActivity06Component.builder()
		                                     .appComponent(((App) getApplication()).getAppComponent())
		                                     .build();
		component.inject(this);
	}

	@dagger.Module
	public static class Module{

	}
}
