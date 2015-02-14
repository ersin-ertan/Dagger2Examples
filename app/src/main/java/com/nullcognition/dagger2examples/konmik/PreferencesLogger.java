package com.nullcognition.dagger2examples.konmik;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import java.util.Map;

import javax.inject.Inject;

/**
 * Created by ersin on 13/02/15 at 4:01 PM
 */
public class PreferencesLogger {

   public final String TAG = this.getClass()
								 .getSimpleName();

   @Inject
   public PreferencesLogger(){}

   public void log(Context inContext){

	  SharedPreferences preferences = inContext.getSharedPreferences("preferences", 0);

	  Log.v(TAG, "logging preferences");

	  for(Map.Entry entry : preferences.getAll()
									   .entrySet()){
		 Log.v(TAG, entry.getKey() + " = " + entry.getValue());
	  }
   }

}
