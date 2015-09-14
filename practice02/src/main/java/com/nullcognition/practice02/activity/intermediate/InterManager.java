package com.nullcognition.practice02.activity.intermediate;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice02.activity.ActScopeClass;

public class InterManager{

	// actscopeclass is a external state holder
	private ActScopeClass actScopeClass;
	public InterManager(ActScopeClass actScopeClass){this.actScopeClass = actScopeClass;}

	public int getSelectedActivity(){ return actScopeClass.getSelectedActivity(); }
}
