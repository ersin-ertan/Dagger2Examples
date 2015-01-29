package com.nullcognition.dagger2examples.coffeeexpample;
import android.util.Log;

import javax.inject.Inject;
/**
 * Created by ersin on 29/01/15 at 2:14 AM
 */
public class Thermosiphon implements Pump {

   private final Heater heater;

   @Inject
   Thermosiphon(Heater inHeater){
	  heater = inHeater;
   }

   @Override
   public void pump(){
	  if(heater.isHot()){ Log.e("Thermo", "is hot, be carefull"); }
   }
}

