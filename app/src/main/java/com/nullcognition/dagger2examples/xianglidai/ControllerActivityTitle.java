package com.nullcognition.dagger2examples.xianglidai;
import android.app.Activity;

import javax.inject.Inject;
/**
 * Created by ersin on 28/01/15 at 2:38 AM
 */

/**
 * A simple abstraction which provides the ability to set the title on an activity.
 * <p/>
 * Fragments should not directly modify any part of an activity outside of the view or dialog that
 * it creates. This class provides a way for fragments to inject a controller that will allow for
 * control of the activity title. While not exceedingly useful in practice, this concept could be
 * expanded to things like facilitating control over the action bar, dialogs, notifications, etc.
 */
@PerActivity
public class ControllerActivityTitle {

   private final Activity activity;

   @Inject
   public ControllerActivityTitle(Activity activity){
	  this.activity = activity;
   }

   public void setTitle(CharSequence title){
	  activity.setTitle(title);
   }
}
