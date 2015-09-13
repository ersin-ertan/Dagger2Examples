package com.nullcognition.practice02.app;
// ersin 13/09/15 Copyright (c) 2015+ All rights reserved.


import com.nullcognition.practice02.appclasses.AbstractClass;
import com.nullcognition.practice02.appclasses.Caser;
import com.nullcognition.practice02.appclasses.CaserSingleton;
import com.nullcognition.practice02.appclasses.ClassNeededAsArgOfProvideFromGlobalModule;
import com.nullcognition.practice02.appclasses.ClassThatNeedsAnotherModulesProvide;
import com.nullcognition.practice02.appclasses.ThirdPartyObject;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module public class GloballyNeededModule{

	private final boolean isCaps;
	public GloballyNeededModule(boolean ic){isCaps = ic;}

	// external state needed non singleton scoppe
	@Provides public Caser provideCaser(){return new Caser(isCaps);}

	// external state needed singleton scope
	@AppScope @Provides public CaserSingleton provideCaserSingleton(){return new CaserSingleton(isCaps); }

	// no state needed, 3rd party object, thus provide is needed
	@Provides public ThirdPartyObject provideThirdPartyObject(){ return new ThirdPartyObject(); }

	// no state needed, @Inject constructor, thus no provides is needed
	// @Inject public NativeObject(){}

	// return concrete class with @Inject constructor extending an abstract class does not work

	// returning a concrete class with the abstract return type, can do logic based on methods parameters
	// an @Provides method return type can only be bound once, no matter what is return as new
	@Provides public AbstractClass provideAbstractClass00(){ return new AbstractClass.ConcreteClass00();}

	// otherwise an @Named can provide multiple bindings on the single type
	@Provides @Named("NamedConcrete01A") public AbstractClass provideAbstractClass01A(){ return new AbstractClass.ConcreteClass01();}
	@Provides @Named("NamedConcrete01B") public AbstractClass provideAbstractClass01B(){ return new AbstractClass.ConcreteClass01();}

	// inter component cross module @Provides class parameter being fulfilled
	@Provides public ClassThatNeedsAnotherModulesProvide provideClassThatNeedAnotherModulesProvide(ClassNeededAsArgOfProvideFromGlobalModule c){
		return new ClassThatNeedsAnotherModulesProvide(c);
	}
}
