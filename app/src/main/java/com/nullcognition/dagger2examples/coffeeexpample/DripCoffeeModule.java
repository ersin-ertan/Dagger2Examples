package com.nullcognition.dagger2examples.coffeeexpample;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
/**
 * Created by ersin on 29/01/15 at 2:12 AM
 */

@Module(includes = PumpModule.class)
public class DripCoffeeModule {

   @Provides
   @Singleton
   Heater provideHeater(){ return new ElectricHeater();}
}
