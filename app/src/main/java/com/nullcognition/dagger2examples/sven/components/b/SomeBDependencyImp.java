package com.nullcognition.dagger2examples.sven.components.b;

import com.nullcognition.dagger2examples.sven.SomeApplicationDependency;


import com.nullcognition.dagger2examples.sven.SomeApplicationDependency;

import javax.inject.Inject;

class SomeBDependencyImp implements SomeBDependency {

   private final SomeApplicationDependency mSomeApplicationDependency;

   @Inject
   public SomeBDependencyImp(final SomeApplicationDependency someApplicationDependency){
	  mSomeApplicationDependency = someApplicationDependency;
   }

   @Override
   public String getText(){
	  return mSomeApplicationDependency.getGreeting() + " Component B";
   }
}
