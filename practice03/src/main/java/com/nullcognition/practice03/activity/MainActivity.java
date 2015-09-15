package com.nullcognition.practice03.activity;

import android.app.Application;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.nullcognition.practice03.App;
import com.nullcognition.practice03.Provided;
import com.nullcognition.practice03.R;
import com.nullcognition.practice03.plus.PlusProvidedWrapper;
import com.nullcognition.practice03.plus.plustwo.PlusProvidedWrapperTwo;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{

	@Inject Application application;
	@Inject Provided    provided;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);

		// requires the cast to get at the inject method if it only exists in AppComponentEx
//		((AppComponentEx) App.get(this).getAppComponent())
//				.inject(this);

		// cast not needed if needing only from AppComponent
		App.get(this).getAppComponent().inject(this);

		if(application != null &&
				provided != null){
			Toast.makeText(MainActivity.this, "true provided i:" + provided.i, Toast.LENGTH_SHORT).show();
		}
	}
	// when both @Inject and @Provides is available to use, @Provides will trump
	// @Inject

	// now to test the scopes - to do this, create another component with
	// its own scope and have another class @Inject a Provided, annotate the
	@OnClick(R.id.btn_plusProvided) void plusProvided(final View view){

		App.get(this).createPlusComponent();

		PlusProvidedWrapper plusProvidedWrapper = new PlusProvidedWrapper(this, false);

		((TextView) findViewById(R.id.txtV_plusComponent))
				.setText("plusprovidedwraper from @Provided @PlusScope,\n@Inject plusprovided.i:" + plusProvidedWrapper.getPlusProvidedInt());

	}

	// Provided class, then annotate the @Provides with a different scope

	@OnClick(R.id.btn_plusProvidedScoped) void plusProvidedTwo(final View view){

		// don't release the plus component, but build off of it and ask for the object from the
		// new component without using @Provides, so via @Inject constructor and see if you will
		// get the object

		App.get(this).createPlusTwoComponent();

		PlusProvidedWrapper plusProvidedWrapper = new PlusProvidedWrapper(this, true);

		((TextView) findViewById(R.id.txtV_plusTwoComponent))
				.setText("plusprovidedwraper from @Inject constructor with class scope @PlusTwoScope,\n@Inject plusprovided.i:" + plusProvidedWrapper.getPlusProvidedInt());


		// the second class is to ensure that the class wrapper of the @Inject does not have an effect on the binding


		PlusProvidedWrapperTwo plusProvidedWrappertwo = new PlusProvidedWrapperTwo(this);

		((TextView) findViewById(R.id.txtV_plusTwoComponentTwo))
				.setText("plusprovidedwraperTWO from @Inject constructor with class scope @PlusTwoScope,\n@Inject plusprovided.i:" + plusProvidedWrappertwo.getPlusProvidedInt());
	}

	@OnClick(R.id.btn_releaseComponents) void releaseComponents(final View view){

		App.get(this).releasePlusComponent();
		App.get(this).releasePlusTwoComponent();
	}
}
