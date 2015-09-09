package com.nullcognition.gk5885;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements HasComponent<MainActivityComponent>{

	private MainActivityComponent component;
	@Override public MainActivityComponent getComponent(){ return component;}

	@Override protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		component = DaggerMainActivityComponent
				.builder()
				.appComponent(((App) getApplication()).getComponent())
				.activityModule(new ActivityModule(this))
				.build();

		setContentView(R.layout.activity_main);

		if(savedInstanceState == null){
			getFragmentManager().beginTransaction()
			                    .add(R.id.container, new MainFragment())
			                    .commit();
		}
	}
}
