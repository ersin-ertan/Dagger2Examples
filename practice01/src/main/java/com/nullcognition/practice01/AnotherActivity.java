package com.nullcognition.practice01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

public class AnotherActivity extends AppCompatActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_another);
	}

}


@ActivityScope @Subcomponent(modules = AnotherActivityModule.class) interface AnotherActivityComponent{

	void inject(AnotherActivity anotherActivity);

	AnotherActivityPresenter AnotherActivityPresenter();
}


@Module class AnotherActivityModule{

	private AnotherActivity anotherActivity;

	public AnotherActivityModule(AnotherActivity anotherActivity){
		this.anotherActivity = anotherActivity;
	}

	@Provides @ActivityScope AnotherActivity provideAnotherActivity(){ return anotherActivity; }

	@Provides
	@ActivityScope AnotherActivityPresenter provideAnotherActivityPresenter(UserManager userManager){
		return new AnotherActivityPresenter(anotherActivity, userManager);
	}
}


class AnotherActivityPresenter{

	private AnotherActivity anotherActivity;
	private UserManager     userManager;

	public AnotherActivityPresenter(AnotherActivity repositoriesListActivity, UserManager repositoriesManager){
		this.anotherActivity = repositoriesListActivity;
		this.userManager = repositoriesManager;
	}

}
