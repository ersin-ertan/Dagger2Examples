package com.nullcognition.practice02.appclasses;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import javax.inject.Inject;

public abstract class AbstractClassWithConcreteInjectConstructor{

	int i = 1;
	public AbstractClassWithConcreteInjectConstructor(){}


	public static class ConcreteClassWithInjectConstructor extends AbstractClassWithConcreteInjectConstructor{

		int ii = 2;
		@Inject public ConcreteClassWithInjectConstructor(){}
	}
}
