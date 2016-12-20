package com.nullcognition.androiddagger2.models;

import java.util.Random;

/**
 * Created by mms on 12/20/16.
 */

public class AppScopeSharedSingleton {

  public static final int LARGE_NUM = 512;
  public static int INSTANCE_COUNT = 0;
  public String[][] heavyObject = new String[LARGE_NUM][LARGE_NUM];

  public AppScopeSharedSingleton() {
    ++INSTANCE_COUNT;
    Random r = new Random(1);
    for (int i = 0; i < LARGE_NUM; i++) {
      for (int j = 0; j < LARGE_NUM; j++) {
        heavyObject[i][j] = String.valueOf(r.nextInt());
      }
    }
  }

  public boolean isInit() {
    return heavyObject != null;
  }
}
