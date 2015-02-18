package com.nullcognition.dagger2examples.googleactivitygraphs;

import android.app.Application;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Component;
import dagger.Module;
import dagger.Provides;

import static android.content.Context.LOCATION_SERVICE;

@Singleton // Constraints this component to one-per-application or unscoped bindings.
@Component(modules = DemoApplicationModule.class)
public interface ApplicationComponent {

   // Field injections of any dependencies of the DemoApplication
   void inject(DemoApplication application);

   // Exported for child-components.
   Application application();

   LocationManager locationManager();
}


/**
 * A module for Android-specific dependencies which require a {@link Context} or
 * {@link android.app.Application} to create.
 */
@Module
class DemoApplicationModule {

   private final Application application;

   public DemoApplicationModule(Application application){
	  this.application = application;
   }

   /**
	* Expose the application to the graph.
	*/
   @Provides
   @Singleton
   Application application(){
	  return application;
   }

   @Provides
   @Singleton
   LocationManager provideLocationManager(){
	  return (LocationManager)application.getSystemService(LOCATION_SERVICE);
   }
}
