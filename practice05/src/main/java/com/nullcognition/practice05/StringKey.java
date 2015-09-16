package com.nullcognition.practice05;
// ersin 16/09/15 Copyright (c) 2015+ All rights reserved.

import dagger.MapKey;

@MapKey // (unwrapValue = true) by defaul   t
public @interface StringKey{

	String value();
}
