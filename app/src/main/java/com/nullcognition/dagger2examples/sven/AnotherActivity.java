package com.nullcognition.dagger2examples.sven;

import android.os.Bundle;
import android.util.Log;

import com.nullcognition.dagger2examples.R;
import com.nullcognition.dagger2examples.sven.components.a.AFragment;
import com.nullcognition.dagger2examples.sven.components.b.BFragment;

/**
 * Created by ersin on 15/02/15 at 8:00 PM
 */
public class AnotherActivity extends InjectableActivity {

   String fragmentInstance = AFragment.class.getSimpleName();

   @Override
   protected void onCreate(final Bundle inBundle){
	  super.onCreate(inBundle);

	  setContentView(R.layout.activity_another);
	  getComponent().inject(this);

	  getClassNameFromIntent();

   }

   private void getClassNameFromIntent(){

	  fragmentInstance = getIntent().getStringExtra(MainActivity.FRAGMENT_INSTANCE);

	  switch(fragmentInstance){
		 case "AFragment":
			getSupportFragmentManager().beginTransaction()
									   .replace(R.id.fragment, AFragment.newInstance())
									   .commit();
			break;
		 case "BFragment":
			getSupportFragmentManager().beginTransaction()
									   .replace(R.id.fragment, BFragment.newInstance())
									   .commit();
			break;
		 default:
			Log.e("Switch fragmentInstance", "Default parameter invalid");
			throw new IllegalArgumentException();
	  }


   }
}
