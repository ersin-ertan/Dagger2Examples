package com.nullcognition.practice04;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Inject;
import javax.inject.Scope;

import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.Component;
import dagger.Module;
import dagger.Provides;

public class MainActivity extends AppCompatActivity{

	private ActivityComponent activityComponent;
	public ActivityComponent getActivityComponent(){
		if(activityComponent == null){
			activityComponent = DaggerActivityComponent
					.builder()

					.appComponent(App.get(this).getAppComponent())
					.activityModule(new ActivityModule(this))

					.build();
		}
		return activityComponent;
	}

	// error if the Application application() is not exposed in the
	// app component, will not compile
	@Inject Application application;


	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		ButterKnife.bind(this);

		// does both the creation and the injection of the component
		getActivityComponent().inject(this);

		// redundant but if appComponent was exposing another object
		// showcases how one would get it .getOtherThing(); at runtime
//		App.get(this).getAppComponent().getApplication();

		if(application != null){
			Toast.makeText(MainActivity.this, "From MainActivity, application value injected", Toast.LENGTH_LONG).show();
		}

		new Child(this);
	}

	// problem: not acting as singletons under their own scopes, when you create a new, a new is return with a new id
	// instead of its previous id, it might be because of the Dagger component recreation in the constructor,
	// todo find out why?

	@OnClick(R.id.btn_thirdA) void thirdA(final View view){

		new ThirdA(this); // two instances of InjectConst created via an @Provides @ThirdAScope
	}

	@OnClick(R.id.btn_thirdB) void thirdB(final View view){

		new ThirdB(this); // and a @Inject constructor and @ThirdBScope class annotation
	}
}


@Scope @Retention(RetentionPolicy.RUNTIME) @interface ActivityScope{ }


@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
@ActivityScope interface ActivityComponent{

	void inject(MainActivity mainActivity); // allows mainActivity to get ActivityModules @Provides,
	// or scope provides, with @Inject constructors
	void inject(Child child);


	Activity getActivity(); // exposed to lower components

}


@Module class ActivityModule{

	private Activity activity;
	public ActivityModule(Activity a){activity = a;}


	@Provides @ActivityScope Activity provideActivity(){ return activity;}

}
