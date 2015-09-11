package com.nullcognition.subcomponents;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class ApiModule{

	@Provides @AppScope(App.class) StandAloneObject provideStandAloneObject(){
		StandAloneObject standAloneObject = new StandAloneObject();
		standAloneObject.i = 2;
		return standAloneObject;
	}

	@Provides @AppScope(App.class) RequiresExternal provideRequiresExternal(Application application, StandAloneObject sao){
		RequiresExternal requiresExternal = new RequiresExternal(application.getString(R.id.action_settings));
		requiresExternal.i = new StandAloneObject(sao).i;
		return requiresExternal;
	}

	@Provides @AppScope(App.class) RequiresExternalCombo provideRequiresExternalCombo(RequiresExternal re){
		return new RequiresExternalCombo(re);
	}
}


class StandAloneObject{

	//	@Inject StandAloneObject(){} // if setup was not need constructor injection would work and
	// wouldn't require the ApiModule to @Provides, but assuming we are working with third party
	// classes(no @Inject constructor), and which need initialization we use @Provides
	public StandAloneObject(){}
	public StandAloneObject(StandAloneObject s){i = s.i;}
	public int i = 1;
}


class RequiresExternal{

	public final String s;
	public       int    i;

	RequiresExternal(String st){s = st;}
	public void setI(int ii){i = ii;}
}


class RequiresExternalCombo{

	public final RequiresExternal re;
	RequiresExternalCombo(RequiresExternal rex){re = rex;}
}
