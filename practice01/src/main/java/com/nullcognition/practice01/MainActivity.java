package com.nullcognition.practice01;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Inject;
import javax.inject.Scope;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

public class MainActivity extends AppCompatActivity{

	//These references will be satisfied by 'MainActivityComponent.inject(this)' method
	@Inject MainActivityPresenter presenter;
	@Inject Classes.SomeManager   someManager;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//Local dependencies graph is constructed here
		App.get(this).getAppComponent()
		   .plus(new MainActivityModule(this))
		   .inject(this);

		String s = someManager.method("hi");
	}

//	@OnClick(R.id.btnShowRepositories)
//	public void onShowRepositoriesClick(){
//		presenter.onShowRepositoriesClick();
//	}
//
//	public void showRepositoriesListForUser(User user){
//		App.get(this).createUserComponent(user);
//		startActivity(new Intent(this, AnotherActivity.class));
//	}
//
//	public void showValidationError(){ etUsername.setError("Validation error"); }
//
//	public void showLoading(boolean loading){
//		btnShowRepositories.setVisibility(loading ? View.GONE : View.VISIBLE);
//		pbLoading.setVisibility(loading ? View.VISIBLE : View.GONE);
//	}
}


@ActivityScope @Subcomponent(modules = MainActivityModule.class) interface MainActivityComponent{

	void inject(MainActivity mainActivity);

	MainActivityPresenter mainActivityPresenter();
}


@Module class MainActivityModule{

	private MainActivity mainActivity;

	public MainActivityModule(MainActivity mainActivity){
		this.mainActivity = mainActivity;
	}

	@Provides @ActivityScope MainActivity provideMainActivity(){ return mainActivity; }

	@Provides
	@ActivityScope MainActivityPresenter provideMainActivityPresenter(Classes.SomeClass someClass, UserManager userManager){
		return new MainActivityPresenter(mainActivity, someClass, userManager);
	}
}


@Scope @Retention(RetentionPolicy.RUNTIME) @interface ActivityScope{ }
