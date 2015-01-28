package com.nullcognition.dagger2examples.gk5885;
import android.app.Activity;

import dagger.Module;
import dagger.Provides;
/**
 * Created by ersin on 27/01/15 at 7:40 AM
 */

@Module
final class ModuleActivity {

   private final Activity activity;

   ModuleActivity(Activity inActivity){activity = inActivity;}

   @Provides
   Activity activity(){return activity;}
}
