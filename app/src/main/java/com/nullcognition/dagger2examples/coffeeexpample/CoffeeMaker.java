package com.nullcognition.dagger2examples.coffeeexpample;
import android.util.Log;

import javax.inject.Inject;

import dagger.Lazy;
/**
 * Created by ersin on 29/01/15 at 2:02 AM
 */
public class CoffeeMaker {

   private final Lazy<Heater> heater;
   private final Pump pump;

   @Inject
   CoffeeMaker(Lazy<Heater> inHeater, Pump inPump){
	  heater = inHeater;
	  pump = inPump;
   }

   public void brew(){
	  heater.get().on();
	  pump.pump();
	  Log.e("Coffee", "is Served");
	  heater.get().off();
   }
}
