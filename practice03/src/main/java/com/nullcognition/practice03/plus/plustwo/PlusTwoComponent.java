package com.nullcognition.practice03.plus.plustwo;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice03.plus.PlusProvided;
import com.nullcognition.practice03.plus.PlusProvidedWrapper;

import dagger.Subcomponent;

@PlusTwoScope @Subcomponent(modules = PlusTwoModule.class) public interface PlusTwoComponent{

	void inject(PlusProvidedWrapper plusProvidedWrapper);

	// secondary test object to inject
	void inject(PlusProvidedWrapperTwo plusProvidedWrapperTwo);

	// exposing does not change the privileges
	PlusProvided plusProvided();
}
