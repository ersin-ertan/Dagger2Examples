package com.nullcognition.practice02.activity.activity02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.nullcognition.practice02.R;
import com.nullcognition.practice02.activity.ActScopeClass;
import com.nullcognition.practice02.app.App;

import javax.inject.Inject;

public class Activity02 extends AppCompatActivity{

	public static final int SCOPE = 2;

	@Inject ActScopeClass actScopeClass;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_02);

		App.get(this).getIntermediateComponent()
		   .plusActivity02(new Activity02Module(this, 2))
		   .inject(this);

		String s = "null";
		if(actScopeClass != null){ s = String.valueOf(actScopeClass.getSelectedActivity());}

		Toast.makeText(Activity02.this, s, Toast.LENGTH_SHORT).show();
	}

	@Override public void finish(){
		App.get(this).releaseInterComponent();
		super.finish();
	}
}
