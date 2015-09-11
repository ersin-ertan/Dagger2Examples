package com.nullcognition.autodagger;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Activity;
import android.os.Bundle;

import autodagger.AutoInjector;

@AutoComponentedAnnotation
@AutoInjector
@AppScope(Activity03.class)
public class Activity03 extends Activity{

	private Activity03Component component;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);


		component = DaggerActivity03Component.builder()
		                                     .appComponent(((App) getApplication()).getAppComponent())
		                                     .build();
		component.inject(this);
	}
}
