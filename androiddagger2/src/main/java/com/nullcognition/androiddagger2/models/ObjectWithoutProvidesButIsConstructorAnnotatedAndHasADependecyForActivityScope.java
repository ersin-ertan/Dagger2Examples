package com.nullcognition.androiddagger2.models;

import com.nullcognition.androiddagger2.di.scope.ActivityScope;
import javax.inject.Inject;

/**
 * Created by mms on 12/20/16.
 */

@ActivityScope
public class ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecyForActivityScope {

  public static int INSTANCE_COUNT = 0;
  public final StringObject stringObject;
  public final IntObject intObject;
  public final ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecy owp;

  @Inject public ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecyForActivityScope(
      StringObject stringObject, IntObject intObject,
      ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecy owp) {
    ++INSTANCE_COUNT;
    this.stringObject = stringObject;
    this.intObject = intObject;
    this.owp = owp;
  }
}
