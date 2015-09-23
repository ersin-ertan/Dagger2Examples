package com.nullcognition.practice04;
// ersin 15/09/15 Copyright (c) 2015+ All rights reserved.

import javax.inject.Inject;
import javax.inject.Named;

@ThirdBScope
public class InjectConst{

	public static int count = 0;
	public        int id    = count++;

	public String provide = "default";

//	@Inject public InjectConst(){
//		provide = "by Inject constructor ThirdBScope with id " + id;
//	}

	@Inject public InjectConst(@Named("2")AThirdBDependency aThirdBDependency){provide = "by Inject constructor ThirdBScope with id " + id + " and AThirdBDependency:" + aThirdBDependency.i;}

	public InjectConst(String in){
		provide = in + "with id " + id;
	}
}


