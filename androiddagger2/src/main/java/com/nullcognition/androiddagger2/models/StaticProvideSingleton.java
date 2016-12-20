package com.nullcognition.androiddagger2.models;

/**
 * Created by mms on 12/20/16.
 */

public class StaticProvideSingleton {

  public static int INSTANCE_COUNT = 0;

  public final boolean isInit;

  public StaticProvideSingleton() {
    isInit = true;
    ++INSTANCE_COUNT;
  }
}
