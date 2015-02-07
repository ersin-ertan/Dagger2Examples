package com.nullcognition.dagger2examples.mgrzechocinski;
import android.app.Application;
import android.content.Context;
/**
 * Created by ersin on 07/02/15 at 2:01 AM
 */
public class TheApplication extends Application {

   private TheApplication component;

   @Override
   public void onCreate(){
	  super.onCreate();
	  buildComponentAndInject();
   }

   public void buildComponentAndInject(){
	  component = TheApplication.Initializer.init(this);
   }

   public static TheApplication component(Context context){
	  return ((TheApplication)context.getApplicationContext()).component;
   }
}
