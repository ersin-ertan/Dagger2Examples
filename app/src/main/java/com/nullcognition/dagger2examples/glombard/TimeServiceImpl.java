package com.nullcognition.dagger2examples.glombard;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.inject.Inject;
/**
 * Created by ersin on 29/01/15 at 7:48 PM
 */
public class TimeServiceImpl implements TimeService {

   @Inject
   public TimeServiceImpl(){
   }


   @Override
   public int currentHour(){
	  return new GregorianCalendar().get(Calendar.HOUR_OF_DAY);
   }

}
