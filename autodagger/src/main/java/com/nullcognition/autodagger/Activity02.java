package com.nullcognition.autodagger;
// ersin 10/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Activity;
import android.os.Bundle;

import autodagger.AutoComponent;
import autodagger.AutoInjector;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

@AutoComponent(
		modules = { Activity02.ModuleOne.class, Activity02.ModuleTwo.class },
		dependencies = Activity02.SomeOtherComponent.class,
		superinterfaces = { DependencyOne.class, DependencyTwo.class }
)
@AutoInjector @AppScope(Activity02.class)
public class Activity02 extends Activity{

	private Activity02Component component;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		if(component == null){
			component = DaggerActivity02Component.builder()
			                                     .someOtherComponent(DaggerActivity02_SomeOtherComponent.create())
			                                     .moduleOne(new ModuleOne())
			                                     .moduleTwo(new ModuleTwo())
			                                     .build();
		}
		component.inject(this);
	}

	@Component @AppScope(SomeOtherComponent.class) public interface SomeOtherComponent{ }


	@Module
	public static class ModuleOne{

		@Provides @AppScope(Activity02.class)
		public MyObject01<String, String> providesMyObjec01(){
			return new MyObject01<>();
		}
	}


	@Module
	public static class ModuleTwo{ }
}










