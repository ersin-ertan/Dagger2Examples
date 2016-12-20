package com.nullcognition.androiddagger2.models;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by mms on 12/20/16.
 */

@Singleton public class ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecy {

  public static int INSTANCE_COUNT = 0;
  public final StringObject stringObject;

  @Inject
  public ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecy(StringObject stringObject) {
    ++INSTANCE_COUNT;
    this.stringObject = stringObject;
  }
}