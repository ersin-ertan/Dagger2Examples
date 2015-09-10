package com.nullcognition.autodagger;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.

import autodagger.AutoExpose;
import autodagger.AutoInjector;

@AutoInjector(value = Activity01.class, parameterizedTypes = { String.class, String.class })
@AutoExpose(value = Activity01.class)
@AppScope(Activity01.class)
public class MyObject02<T, T1>{ }
