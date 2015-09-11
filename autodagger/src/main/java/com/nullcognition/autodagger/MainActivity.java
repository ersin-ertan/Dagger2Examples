package com.nullcognition.autodagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Singleton;

@Singleton
public class MainActivity extends AppCompatActivity{


	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

}
