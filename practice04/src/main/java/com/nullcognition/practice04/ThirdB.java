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

public class ThirdB{

	@Inject InjectConst injectConst;

	private ThirdBComponent thirdBComponent;
	public ThirdBComponent getThirdBComponent(){ return thirdBComponent;}

	public ThirdB(MainActivity activity){

		if(thirdBComponent == null){
			thirdBComponent = DaggerThirdBComponent
					.builder()
					.activityComponent(activity.getActivityComponent())
							// no need to create the activity module
//					.thirdBModule(new ThirdBModule()) // no external state
					.build();
			// do we need to rebuild? like in the main activity
		}

		getThirdBComponent().inject(this);

		((TextView) ButterKnife.findById(activity, R.id.textView2)).setText(injectConst.provide);
	}
}


@Scope @Retention(RetentionPolicy.RUNTIME) @interface ThirdBScope{ }


@Component(dependencies = ActivityComponent.class, modules = ThirdBModule.class)
@ThirdBScope interface ThirdBComponent{

	void inject(ThirdB thirdB);

	InjectConst injectConst();


}


@Module class ThirdBModule{

	// use @Inject constructor with @ThirdBScope
}
