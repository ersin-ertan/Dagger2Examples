package com.nullcognition.practice05;
// ersin 16/09/15 Copyright (c) 2015+ All rights reserved.


import java.util.Map;

import javax.inject.Inject;

@MainActivity.ActivityScope(MainActivity.class)
public class SomeInjectedType{

	public Map map;
	@Inject public SomeInjectedType(Map m){ map = m;}

	public Integer getValueFromMap(String key){ return (Integer) map.get(key); }
	// because the value is an Integer
}
//Error:Execution failed for task ':practice05:compileDebugJavaWithJavac'.
//		> java.lang.IndexOutOfBoundsException: Index: 1, Size: 0
