package com.nullcognition.dagger2examples.joesteele;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ersin on 26/02/15 at 7:13 PM
 */
@Module
public final class AppModule {

   private final ComponentTest app;

   public AppModule(ComponentTest app){
	  this.app = app;
   }

   @Provides
   @Singleton
   ComponentTest provideApplication(){
	  return app;
   }
}
