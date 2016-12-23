package com.nullcognition.androiddagger2.di.module;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mms on 12/23/16.
 */

@Module public class MyModuleC {

  @Provides public static C provideCs() {
    return new C();
  }
}

class C {
}
