package com.nullcognition.practice02.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.nullcognition.practice02.R;
import com.nullcognition.practice02.app.App;
import com.nullcognition.practice02.appclasses.AbstractClass;
import com.nullcognition.practice02.appclasses.Caser;
import com.nullcognition.practice02.appclasses.CaserSingleton;
import com.nullcognition.practice02.appclasses.ClassThatNeedsAnotherModulesProvide;
import com.nullcognition.practice02.appclasses.NativeObject;
import com.nullcognition.practice02.appclasses.ThirdPartyObject;

import javax.inject.Inject;
import javax.inject.Named;

public class Activity00 extends AppCompatActivity{

	@Inject                            Caser            caser;
	@Inject                            CaserSingleton   caserSingleton;
	@Inject                            ThirdPartyObject thirdPartyObject;
	@Inject                            NativeObject     nativeObject;
	@Inject                            AbstractClass    shouldBeConcreteClass00;
	@Inject @Named("NamedConcrete01A") AbstractClass    shouldBeConcreteClass01A;
	@Inject @Named("NamedConcrete01B") AbstractClass    shouldBeConcreteClass01B;

	// this does not work
//	@Inject AbstractClassWithConcreteInjectConstructor shouldBeConcreteClassWithInjectConstructor;

	@Inject ClassThatNeedsAnotherModulesProvide classThatNeedsAnotherModulesProvide;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_00);

		((App) getApplication()).getAppComponent().inject(this);

		if(caser != null &&
				caserSingleton != null &&
				thirdPartyObject != null &&
				nativeObject != null &&
				shouldBeConcreteClass00 != null &&
				shouldBeConcreteClass01A != null &&
				shouldBeConcreteClass01B != null &&
//				shouldBeConcreteClassWithInjectConstructor != null &&
				classThatNeedsAnotherModulesProvide != null){

			Toast.makeText(Activity00.this, "true", Toast.LENGTH_SHORT).show();
		}
	}

}
