package com.nullcognition.dagger2examples.joesteele;

import android.net.Uri;
import android.util.Log;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

import dagger.Module;
import dagger.Provides;

/**
 * Created by ersin on 26/02/15 at 7:18 PM
 */


@Module
public class ActivityModule {

   @Provides
   @ActivityScope
   Picasso providePicasso(ComponentTest app, OkHttpClient client){
	  return new Picasso.Builder(app).downloader(new OkHttpDownloader(client))
									 .listener(new Picasso.Listener() {

										@Override
										public void onImageLoadFailed(Picasso picasso, Uri uri, Exception e){
										   Log.e("Picasso", "Failed to load image: " + uri.toString(), e);
										}
									 })
									 .build();
   }
}
