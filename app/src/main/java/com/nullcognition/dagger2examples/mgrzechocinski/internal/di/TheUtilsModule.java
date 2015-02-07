package com.nullcognition.dagger2examples.mgrzechocinski.internal.di;
import com.nullcognition.dagger2examples.mgrzechocinski.utils.TheCollectionUtils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
/**
 * Created by ersin on 07/02/15 at 2:13 AM
 */


@Module
public class TheUtilsModule {

   @Provides
   @Singleton
   TheCollectionUtils provideStringUtils() {
	  return new TheCollectionUtils();
   }
}
