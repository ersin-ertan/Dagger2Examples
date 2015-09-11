package com.nullcognition.subcomponents;
// ersin 11/09/15 Copyright (c) 2015+ All rights reserved.

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Inject;
import javax.inject.Scope;

import butterknife.Bind;
import butterknife.ButterKnife;
import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

public class DataListActivity extends BaseActivity{


	@Inject
	@Bind(R.id.listView) ListView listView;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_data_list);
		ButterKnife.bind(this);
//		listView.setAdapter(new SimpleAdapter(this, ));

	}

	@Override
	protected void setupActivityComponent(){
		App.get(this).getUserComponent()
		   .plus(new DataListActivity.DataListActivityModule(this))
		   .inject(this);
	}

	@Override
	public void finish(){
		super.finish();
		App.get(this).releaseUserComponent();
	}

	@Module public static class DataListActivityModule{

		private DataListActivity dataListActivity;
		public DataListActivityModule(DataListActivity dla){dataListActivity = dla;}

		@Provides @ActivityScope DataListActivity provideDataListActivity(){return dataListActivity;}
	}


	@UserScope @Subcomponent(modules = DataListActivityModule.class)
	public interface DataListActivityComponent{

		DataListActivity inject(DataListActivity dataListActivity);
	}
}


abstract class BaseActivity extends AppCompatActivity{

	@Override protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setupActivityComponent();
	}

	protected abstract void setupActivityComponent();
}


@Scope @Retention(RetentionPolicy.RUNTIME) @interface ActivityScope{ }
