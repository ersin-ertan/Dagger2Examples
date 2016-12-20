package com.nullcognition.androiddagger2.models;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by mms on 12/20/16.
 */

@Singleton public class ObjectWithoutProvidesButIsConstructorAnnotated {

  public static int INSTANCE_COUNT = 0;

  @Inject public ObjectWithoutProvidesButIsConstructorAnnotated() {
    ++INSTANCE_COUNT;
  }
}
