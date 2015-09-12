package com.nullcognition.practice01.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.nullcognition.practice01.App;
import com.nullcognition.practice01.Classes;
import com.nullcognition.practice01.R;
import com.nullcognition.practice01.anotheractivity.AnotherActivity;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{

	//These references will be satisfied by 'MainActivityComponent.inject(this)' method
	@Inject MainActivityPresenter presenter;
	@Inject Classes.SomeManager   someManager;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);

		//Local dependencies graph is constructed here
		App.get(this).getAppComponent()
		   .plus(new MainActivityModule(this))
		   .inject(this);

		String s = someManager.method("hi");
	}

	@OnClick(R.id.btn_showRepos) public void showRepos(){ presenter.onShowReposClick();}

	public void showReposForUser(String user){
		App.get(this).createUserComponent(user);
		startActivity(new Intent(this, AnotherActivity.class));
	}

	public void showValidationError(){ Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show(); }

	public void showLoading(boolean loading){
		Toast.makeText(MainActivity.this, "Show Loading" + String.valueOf(loading), Toast.LENGTH_SHORT).show();
	}
}

