package com.nullcognition.practice02.activity;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


public class ActScopeClass{

	private int externalSelectedActivity;
	public int getSelectedActivity(){return externalSelectedActivity; }
	public ActScopeClass(int ei){ externalSelectedActivity = ei;}
	public ActScopeClass(){}
}
