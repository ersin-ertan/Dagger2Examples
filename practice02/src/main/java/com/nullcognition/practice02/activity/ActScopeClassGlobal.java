package com.nullcognition.practice02.activity;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.

// this class is provided across the activity scope
public class ActScopeClassGlobal{

	private int externalSelectedActivity;
	public int getSelectedActivity(){return externalSelectedActivity; }
	public ActScopeClassGlobal(int ei){ externalSelectedActivity = ei;}
	public ActScopeClassGlobal(){}


}
