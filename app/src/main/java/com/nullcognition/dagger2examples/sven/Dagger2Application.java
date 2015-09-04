//package com.nullcognition.dagger2examples.sven;
//
//import android.app.Application;
//import android.util.Log;
//
//import javax.inject.Inject;
//
///**
// * Created by ersin on 15/02/15 at 8:01 PM
// */
//public class Dagger2Application extends Application {
//
//   public static final String TAG = Dagger2Application.class.getSimpleName();
//
//   @Inject
//   SomeApplicationDependency someApplicationDependency;
//
//   private ApplicationComponent applicationComponent;
//
//   public ApplicationComponent getApplicationComponent() {
//	  return applicationComponent;
//   }
//
//
//   @Override
//   public void onCreate(){
//	  super.onCreate();
//
//	  applicationComponent = Dagger_ApplicationComponent.builder()
//														.applicationModule(new ApplicationModule())
//														.build();
//
//	  applicationComponent.inject(this);
//
//	  Log.e(TAG, someApplicationDependency.getText());
//
//   }
//
//}
