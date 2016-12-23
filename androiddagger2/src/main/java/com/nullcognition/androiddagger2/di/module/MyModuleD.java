package com.nullcognition.androiddagger2.di.module;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mms on 12/23/16.
 */

@Module public class MyModuleD {

  @Provides public static D provideDs() {
    return new D();
  }
}

class D {
}
