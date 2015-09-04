//package com.nullcognition.dagger2examples.glombard;
//import android.os.Bundle;
//import android.support.v7.app.ActionBarActivity;
//import android.widget.TextView;
//
//import com.nullcognition.dagger2examples.R;
//
//import javax.inject.Inject;
///**
// * Created by ersin on 29/01/15 at 7:25 PM
// */
//public class HelloActivity extends ActionBarActivity implements HelloView {
//
//   @Inject
//   HelloPresenter helloPresenter;
//
//   @Override
//   protected void onCreate(Bundle inBundle){
//	  super.onCreate(inBundle);
//
//	  setContentView(R.layout.activity_main_wtext);
//
//	  Dagger_HelloComponent.builder()
//						   .helloModule(new HelloModule(this))
//						   .build()
//						   .initialize(this);
//
//   }
//
//   @Override
//   protected void onPostResume(){
//	  super.onPostResume();
//	  helloPresenter.requestMessage();
//   }
//
//   @Override
//   public void onMessageUpdated(final String message){
//	  TextView textVeiw = (TextView)findViewById(R.id.textView);
//	  textVeiw.setText(message);
//
//   }
//
//}
