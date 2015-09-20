package com.nullcognition.practice06;
// ersin 20/09/15 Copyright (c) 2015+ All rights reserved.


import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Named;

public class CacheCheck{

	// trying to recall the lazyObj2 instantiation, but can't thus there is no reason to do logic after the cache

	@Inject @Named("2") public LazyObj lazyObj;

	public CacheCheck(MainActivity mainActivity){
		((App) mainActivity.getApplication()).getAppComponent().inject(this);
		Toast.makeText(mainActivity, "CacheChecks lazyObj 2 i value:" + String.valueOf(lazyObj.i), Toast.LENGTH_SHORT).show();
	}
}
