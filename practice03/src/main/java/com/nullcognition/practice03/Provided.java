package com.nullcognition.practice03;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import javax.inject.Inject;

public class Provided{

	public int i = 0;

	@Inject public Provided(){i = 1;}
	public Provided(int ii){i = ii;}
}
