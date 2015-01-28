package com.nullcognition.dagger2examples.gk5885;
import android.app.Application;
/**
 * Created by ersin on 27/01/15 at 7:42 AM
 */
public class ApplicationDemo extends Application {

   private ComponentApplicationDemo componentApplicationDemo;

   @Override
   public void onCreate(){
	  super.onCreate();

	  componentApplicationDemo = Dagger_ComponentApplicationDemo.builder()
																.moduleApplication(new ModuleApplication(this))
																.build();

	  componentApplicationDemo.injectApplication(this);
   }

   ComponentApplicationDemo getComponent(){return componentApplicationDemo;}

}
