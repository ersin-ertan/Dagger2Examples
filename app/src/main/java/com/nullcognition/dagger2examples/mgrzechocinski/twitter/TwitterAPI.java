package com.nullcognition.dagger2examples.mgrzechocinski.twitter;
import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Singleton;
/**
 * Created by ersin on 07/02/15 at 3:08 AM
 */

@Singleton
public class TwitterAPI {

   @Inject
   public TwitterAPI(){
   }

   public void tweet(Context context, String tweetBody){
	  Toast.makeText(context, tweetBody, Toast.LENGTH_SHORT)
		   .show();
   }
}
