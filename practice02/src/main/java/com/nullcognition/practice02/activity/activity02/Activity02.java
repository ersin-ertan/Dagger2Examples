package com.nullcognition.practice02.activity.activity02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nullcognition.practice02.R;
import com.nullcognition.practice02.activity.activity01.Activity01Module;
import com.nullcognition.practice02.activity.activity01.Scope01ActivityComponent;
import com.nullcognition.practice02.app.App;

public class Activity02 extends AppCompatActivity{

	public static final int SCOPE = 2;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_02);

		((Scope02ActivityComponent) App.get(this).getIntermediateComponent()
		                               .plusActivity(new Activity02Module(this, 2)))
				.inject(this);
	}

	@Override public void finish(){
		App.get(this).releaseInterComponent();
		super.finish();
	}
}
