//package com.nullcognition.dagger2examples.sven;
//
//import android.os.Bundle;
//import android.support.v7.app.ActionBarActivity;
//
//import com.nullcognition.dagger2examples.sven.inject.HasComponent;
//
///**
// * Created by ersin on 15/02/15 at 8:01 PM
// */
//public class InjectableActivity extends ActionBarActivity implements HasComponent<ActivityComponent> {
//
//   protected ActivityComponent activityComponent;
//
//   @Override
//   public ActivityComponent getComponent(){
//	  return activityComponent;
//   }
//
//   @Override
//   protected void onCreate(final Bundle savedInstanceState){
//	  super.onCreate(savedInstanceState);
//
//	  activityComponent = ActivityComponentProvider.activityComponent(this);
//   }
//}
