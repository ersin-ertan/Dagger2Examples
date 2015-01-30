package com.nullcognition.dagger2examples.glombard;
import javax.inject.Inject;
/**
 * Created by ersin on 29/01/15 at 7:44 PM
 */
public class MessageSupplierImpl implements MessageSupplier {

   private final TimeService timeService;

   @Inject
   public MessageSupplierImpl(TimeService inTimeService){
	  timeService = inTimeService;
   }

   @Override
   public String getMessage(){

	  int hour = timeService.currentHour();

	  String partOfDay;

	  if(hour < 12){
		 partOfDay = "morning";
	  }
	  else if(hour >= 17){
		 partOfDay = "evening";
	  }
	  else{ partOfDay = "afternoon"; }

	  return "good " + partOfDay + " Mr.Watson";
   }
}
