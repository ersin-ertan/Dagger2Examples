package com.nullcognition.dagger2examples.gk5885;
import android.app.Application;

import dagger.Module;
import dagger.Provides;
/**
 * Created by ersin on 27/01/15 at 7:36 AM
 */

@Module
final class ModuleApplication {

   private final Application application;


   ModuleApplication(Application inApplication){
	  application = inApplication;
   }

   @Provides
   Application application(){
	  return application;
   }
}
