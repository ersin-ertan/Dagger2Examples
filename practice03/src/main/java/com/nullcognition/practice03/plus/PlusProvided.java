package com.nullcognition.practice03.plus;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice03.plus.plustwo.PlusTwoScope;

import javax.inject.Inject;


//  @PlusScope cant have two scopes
//@PlusTwoScope // this @PlusTwoScope and @Inject don't mean anything because it is provided
// at a higher level scope but... see conclusion continuation
public class PlusProvided{

	public int i = 0;

	@Inject public PlusProvided(){i = 1;}
	public PlusProvided(int ii){i = ii;}
}
