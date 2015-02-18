package com.nullcognition.dagger2examples.googleactivitygraphs;

import android.app.Application;
import android.location.LocationManager;

import javax.inject.Inject;

/**
 * Created by ersin on 17/02/15 at 11:50 PM
 */
public class DemoApplication extends Application {

   private ApplicationComponent applicationComponent;

   @Inject
   LocationManager locationManager;

   @Override
   public void onCreate(){
	  super.onCreate();

//
//	  applicationComponent = Dagger_ApplicationComponent.builder()
//														 .androidModule(new DemoApplicationModule(this))
//														 .build();
   }

   ApplicationComponent component(){ return applicationComponent;}

}
