package com.nullcognition.dagger2examples.konmik;

import android.app.Application;

/**
 * Created by ersin on 13/02/15 at 4:22 PM
 */
public class AppKon extends Application { // don't forget to change the app in the manifest to point to this class

   private static AppComponent component;

   @Override
   public void onCreate(){
	  super.onCreate();

	  // After we wrote all this, we press Build button to make Dagger 2 generate an AppComponent implementation.
	  // then we write

	  component = Dagger_AppComponent.builder().build();
   }

   public static void inject(ActivityKon inActivityKon){

	  component.inject(inActivityKon);
   }

}
