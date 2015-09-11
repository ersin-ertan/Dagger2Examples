package com.nullcognition.subcomponents;
// ersin 11/09/15 Copyright (c) 2015+ All rights reserved.


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DataManager{

	public Map<User, String> getUserData(){return apiService.getUserData();}

	User       user;
	ApiService apiService;

	public DataManager(final User u, final ApiService as){
		user = u;
		apiService = as;
	}


	static class ApiService{

		public static  HashMap<User, String> userData = new HashMap<>(2);
		public static User                  u00      = new User();
		public static User                  u01      = new User();

		static{
			u00.name = "00";
			u01.name = "01";
			userData.put(u00, u00.name);
			userData.put(u01, u01.name);
		}

		public static Map<User, String> getUserData(){
			return Collections.unmodifiableMap(userData);
		}

	}
}

