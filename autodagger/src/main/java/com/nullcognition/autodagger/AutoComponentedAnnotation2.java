package com.nullcognition.autodagger;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.


import autodagger.AutoComponent;
import autodagger.AutoInjector;

@AutoComponent(dependencies = App.class,
               superinterfaces = { DependencyOne.class, DependencyTwo.class },
               modules = StandardModule.class)
@AutoInjector
public @interface AutoComponentedAnnotation2{ }
