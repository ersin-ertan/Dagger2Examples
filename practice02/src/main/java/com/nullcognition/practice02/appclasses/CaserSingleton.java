package com.nullcognition.practice02.appclasses;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


public class CaserSingleton{

	// safe as static, is a singleton
	private static int switchCount;
	public int getSwitchCount(){ return switchCount;}

	private boolean isCaps;
	public CaserSingleton(boolean ic){ isCaps = ic;}

	public String caseMe(String s){ return isCaps ? s.toUpperCase() : s.toLowerCase(); }

	public void setCase(boolean ic){
		if(ic != isCaps){ ++switchCount; }
		isCaps = ic;
	}
}
