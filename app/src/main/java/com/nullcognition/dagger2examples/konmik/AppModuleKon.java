package com.nullcognition.dagger2examples.konmik;

import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import lombok.NonNull;

/**
 * Created by ersin on 13/02/15 at 8:12 PM
 */
// A module is a part of your application that provides some functionality,
// while a component is a part of your application that consumes some functionality.

@Module // to Dagger that this object will be used for objects instantiation
public class AppModuleKon {

   private static final String PREF_FILE_NAME = "preferences";

   private AppKon appKon;

   public AppModuleKon(@NonNull AppKon inAppKon){ appKon = inAppKon; }

   @Provides // this method should be called to instantiate an object
   @Singleton // the object should be reused for injection into other objects.
   SharedPreferences provideSharedPreferences(){
	  return appKon.getSharedPreferences(PREF_FILE_NAME, 0);
   }
}
