package com.nullcognition.dagger2examples.sven;

import javax.inject.Inject;

/**
 * Created by ersin on 15/02/15 at 8:02 PM
 */
public class SomeApplicationDependencyImp implements SomeApplicationDependency {

   @Inject
   public SomeApplicationDependencyImp(){}

   @Override
   public String getGreeting(){
	  return "Hello";
   }

   @Override
   public String getText(){
	  return getGreeting() + " Application!";
   }
}
