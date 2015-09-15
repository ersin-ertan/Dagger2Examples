package com.nullcognition.practice03.plus;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice03.plus.plustwo.PlusTwoComponent;
import com.nullcognition.practice03.plus.plustwo.PlusTwoModule;

import dagger.Subcomponent;

//@PlusScopeTwo cannot be annotated with two different scopes
@PlusScope @Subcomponent(modules = PlusModule.class) public interface PlusComponent{

//	void inject(MainActivity mainActivity);

	void inject(PlusProvidedWrapper plusProvidedWrapper);

	PlusTwoComponent plus(PlusTwoModule plusTwoModule);
}
