package com.nullcognition.dagger2examples.sven;

import android.content.Context;

import com.nullcognition.dagger2examples.sven.components.a.AModule;
import com.nullcognition.dagger2examples.sven.components.b.BModule;

import lombok.Synchronized;

/**
 * Created by ersin on 15/02/15 at 8:00 PM
 */


public final class ActivityComponentProvider {

   private static ActivityComponent sActivityComponent;

   private ActivityComponentProvider(){}

   @Synchronized
   public static ActivityComponent activityComponent(final Context context){
	  if(sActivityComponent == null){
		 sActivityComponent = Dagger_ActivityComponent.builder()
													  .applicationComponent(((Dagger2Application)context.getApplicationContext()).getApplicationComponent())
													  .aModule(new AModule())
													  .bModule(new BModule())
													  .build();
	  }

	  return sActivityComponent;
   }
}
