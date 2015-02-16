package com.nullcognition.dagger2examples.mgrzechocinski;
import android.app.Application;
import android.content.Context;

import com.nullcognition.dagger2examples.mgrzechocinski.internal.di.TheComponent;
/**
 * Created by ersin on 07/02/15 at 2:01 AM
 */
public class TheApplication extends Application {

   private TheComponent component;

   @Override
   public void onCreate(){
	  super.onCreate();
	  buildComponentAndInject();
   }

   public void buildComponentAndInject(){
	  component = TheComponent.Initializer.init(this);
   }

   public static TheComponent component(Context context){
	  return ((TheApplication)context.getApplicationContext()).component;
   }
}
