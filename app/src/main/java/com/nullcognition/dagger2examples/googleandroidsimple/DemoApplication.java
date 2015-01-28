package com.nullcognition.dagger2examples.googleandroidsimple;
import android.app.Application;
import android.location.LocationManager;

import com.nullcognition.dagger2examples.googleandroidsimple.ui.HomeActivity;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
/**
 * Created by ersin on 27/01/15 at 8:44 PM
 */
public class DemoApplication extends Application {

   @Singleton
   @Component(modules = AndroidModule.class)
   public interface ApplicationComponent {

	  void inject(DemoApplication inDemoApplication);
	  void inject(HomeActivity inHomeActivity);
	  void inject(DemoActivity inDemoActivity);
   }

   @Inject
   LocationManager locationManager;

   private ApplicationComponent component;

   @Override
   public void onCreate(){
	  super.onCreate();
	  component = Dagger_DemoApplication_ApplicationComponent.builder()
															 .androidModule(new AndroidModule(this))
															 .build();

   }

   public ApplicationComponent component(){
	  return component;
   }

}
