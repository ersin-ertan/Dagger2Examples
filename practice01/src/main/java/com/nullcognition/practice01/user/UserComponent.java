package com.nullcognition.practice01.user;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice01.anotheractivity.AnotherActivityComponent;
import com.nullcognition.practice01.anotheractivity.AnotherActivityModule;

import dagger.Subcomponent;
// UserModule provides the user and the DeeperManager, another module could provide
// a parallel class which could use UserModule's provides, or not which its provides
// would be available to all sub plus components
@UserScope @Subcomponent(modules = UserModule.class) public interface UserComponent{

	AnotherActivityComponent plus(AnotherActivityModule anotherActivityModule);

	// SomeOtherComponentThatNeedsUserComponent plus(UserInventoryActivityModule)
	// which would provide the presenter, the activity and a manager

	//

}
