package com.nullcognition.activitygraphs;

import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity{

	@Inject LocationManager       locationManager;
	private MainActivityComponent mainActivityComponent;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		getMainActivityComponent().inject(this);

		if(savedInstanceState == null){
			getSupportFragmentManager().beginTransaction()
					.add(R.id.layout, new MainFragment())
					.commit();
		}
	}

	// originally package, changed to public for emphasis that it is a method
	public MainActivityComponent getMainActivityComponent(){
		if(mainActivityComponent == null){
			mainActivityComponent = DaggerMainActivityComponent
					.builder()
					.appComponent
							(
									((App) getApplication()).getAppComponent()
							)
					.activityModule(new ActivityModule(this))
					.build();
		}
		return mainActivityComponent;
	}
}
