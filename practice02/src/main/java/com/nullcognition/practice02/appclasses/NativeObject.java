package com.nullcognition.practice02.appclasses;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import javax.inject.Inject;

public class NativeObject{

	private int i = 1;

	@Inject public NativeObject(){}

	public int method(int in){ return in + i; }
}
