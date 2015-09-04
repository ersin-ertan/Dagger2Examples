//package com.nullcognition.dagger2examples.sven;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
//import com.nullcognition.dagger2examples.R;
//import com.nullcognition.dagger2examples.sven.components.a.AFragment;
//import com.nullcognition.dagger2examples.sven.components.b.BFragment;
//
//import javax.inject.Inject;
//
///**
// * Created by ersin on 15/02/15 at 8:01 PM
// */
//public class MainActivity extends InjectableActivity {
//
//   public static final String FRAGMENT_INSTANCE = "fragmentInstance";
//	private String fragmentInstance = AFragment.class.getSimpleName();
//
//   @Inject
//   SomeMainActivityDependency someMainActivityDependency;
//
//   public void onAnotherActivityClick(final View inView){
//
//	  Intent intent = new Intent(this, AnotherActivity.class);
//	  intent.putExtra(FRAGMENT_INSTANCE, fragmentInstance);
//	  startActivity(intent);
//   }
//
//   public void onComponentAClick(final View inView){
//
//	  getSupportFragmentManager().beginTransaction()
//								 .replace(R.id.fragment, AFragment.newInstance())
//								 .commit();
//
//	  fragmentInstance = AFragment.class.getSimpleName();
//   }
//
//   public void onComponentBClick(final View inView){
//
//	  getSupportFragmentManager().beginTransaction()
//								 .replace(R.id.fragment, BFragment.newInstance())
//								 .commit();
//
//	  fragmentInstance = BFragment.class.getSimpleName();
//   }
//
//
//   @Override
//   protected void onCreate(final Bundle savedInstanceState){
//	  super.onCreate(savedInstanceState);
//
//	  setContentView(R.layout.activity_main_sven);
//
//	  getComponent().inject(this);
//
//	  final TextView textView = (TextView)findViewById(R.id.text);
//	  textView.setText(someMainActivityDependency.getText());
//   }
//}
