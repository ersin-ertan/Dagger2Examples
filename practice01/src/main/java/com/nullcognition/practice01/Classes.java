package com.nullcognition.practice01;
// ersin 12/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Application;

public class Classes{

	public static class SomeClass{

		public int method(int i){return i;}
	}


	public static class SomeManager{

		private final Application app;
		public SomeManager(Application app){ this.app = app;}

		public String method(String arg){ return "SomeManager.method(" + arg + ");";}
	}


	public static class SomeDeeperManager{

		private String     user;
		private ApiService apiService;

		public SomeDeeperManager(String user, ApiService apiService){
			this.user = user;
			this.apiService = apiService;
		}

		public String getUsersRepos(){
			return apiService.getUser(user);
		}
	}
}
