package com.nullcognition.autodagger;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.

import android.app.Activity;
import android.os.Bundle;

@AutoComponentedAnnotation2 @AppScope(Activity05.class)
public class Activity05 extends Activity{

	private Activity05Component component;

	@Override protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		component = DaggerActivity05Component.builder()
		                                     .appComponent(((App) getApplication()).getAppComponent())
		                                     .build();
		component.inject(this);
	}
}
