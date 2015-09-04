package com.nullcognition.chiu_ki;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity{


	@Inject Api api;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		((App) getApplication()).getGoogleComponent().inject(this);

		api.method();
		Toast.makeText(this, api.methodString(), Toast.LENGTH_SHORT).show();
	}


}
