package com.nullcognition.practice04;
// ersin 15/09/15 Copyright (c) 2015+ All rights reserved.

import javax.inject.Inject;

@ThirdBScope
public class InjectConst{

	public static int count = 0;
	public        int id    = count++;

	public String provide = "default";

	@Inject public InjectConst(){
		provide = "by Inject constructor ThirdBScope with id " + id;
	}

	public InjectConst(String in){
		provide = in + "with id " + id;}
}


