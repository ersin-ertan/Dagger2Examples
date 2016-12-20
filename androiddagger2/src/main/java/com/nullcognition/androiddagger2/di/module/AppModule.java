package com.nullcognition.androiddagger2.di.module;

import android.content.Context;
import com.nullcognition.androiddagger2.App;
import com.nullcognition.androiddagger2.models.AppScopeSharedSingleton;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/**
 * Created by mms on 12/20/16.
 */

@Module public class AppModule {

  private final App app;

  public AppModule(App app) {
    this.app = app;
  }

  @Provides @Singleton Context provideAppContext(App app) {
    return app.getApplicationContext();
  }

  @Provides @Singleton AppScopeSharedSingleton provideAppScopeSharedSingleton() {
    return new AppScopeSharedSingleton();
  }
}
