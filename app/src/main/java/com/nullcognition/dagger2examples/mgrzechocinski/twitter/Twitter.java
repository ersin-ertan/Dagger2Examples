package com.nullcognition.dagger2examples.mgrzechocinski.twitter;
import android.content.Context;

import javax.inject.Inject;
/**
 * Created by ersin on 07/02/15 at 3:07 AM
 */

public class Twitter {

   private Context appContextProvider;

   private TwitterAPI twitterAPI;

   @Inject
   public Twitter(Context appContextProvider, TwitterAPI twitterAPI){
	  this.appContextProvider = appContextProvider;
	  this.twitterAPI = twitterAPI;
   }

   public void tweet(String tweetBody){
	  twitterAPI.tweet(appContextProvider, tweetBody);
   }
}
