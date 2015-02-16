package com.nullcognition.dagger2examples.sven;

import javax.inject.Inject;

/**
 * Created by ersin on 15/02/15 at 8:03 PM
 */
public class SomeMainActivityDependencyImp implements SomeMainActivityDependency {

   private final SomeApplicationDependency mSomeApplicationDependency;

   @Inject
   SomeMainActivityDependencyImp(final SomeApplicationDependency someApplicationDependency){
	  mSomeApplicationDependency = someApplicationDependency;
   }

   @Override
   public String getText(){
	  return mSomeApplicationDependency.getGreeting() + " Main!";
   }
}
