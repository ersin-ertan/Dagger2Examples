package com.nullcognition.autodagger;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Singleton;

import autodagger.AutoComponent;
import dagger.Module;
import dagger.Provides;

@Singleton
public class MainActivity extends AppCompatActivity{


	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

}
