package com.nullcognition.practice06;
// ersin 20/09/15 Copyright (c) 2015+ All rights reserved.


public class LazyObj{

	public int i = 0;
	public LazyObj lo;
	LazyObj(int ii){i = ii;}
	LazyObj(int ii, LazyObj lazyObj){
		i = ii;
		lo = lazyObj;
	}
}
