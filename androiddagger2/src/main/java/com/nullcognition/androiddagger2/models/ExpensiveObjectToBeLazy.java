package com.nullcognition.androiddagger2.models;

import java.util.Random;

/**
 * Created by mms on 12/21/16.
 */

public class ExpensiveObjectToBeLazy {

  public final static int SIZE = 256;
  public static int INSTANCE = 0;
  public String[][] strings = new String[SIZE][SIZE];

  public ExpensiveObjectToBeLazy() {
    ++INSTANCE;
    Random r = new Random(1);

    for (int i = 0; i < SIZE; i++) {
      for (int j = 0; j < SIZE; j++) {
        strings[i][j] = String.valueOf(r.nextInt());
      }
    }
  }
}
