package com.nullcognition.androiddagger2.di.module;

import dagger.Module;
import dagger.Provides;

/**
 * Created by mms on 12/23/16.
 */

@Module public class MyModuleB {

  @Provides public static B provideBs() {
    return new B();
  }
}

class B {
}
