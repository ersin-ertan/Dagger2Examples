package com.nullcognition.autodagger;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.


import android.os.Bundle;

public class Activity04 extends AbstractActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		// do this here, or in the base class
		abstractActivityComponent = DaggerAbstractActivityComponent.builder()
		                                                           .appComponent(((App) getApplication()).getAppComponent())
		                                                           .build();
		abstractActivityComponent.inject(this);
	}
}
