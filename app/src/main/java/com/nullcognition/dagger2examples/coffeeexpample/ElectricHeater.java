package com.nullcognition.dagger2examples.coffeeexpample;
import android.util.Log;
/**
 * Created by ersin on 29/01/15 at 2:18 AM
 */

class ElectricHeater implements Heater {

   boolean heating;

   @Override
   public void on(){
	  Log.e("EHeater", "~ ~ ~ heating ~ ~ ~");
	  this.heating = true;
   }

   @Override
   public void off(){
	  this.heating = false;
   }

   @Override
   public boolean isHot(){
	  return heating;
   }
}
