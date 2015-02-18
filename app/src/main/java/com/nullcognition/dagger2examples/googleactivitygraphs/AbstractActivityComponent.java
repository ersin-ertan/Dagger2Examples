package com.nullcognition.dagger2examples.googleactivitygraphs;

/**
 * Created by ersin on 18/02/15 at 12:00 AM
 */

import android.app.Activity;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface AbstractActivityComponent {
   Activity activity(); // Expose the activity to sub-graphs.
}

/**
 * A module to wrap the Activity state and expose it to the graph.
 */
@Module
class ActivityModule {
   private final Activity activity;

   public ActivityModule(Activity activity) {
	  this.activity = activity;
   }

   /**
	* Expose the activity to dependents in the graph.
	*/
   @Provides
   @PerActivity Activity activity() {
	  return activity;
   }
}
