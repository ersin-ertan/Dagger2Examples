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

	  // using the simple component
	  //component = Dagger_AppComponent.builder().build();

	  // using the component with the module
	  // be sure to compile then add.appModuleKon...
	  // and be sure that the manifest is set correctly to point to app and activty
	  // for dagger to generate appModu...
	  component = Dagger_AppComponent.builder().appModuleKon(new AppModuleKon(this)).build();

	  // placing the dependency in the module, so any thing it produces has a reference to this context,
	  // which is then used ase a private field, driving the returns of the provides
   }

   public static void inject(ActivityKon inActivityKon){

	  component.inject(inActivityKon);
   }

}
