package com.nullcognition.dagger2examples.mgrzechocinski.utils;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * Created by ersin on 07/02/15 at 2:14 AM
 */

public class TheCollectionUtils {

   public <T> List<T> toSortedList(Comparator<T> comparator, T... stringsToSort) {
	  List<T> list = Arrays.asList(stringsToSort);
	  Collections.sort(list, comparator);
	  return list;
   }
}
