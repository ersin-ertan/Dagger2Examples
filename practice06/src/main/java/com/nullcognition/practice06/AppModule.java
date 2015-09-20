package com.nullcognition.practice06;
// ersin 20/09/15 Copyright (c) 2015+ All rights reserved.

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module public class AppModule{

	// can we save the return here, and check if LazyObj loSaved == null return new, else return the cached value in the appmodule?
	LazyObj l2 = null;

	@Provides @App.AppScope @Named("0") public LazyObj provideLazyObj0(){return new LazyObj(0);}
	@Provides @App.AppScope @Named("1") public LazyObj provideLazyObj1(@Named("0") LazyObj lo){return new LazyObj(1, lo);}
	@Provides @App.AppScope @Named("2") public LazyObj provideLazyObj2(){
		if(l2 == null){ // will always be null, because this @Provides is only called once, however if other logic used or set the value then
			// changes to this logic would be meaningful
			return l2 = new LazyObj(2);
		}
		// never be reached
		l2.i = 3;
		return l2;
	}

	// TODO test if using a cached value in two different @Named Provides will give the same object thus when changing a value from one spot, the other object that was provided's value will change too

	// it is possible to depend on the other provide with the same type but different name

	@Provides @App.AppScope public DepObj provideDepObj(@Named("1") LazyObj lo){return new DepObj(lo);}
	// lazy obj required the annotation to compile, relies on the above provided


}
