package com.nullcognition.practice02.appclasses;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


public class Caser{

	private final boolean isCaps;
	public Caser(boolean ic){ isCaps = ic;}

	public String caseMe(String s){ return isCaps ? s.toUpperCase() : s.toLowerCase(); }

}
