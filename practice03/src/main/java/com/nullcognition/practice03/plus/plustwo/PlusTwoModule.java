package com.nullcognition.practice03.plus.plustwo;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice03.plus.PlusProvided;
import com.nullcognition.practice03.plus.PlusScope;

import dagger.Module;
import dagger.Provides;

@Module public class PlusTwoModule{

	// no @Provides because what is provided is the PlusProvided class which has an @Inject annotated constructor
	// and the class is annotated with PlusTwoScope

	// did not work, testing an  explicit @Provides with its new scope
//	@Provides @PlusTwoScope public PlusProvided providePlusProvided(){ return new PlusProvided(); }
	// did not work either

}
