package com.nullcognition.androiddagger2.models;

import javax.inject.Inject;

/**
 * Created by mms on 12/21/16.
 */

public class ObjectWithoutProvidesButIsConstructorAnnotatedUnscoped {

  @Inject public ObjectWithoutProvidesButIsConstructorAnnotatedUnscoped() {
  }
}
