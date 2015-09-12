package com.nullcognition.practice01.user;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice01.anotheractivity.AnotherActivityComponent;
import com.nullcognition.practice01.anotheractivity.AnotherActivityModule;

import dagger.Subcomponent;

@UserScope @Subcomponent(modules = UserModule.class) public interface UserComponent{

	AnotherActivityComponent plus(AnotherActivityModule anotherActivityModule);

}
