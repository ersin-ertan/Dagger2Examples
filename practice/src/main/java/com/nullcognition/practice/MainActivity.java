package com.nullcognition.practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity{

	@Inject AndroidPhone androidPhone; // onCreate (rotation) provides object, does not raise the id

	// since applePhone is not injected, you must get an instance from the object graph, instead of
	// relaying on the @Inject annotation to provide it for you
	ApplePhone applePhone; // onCreate (rotation) provides a new object, raising the id

	@Bind(R.id.textView) TextView display;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ButterKnife.bind(this);

		((Mall) getApplication()).getStoreComponent().inject(this);

		Toast.makeText(MainActivity.this, "androidPhone:" + androidPhone.callFriend(), Toast.LENGTH_SHORT).show();
		// androidPhone is passed to the activity on the .inject(this) method
		// since its module is a singleton, calling inject or multiple times for more instances will
		// yield the same instance from the component
	}

	@OnClick(R.id.btn_injMethodCache) void injMethodCache(final View view){
		getApplePhone(true);
		display.setText("ApplePhone Cached:" + applePhone.getText());
	}

	@OnClick(R.id.btn_injMethodNew) void injMethodNew(final View view){
		getApplePhone(false);
		display.setText("ApplePhone New:" + applePhone.getText());
	}

	private void getApplePhone(boolean getFromCache){
		if(getFromCache){
			if(applePhone == null){
				StoreComponent sc = ((Mall) getApplication()).getStoreComponent();
				TechStoreComponent tsc = (TechStoreComponent) sc;
				applePhone = tsc.applePhone();
			}
			return;
		}
		// get new instance from component
		StoreComponent     sc  = ((Mall) getApplication()).getStoreComponent();
		TechStoreComponent tsc = (TechStoreComponent) sc;
		applePhone = tsc.applePhone();
	}
}
