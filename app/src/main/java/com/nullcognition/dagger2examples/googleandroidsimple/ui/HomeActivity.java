package com.nullcognition.dagger2examples.googleandroidsimple.ui;

import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;

import com.nullcognition.dagger2examples.googleandroidsimple.DemoActivity;
import com.nullcognition.dagger2examples.googleandroidsimple.DemoApplication;

import javax.inject.Inject;
/**
 * Created by ersin on 27/01/15 at 7:33 PM
 */
public class HomeActivity extends DemoActivity {

   @Inject
   LocationManager locationManager;

   @Override
   protected void onCreate(Bundle inBundle){
	  super.onCreate(inBundle);

	  ((DemoApplication)getApplication()).component()
										 .inject(this);

	  Log.e(getClass().getSimpleName(), locationManager.toString());

   }
}
