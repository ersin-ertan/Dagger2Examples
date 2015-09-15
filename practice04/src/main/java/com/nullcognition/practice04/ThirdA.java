package com.nullcognition.practice04;
// ersin 15/09/15 Copyright (c) 2015+ All rights reserved.


import android.widget.TextView;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Inject;
import javax.inject.Scope;

import butterknife.ButterKnife;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

public class ThirdA{

	@Inject InjectConst injectConst;

	private ThirdAComponent thirdAComponent;
	public ThirdAComponent getThirdAComponent(){ return thirdAComponent;}

	public ThirdA(MainActivity activity){

		if(thirdAComponent == null){
			thirdAComponent = DaggerThirdAComponent
					.builder()
					.activityComponent(activity.getActivityComponent()) // needed
							// no need to create the activity module
//					.thirdAModule(new ThirdAModule()) // no external state thus this can be commented out
					.build();
			// do we need to rebuild? like in the main activity
		}

		getThirdAComponent().inject(this);

		((TextView) ButterKnife.findById(activity, R.id.textView)).setText(injectConst.provide);
	}

}


@Scope @Retention(RetentionPolicy.RUNTIME) @interface ThirdAScope{ }


// do we need the AppComponent dependencies, or is it transitively included
// it is transitively, else you would be potentially writing whole dependency trees
@Component(dependencies = ActivityComponent.class, modules = ThirdAModule.class)
@ThirdAScope interface ThirdAComponent{

	void inject(ThirdA thirdA);

	InjectConst injectConst();


}


@Module class ThirdAModule{

	@Provides @ThirdAScope InjectConst provideInjectConst(){ return new InjectConst("by @Provides @ThirdAScope");}

}
