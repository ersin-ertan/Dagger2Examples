package com.nullcognition.simple;

import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity{

	@Inject LocationManager locationManager;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		((App) getApplication()).getComponentApp().inject(this);

		((TextView) findViewById(R.id.textView)).setText(((App) getApplication()).getLocationManager().toString() + " - from app\n" +
				locationManager.toString() + " - from activity");
	}
}
