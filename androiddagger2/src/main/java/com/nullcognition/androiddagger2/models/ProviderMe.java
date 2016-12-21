package com.nullcognition.androiddagger2.models;

/**
 * Created by mms on 12/21/16.
 */

public class ProviderMe {
  public static int INSTANCE_COUNT = 0;
  public final boolean isInit;

  public ProviderMe() {
    this.isInit = true;
    ++INSTANCE_COUNT;
  }
}
