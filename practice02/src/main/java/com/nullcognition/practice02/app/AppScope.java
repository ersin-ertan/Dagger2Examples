package com.nullcognition.practice02.app;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Scope @Retention(RetentionPolicy.RUNTIME) public @interface AppScope{ }
