package com.nullcognition.practice05;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Random;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Scope;

import autodagger.AutoComponent;
import autodagger.AutoInjector;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.Lazy;


@MainActivity.ActivityScope(MainActivity.class) @AutoComponent(dependencies = App.class, modules = MainActivityModule.class) @AutoInjector
public class MainActivity extends AppCompatActivity{


	private MainActivityComponent activityComponent;
	public MainActivityComponent getActivityComponent(){return activityComponent;}

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);

		if(activityComponent == null){
			activityComponent = DaggerMainActivityComponent.builder()
			                                               .appComponent(App.get(this).getAppComponent())
			                                               .mainActivityModule(new MainActivityModule(this))
			                                               .build();
		}
		activityComponent.inject(this); // injected into self, @Injects can now get fulfilled
	}

	@Bind(R.id.textView) TextView textView;

	@Inject Lazy<ProvidedLazily> providedLazily;
	boolean isDone;

	@OnClick(R.id.btn_getLazy) void getLazy(final View view){
		textView.setText("lazy already gotten");
		if(!isDone){
			isDone = true;
			textView.setText("starting get lazy");
			Toast.makeText(MainActivity.this, "ProvidedLazySleep 3, 2, 1", Toast.LENGTH_SHORT).show();
		}

		new Handler().postDelayed(new Runnable(){
			@Override public void run(){
				textView.setText(providedLazily.get().getText());
			}
		}, 500);
	}

	// provides a new binding each time get is called
	@Inject Provider<ProvidedNewInstance> providedNewInstanceProvider;

	@OnClick(R.id.btn_getNew) void getNew(final View view){
		textView.setText(String.valueOf(providedNewInstanceProvider.get().id));
	}

	//	@MainActivity.ActivityScope(MainActivity.class) // because the object was scoped a new provided was not provided
	public static class ProvidedNewInstance{

		public final int id;

		@Inject public ProvidedNewInstance(){id = new Random(System.currentTimeMillis()).nextInt();}
	}


	@MainActivity.ActivityScope(MainActivity.class)
	public static class ProvidedLazily{

		@Inject public ProvidedLazily(){
			try{ Thread.sleep(3_000);}
			catch(InterruptedException e){ e.printStackTrace();}
		}

		public String getText(){return "provided lazy"; }
	}


	@Scope @Retention(RetentionPolicy.RUNTIME) public @interface ActivityScope{

		Class<?> value();
	}
}

