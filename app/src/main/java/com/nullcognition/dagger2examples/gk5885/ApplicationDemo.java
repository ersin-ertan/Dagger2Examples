package com.nullcognition.dagger2examples.gk5885;
import android.app.Application;
/**
 * Created by ersin on 27/01/15 at 7:42 AM
 */
public class ApplicationDemo extends Application {

   private ComponentApplicationDemo2 componentApplicationDemo1;

   @Override
   public void onCreate(){
	  super.onCreate();

	  componentApplicationDemo1 = Dagger_ComponentApplicationDemo2.builder()
																 .moduleApplication(new ModuleApplication(this))
																.build();

	  componentApplicationDemo1.injectApplication(this);
   }

   ComponentApplicationDemo2 getComponent(){return componentApplicationDemo1;}

}
