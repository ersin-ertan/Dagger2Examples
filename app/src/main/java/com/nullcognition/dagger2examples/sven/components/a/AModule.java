package com.nullcognition.dagger2examples.sven.components.a;

import dagger.Module;
import dagger.Provides;


@Module
public class AModule {

   @Provides
   public SomeADependency provideSomeADependency(final SomeADependencyImp someADependency){
	  return someADependency;
   }
}
