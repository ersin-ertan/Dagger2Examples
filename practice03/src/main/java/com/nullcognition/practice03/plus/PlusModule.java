package com.nullcognition.practice03.plus;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import dagger.Module;
import dagger.Provides;

@Module public class PlusModule{

	// since no external state is needed, we can use DaggerPlusComponent.create();

	// plus scope with arg
	@Provides @PlusScope public PlusProvided providePlusProvided(){ return new PlusProvided(2); }

	// testing two see if two different scoped provides can be bound
	// answer - may not reference bindings with different scopes, and cannot be multi bound
//	@Provides @PlusScopeTwo public PlusProvided providePlusProvidedTwo(){ return new PlusProvided(); }
}
