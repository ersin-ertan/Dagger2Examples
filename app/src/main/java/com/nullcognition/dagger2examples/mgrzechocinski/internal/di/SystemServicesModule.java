package com.nullcognition.dagger2examples.mgrzechocinski.internal.di;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.preference.PreferenceManager;

import com.nullcognition.dagger2examples.mgrzechocinski.utils.NetworkStateManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
/**
 * Created by ersin on 07/02/15 at 2:12 AM
 */
@Module
public class SystemServicesModule {

   private final Application application;

   public SystemServicesModule(Application application){
	  this.application = application;
   }

   @Provides
   Context provideContext(){
	  return application;
   }

   @Provides
   @Singleton
   SharedPreferences providePreferenceManager(){
	  return PreferenceManager.getDefaultSharedPreferences(application);
   }

   @Provides
   @Singleton
   ConnectivityManager provideConnectivityManager(){
	  return (ConnectivityManager)application.getSystemService(Context.CONNECTIVITY_SERVICE);
   }

   @Provides
   @Singleton
	  //Method parameter injected by Dagger2
   NetworkStateManager provideNetworkStateManager(ConnectivityManager connectivityManagerCompat){
	  return new NetworkStateManager(connectivityManagerCompat);
   }
}
