package com.nullcognition.dagger2examples.sven.components.b;

import dagger.Module;
import dagger.Provides;

@Module
public class BModule {

   @Provides
   public SomeBDependency provideSomeBDependency(final SomeBDependencyImp someADependency){
	  return someADependency;
   }
}
