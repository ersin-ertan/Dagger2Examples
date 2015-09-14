package com.nullcognition.practice02.activity.activity01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nullcognition.practice02.R;
import com.nullcognition.practice02.activity.AbstractActivityComponent;
import com.nullcognition.practice02.app.App;

public class Activity01 extends AppCompatActivity{

	public static final int SCOPE = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_01);

		// get the apps intermediate component which is built off of the appComponent
		// then plus the ActivityModule with 'this', which is the activity held in the
		// and provided from the parent class, the cast is needed because an abstract
		// activityComponent was used thus to comply with type specificity of the
		// component brought forth by its inject method


		// todo is the promblem that the module is not generic, or that the plus from the Intercomponent is not the right input or output type?
		AbstractActivityComponent aac = App.get(this).getIntermediateComponent()
		                                   .plusActivity01(new Activity01Module(this));
		Scope01ActivityComponent s01ac = (Scope01ActivityComponent) aac;
		s01ac.inject(this);


	}
	@Override public void finish(){
		App.get(this).releaseInterComponent();
		super.finish();
	}
}
