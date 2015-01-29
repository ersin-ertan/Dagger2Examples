package com.nullcognition.dagger2examples.coffeeexpample;
import javax.inject.Singleton;

import dagger.Component;
/**
 * Created by ersin on 29/01/15 at 1:31 AM
 */
public class CoffeeApp {

   CoffeeApp(){ // this code should be in the main()... but there is none, will try the constructor of the CoffeeApp
	  Coffee coffee = Dagger_CoffeeApp_Coffee.builder()
											 .build();
	  coffee.maker()
			.brew();
   }

   @Singleton
   @Component(modules = {DripCoffeeModule.class})
   public interface Coffee {

	  CoffeeMaker maker();
   }


}
