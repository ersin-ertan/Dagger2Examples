package com.nullcognition.subcomponents;
// ersin 11/09/15 Copyright (c) 2015+ All rights reserved.

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

public class SplashActivity extends BaseActivity{

	@OnClick(R.id.button) void login(final View view){
		User user = new User();
		user.name = "Phil";
		startDataListActivityForUser(user);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		ButterKnife.bind(this);

	}

	@Override
	protected void setupActivityComponent(){
		App.get(this).getAppComponent()
		   .plus(new SplashActivity.SplashActivityModule(this))
		   .inject(this);
	}

	public void startDataListActivityForUser(User user){
		App.get(this).createUserComponent(user);
		startActivity(new Intent(this, DataListActivity.class));
	}

	@Module public static class SplashActivityModule{

		private SplashActivity splashActivity;
		public SplashActivityModule(SplashActivity splashActivity){this.splashActivity = splashActivity;}

		@Provides @ActivityScope SplashActivity provideSplashActivity(){
			return splashActivity;
		}
	}


	@ActivityScope @Subcomponent(modules = SplashActivityModule.class)
	public interface SplashActivityComponent{

		SplashActivity inject(SplashActivity splashActivity);
	}

}
