package com.nullcognition.autodagger;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.


import javax.inject.Scope;

@Scope @interface AppScope{

	Class<?> value();
}
