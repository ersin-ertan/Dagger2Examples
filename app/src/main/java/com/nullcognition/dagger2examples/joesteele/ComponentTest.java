//package com.nullcognition.dagger2examples.joesteele;
//
//import android.app.Application;
//import android.content.Context;
//
//
///**
// * Created by ersin on 26/02/15 at 7:17 PM
// */
//
//public class ComponentTest extends Application {
//
//   private AppComponent component;
//
//   @Override
//   public void onCreate(){
//	  component = Dagger_AppComponent.Initializer.buildAndInject(this);
//   }
//
//   public static AppComponent component(Context context){
//	  return app(context).component;
//   }
//
//   public static ComponentTest app(Context context){
//	  return (ComponentTest)context.getApplicationContext();
//   }
//}
