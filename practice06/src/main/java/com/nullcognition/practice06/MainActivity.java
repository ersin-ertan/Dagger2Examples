package com.nullcognition.practice06;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.Lazy;

/*
Exploring double Lazy<T> @Named @Provides, with dependencies to both from a third object
(@Name in the parameter list to specify which @Provides to get), and whether or not they can depend on each other
*/


public class MainActivity extends AppCompatActivity{

//	App.AppComponent appComponent;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		((App) getApplication()).getAppComponent().inject(this);
	}

	@Inject @Named("0") Lazy<LazyObj> l0;
	@Inject @Named("1") Lazy<LazyObj> l1;
	@Inject             DepObj        d;
	@Inject @Named("2") LazyObj       l2;

	@Override protected void onStart(){
		super.onStart();

		Toast.makeText(MainActivity.this, "l1.get().lo.i:" + String.valueOf(l1.get().lo.i) + "\n l1.get().i:" + String.valueOf(l1.get().i), Toast.LENGTH_SHORT).show();

		Toast.makeText(MainActivity.this, String.valueOf(d.lo.i), Toast.LENGTH_SHORT).show();

		if(l0.get() != null && l1.get() != null){
			Toast.makeText(MainActivity.this, "both not null", Toast.LENGTH_SHORT).show();
		}

		Toast.makeText(MainActivity.this, "LazyObjCached:" + l2.i, Toast.LENGTH_SHORT).show();

		Toast.makeText(MainActivity.this, String.valueOf(((App) getApplication()).getAppComponent().lazyObj().i), Toast.LENGTH_SHORT).show();

		new CacheCheck(this);
	}
}
