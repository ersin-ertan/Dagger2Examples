package com.nullcognition.androiddagger2.di.module;

import android.support.v7.app.AppCompatActivity;
import com.nullcognition.androiddagger2.di.scope.ActivityScope;
import dagger.Module;
import dagger.Provides;

/**
 * Created by mms on 12/20/16.
 */

@Module public class ActivityModule {

  private final AppCompatActivity activity;

  public ActivityModule(AppCompatActivity activity) {
    this.activity = activity;
  }

  @Provides @ActivityScope AppCompatActivity provideActivity() {
    return activity;
  }
}
