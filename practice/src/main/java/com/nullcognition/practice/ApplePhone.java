package com.nullcognition.practice;
// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.


public class ApplePhone{

	public final   int id = ++count;
	private static int count = 0;

	public String getText(){return String.valueOf(id);}
}
