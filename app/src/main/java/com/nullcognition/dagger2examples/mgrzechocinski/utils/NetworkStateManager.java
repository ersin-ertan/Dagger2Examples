package com.nullcognition.dagger2examples.mgrzechocinski.utils;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
/**
 * Created by ersin on 07/02/15 at 2:19 AM
 */


public class NetworkStateManager {

   private final ConnectivityManager connectivityManager;

   public NetworkStateManager(ConnectivityManager connectivityManager){
	  this.connectivityManager = connectivityManager;
   }

   public boolean isConnectedOrConnecting(){
	  NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
	  return activeNetworkInfo.isConnectedOrConnecting();
   }
}
