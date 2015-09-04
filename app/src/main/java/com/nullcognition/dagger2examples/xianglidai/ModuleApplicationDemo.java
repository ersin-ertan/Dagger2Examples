//package com.nullcognition.dagger2examples.xianglidai;
///**
// * Created by ersin on 28/01/15 at 3:48 AM
// */
//
//import android.location.LocationManager;
//
//import javax.inject.Singleton;
//
//import dagger.Module;
//import dagger.Provides;
//
//import static android.content.Context.LOCATION_SERVICE;
//
///**
// * A module for Android-specific dependencies which require a {@link Context} or
// * {@link android.app.Application} to create.
// */
//@Module
//public class ModuleApplicationDemo {
//
//   private final ApplicationDemo application;
//
//   public ModuleApplicationDemo(ApplicationDemo application){
//	  this.application = application;
//   }
//
//   /**
//	* Expose the application to the graph.
//	*/
//   @Provides
//   @Singleton
//   ApplicationDemo application(){
//	  return application;
//   }
//
//   @Provides
//   @Singleton
//   LocationManager provideLocationManager(){
//	  return (LocationManager)application.getSystemService(LOCATION_SERVICE);
//   }
//
//
//}
