package com.nullcognition.dagger2examples.xianglidai;
/**
 * Created by ersin on 28/01/15 at 3:51 AM
 */

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * A module to wrap the Activity state and expose it to the graph.
 */
@Module
public class ModuleActivity {

   private final Activity activity;

   public ModuleActivity(Activity activity){
	  this.activity = activity;
   }

   /**
	* Expose the activity to dependents in the graph.
	*/
   @Provides
   @PerActivity
   Activity activity(){
	  return activity;
   }
/*
	@Provides  @PerActivity
    LocationManager provideLocationManager() {
        return (LocationManager) activity().getSystemService(LOCATION_SERVICE);
    }*/
}
