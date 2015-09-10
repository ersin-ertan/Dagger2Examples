package com.nullcognition.autodagger;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.

import android.app.Activity;
import android.os.Bundle;

import autodagger.AutoInjector;

@AutoComponetedAnnotation
@AutoInjector
@AppScope(AbstractActivity.class)
public abstract class AbstractActivity extends Activity{

	protected AbstractActivityComponent abstractActivityComponent;

	@Override protected void onCreate(final Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		if(abstractActivityComponent == null){
			abstractActivityComponent = DaggerAbstractActivityComponent.builder()
					.appComponent(((App) getApplication()).getAppComponent())
					.build();
		}
		abstractActivityComponent.inject(this);
	}
}
