package com.nullcognition.practice02.activity.activity01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.nullcognition.practice02.R;
import com.nullcognition.practice02.activity.ActScopeClass;
import com.nullcognition.practice02.app.App;

import javax.inject.Inject;

public class Activity01 extends AppCompatActivity{

	public static final int SCOPE = 1;

	@Inject ActScopeClass actScopeClass;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_01);

		// get the apps intermediate component which is built off of the appComponent
		// then plus the ActivityModule with 'this', which is the activity held in the
		// and provided from the parent class, the cast is needed because an abstract
		// activityComponent was used thus to comply with type specificity of the
		// component brought forth by its inject method


		// casting is not required, because generalized type did not work
		App.get(this).getIntermediateComponent()
				.plusActivity01(new Activity01Module(this)) // scope01activitycomponent.inject(this)
				.inject(this);

		String s = "null";
		if(actScopeClass != null){ s = String.valueOf(actScopeClass.getSelectedActivity());}

		Toast.makeText(Activity01.this, s, Toast.LENGTH_SHORT).show();
	}
	@Override public void finish(){
		App.get(this).releaseInterComponent();
		super.finish();
	}
}
