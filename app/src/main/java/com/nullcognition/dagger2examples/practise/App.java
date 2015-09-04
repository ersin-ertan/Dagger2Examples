//package com.nullcognition.dagger2examples.practise;
//
//import android.app.Application;
//
//import dagger.Component;
//import lombok.NonNull;
//
///**
// * Created by ersin on 13/02/15 at 6:38 PM
// */
//public class App extends Application {
//
//   public static AppComponentP appComponent;
//
//   @Override
//   public void onCreate(){
//	  super.onCreate();
//
//	  appComponent = Dagger_AppComponentP.create();
//
//   }
//
//   @NonNull
//   public static void inject(Act inAct){
//
//	  appComponent.inject(inAct);
//   }
//
//}
//
//@Component
//interface AppComponentP {
//
//   @NonNull
//   public void inject(Act inAct);
//}
