package com.nullcognition.dagger2examples.sven;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ersin on 15/02/15 at 8:01 PM
 */

@Module
class MainActivityModule {

   @Provides
   public SomeMainActivityDependency provideSomeMainDependency(final SomeMainActivityDependencyImp someMainDependency){
	  return someMainDependency;
   }
}
