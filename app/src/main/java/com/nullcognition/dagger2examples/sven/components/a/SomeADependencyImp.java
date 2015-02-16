package com.nullcognition.dagger2examples.sven.components.a;

import com.nullcognition.dagger2examples.sven.SomeApplicationDependency;

import javax.inject.Inject;

class SomeADependencyImp implements SomeADependency {

   private final SomeApplicationDependency mSomeApplicationDependency;

   @Inject
   public SomeADependencyImp(final SomeApplicationDependency someApplicationDependency){
	  mSomeApplicationDependency = someApplicationDependency;
   }

   @Override
   public String getText(){
	  return mSomeApplicationDependency.getGreeting() + " Component A";
   }
}
