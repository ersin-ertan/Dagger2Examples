package com.nullcognition.androiddagger2.di.module;

import com.nullcognition.androiddagger2.models.StaticProvideSingleton;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by mms on 12/20/16.
 *
 * No instance of this module is needed
 */

@Module public class NonInstantiatedModule {

  private NonInstantiatedModule() {
    throw new IllegalStateException(); // constructor blocked because creation in app component is deprecated, an instance of the module in not needed
  }

  @Provides @Singleton
  static StaticProvideSingleton provideStaticProvideSingleton() { // is 15 - 20% faster due to static keyword
    return new StaticProvideSingleton();
  }
}
