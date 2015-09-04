//package com.nullcognition.dagger2examples.xianglidai;
//import android.app.Application;
//import android.location.LocationManager;
//
//import javax.inject.Inject;
///**
// * Created by ersin on 28/01/15 at 2:42 AM
// */
//
//public class ApplicationDemo extends Application {
//
//   private ComponentApplication applicationComponent;
//
//   // TODO(user): Figure out a better example of something one might inject into the app.
//
//   @Inject
//   LocationManager locationManager; // to illustrate injecting somethign into the app.
//
//   @Override
//   public void onCreate(){
//	  super.onCreate();
//
//	  // single name space, since the interface is defined in another file
//	  applicationComponent = Dagger_ComponentApplication.builder()
//														.moduleApplicationDemo(new ModuleApplicationDemo(this))
//														.build();
//
//	  applicationComponent.inject(this);
//	  // .inject(this) was giving an error because the wrong class was in the method call defined in ComponentActivityHome
//
//   }
//
//   ComponentApplication component(){
//	  return applicationComponent;
//   }
//}
//
//
