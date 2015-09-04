//package com.nullcognition.froger.data.api;
//// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.
//
//
//import android.app.Application;
//
//import com.nullcognition.froger.BuildConfig;
//import com.nullcognition.froger.R;
//
//import java.util.concurrent.TimeUnit;
//
//import javax.inject.Singleton;
//
//import dagger.Module;
//import dagger.Provides;
//
//@Module
//public class GithubApiModule{
//
//	@Provides
//	@Singleton OkHttpClient provideOkHttpClient(){
//		OkHttpClient okHttpClient = new OkHttpClient();
//		okHttpClient.setConnectTimeout(60 * 1000, TimeUnit.MILLISECONDS);
//		okHttpClient.setReadTimeout(60 * 1000, TimeUnit.MILLISECONDS);
//		return okHttpClient;
//	}
//
//	@Provides
//	@Singleton RestAdapter provideRestAdapter(Application application, OkHttpClient okHttpClient){
//		RestAdapter.Builder builder = new RestAdapter.Builder();
//		builder.setClient(new OkClient(okHttpClient))
//		       .setEndpoint(application.getString(R.string.endpoint));
//
//		if(BuildConfig.DEBUG){
//			builder.setLogLevel(RestAdapter.LogLevel.FULL);
//		}
//
//		return builder.build();
//	}
//
//	@Provides
//	@Singleton GithubApiService provideGithubApiService(RestAdapter restAdapter){
//		return restAdapter.create(GithubApiService.class);
//	}
//
//	@Provides
//	@Singleton UserManager provideUserManager(GithubApiService githubApiService){
//		return new UserManager(githubApiService);
//	}
//}
