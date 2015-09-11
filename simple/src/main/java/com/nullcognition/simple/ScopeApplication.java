package com.nullcognition.simple;
// ersin 06/09/15 Copyright (c) 2015+ All rights reserved.

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

@Qualifier
// the ScopeApplication annotation has its @Qualifier annotation when type alone is not enough
// to  identify the dependency, this is the same as using @Named, thus would have
//String value() default ""; as this classes field
@Retention(RetentionPolicy.RUNTIME)
public @interface ScopeApplication{ // is this really a scope, it has no @Scope annotation
}
