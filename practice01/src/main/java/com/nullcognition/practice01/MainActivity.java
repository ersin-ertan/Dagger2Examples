package com.nullcognition.practice01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Inject;
import javax.inject.Scope;

import butterknife.ButterKnife;
import butterknife.OnClick;
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
