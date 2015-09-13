package com.nullcognition.practice01.anotheractivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.nullcognition.practice01.App;
import com.nullcognition.practice01.R;

import javax.inject.Inject;

public class AnotherActivity extends AppCompatActivity{

	@Inject AnotherActivityPresenter anotherActivityPresenter;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_another);

		App.get(this).getUserComponent()
		   .plus(new AnotherActivityModule(this))
		   .inject(this);

		String hi = anotherActivityPresenter.method("hi");
	}

	@Override public void finish(){
		App.get(this).releaseUserComponent();
		super.finish();
	}
}

