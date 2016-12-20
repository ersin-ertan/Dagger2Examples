package com.nullcognition.androiddagger2.di.module;

import com.nullcognition.androiddagger2.di.scope.ActivityScope;
import com.nullcognition.androiddagger2.models.IntObject;
import dagger.Module;
import dagger.Provides;

/**
 * Created by mms on 12/20/16.
 */

@Module public class SecondModuleButWithActivityScope {

  private final IntObject intObject;

  public SecondModuleButWithActivityScope(IntObject i) {
    this.intObject = i;
  }

  @Provides @ActivityScope IntObject provideIntObject() {
    return intObject;
  }
}
