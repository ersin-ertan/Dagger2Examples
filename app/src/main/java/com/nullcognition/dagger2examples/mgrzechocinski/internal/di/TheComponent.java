package com.nullcognition.dagger2examples.mgrzechocinski.internal.di;

import com.nullcognition.dagger2examples.mgrzechocinski.TheApplication;
import com.nullcognition.dagger2examples.mgrzechocinski.home.HomeActivity;
import com.nullcognition.dagger2examples.mgrzechocinski.utils.TheCollectionUtils;

import javax.inject.Singleton;

import dagger.Component;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
/**
 * Created by ersin on 07/02/15 at 2:06 AM
 */

@Singleton
@Component(modules = {SystemServicesModule.class, TheUtilsModule.class})
public interface TheComponent {

   @NoArgsConstructor(access = AccessLevel.PRIVATE)
   public final static class Initializer {


	  public static TheComponent init(TheApplication app){
		 return Dagger_TheComponent.builder()
								   .systemServicesModule(new SystemServicesModule(app))
								   .build();
	  }

   }

   void inject(TheApplication app);



   void inject(HomeActivity app);

   TheCollectionUtils getTheStringUtils();
}
