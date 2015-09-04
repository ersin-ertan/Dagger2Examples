package com.nullcognition.practice;
// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.

import javax.inject.Singleton;

@Singleton
public class AndroidPhone{

	public final int id = ++count;
	private static int count = 0;

	public String callFriend(){return String.valueOf(id);}

}


