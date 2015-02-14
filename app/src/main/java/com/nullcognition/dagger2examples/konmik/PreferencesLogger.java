package com.nullcognition.dagger2examples.konmik;

import android.content.SharedPreferences;
import android.util.Log;

import java.util.Map;

import javax.inject.Inject;

/**
 * Created by ersin on 13/02/15 at 4:01 PM
 */
public class PreferencesLogger {

   @Inject // since we inject the SP(after constructor finished), no neeed for constructor args
   SharedPreferences preferences; // not private becasue dagger needs access it

   public final String TAG = this.getClass()
								 .getSimpleName();

   @Inject
   public PreferencesLogger(){}

   // public PreferencesLogger(SharedPreferences inSharedPreferences){ preferences = inSharedPreferences;}
	// use this with constructor args if you want to use the object right away in the constructor
	// in which case the SP is private, then there is no need to inject the shared prefrences


   public void log(){


	  Log.v(TAG, "logging preferences");

	  for(Map.Entry entry : preferences.getAll()
									   .entrySet()){
		 Log.v(TAG, entry.getKey() + " = " + entry.getValue());
	  }
   }

}
