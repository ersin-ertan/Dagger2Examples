package com.nullcognition.practice03.activity;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.nullcognition.practice03.App;
import com.nullcognition.practice03.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity{

	@Inject Application application;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// requires the cast to get at the inject method if it only exists in AppComponentEx
//		((AppComponentEx) App.get(this).getAppComponent())
//				.inject(this);

		// cast not needed if needing only from AppComponent
		App.get(this).getAppComponent().inject(this);

		if(application != null){
			Toast.makeText(MainActivity.this, "true", Toast.LENGTH_SHORT).show();
		}
	}

}
