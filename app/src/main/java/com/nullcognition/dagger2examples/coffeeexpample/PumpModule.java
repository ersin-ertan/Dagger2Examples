package com.nullcognition.dagger2examples.coffeeexpample;
import dagger.Module;
import dagger.Provides;
/**
 * Created by ersin on 29/01/15 at 2:13 AM
 */

@Module(complete = false, library = true)
public class PumpModule {

   @Provides
   Pump providePump(Thermosiphon pump){
	  return pump;
   }
}
