package com.nullcognition.practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity{

	@Inject AndroidPhone androidPhone;
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		((Mall) getApplication()).getStoreComponent().inject(this);

		androidPhone.callFriend();
	}

}
