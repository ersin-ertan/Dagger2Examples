package com.nullcognition.practice07;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity{

	@Inject Observable<A> aObservable;
	A            a;
	AppComponent appComponent;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);

		if(appComponent == null){
			appComponent = ((App) getApplication())
					.getAppComponent();
		}

		appComponent.inject(this);

		aObservable.subscribeOn(Schedulers.io())
		           .observeOn(AndroidSchedulers.mainThread())
		           .subscribe(new Action1<A>(){
			           @Override public void call(final A aa){
				           a = aa;
				           Log.d("MainActivity", "a = aa");
			           }
		           });
	}

	@OnClick(R.id.button) void isAReady(final View view){
		if(a != null){
			Toast.makeText(MainActivity.this, a.a, Toast.LENGTH_SHORT)
			     .show();
		}
		else{
			Toast.makeText(MainActivity.this, "still null", Toast.LENGTH_SHORT)
			     .show();
		}
	}
}
