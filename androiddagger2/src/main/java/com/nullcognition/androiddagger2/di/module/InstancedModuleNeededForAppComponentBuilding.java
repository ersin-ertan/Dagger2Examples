package com.nullcognition.androiddagger2.di.module;

import com.nullcognition.androiddagger2.models.StringObject;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by mms on 12/20/16.
 */

@Module public class InstancedModuleNeededForAppComponentBuilding {

  private final StringObject stringObject;

  public InstancedModuleNeededForAppComponentBuilding(StringObject s) {
    this.stringObject = s;
  }

  @Provides @Singleton StringObject provideStringObject() {
    return stringObject;
  }
}
