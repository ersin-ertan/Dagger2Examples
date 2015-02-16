package com.nullcognition.dagger2examples.sven;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ersin on 15/02/15 at 8:00 PM
 */
@Module
class ApplicationModule {

   @Provides
   public SomeApplicationDependency provideSomeApplicationDependency(final SomeApplicationDependencyImp someApplicationDependency){
	  return someApplicationDependency;
   }
}
