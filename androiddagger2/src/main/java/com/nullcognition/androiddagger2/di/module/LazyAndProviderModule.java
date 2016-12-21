package com.nullcognition.androiddagger2.di.module;

import com.nullcognition.androiddagger2.models.ExpensiveObjectToBeLazy;
import com.nullcognition.androiddagger2.models.ProviderMe;
import dagger.Module;
import dagger.Provides;

/**
 * Created by mms on 12/21/16.
 */

@Module public class LazyAndProviderModule {

  public static @Provides ProviderMe provideProviderMe() {
    return new ProviderMe();
  }

  public static @Provides ExpensiveObjectToBeLazy provideExpensiveObjectToBeLazy() {
    return new ExpensiveObjectToBeLazy();
  }
}
