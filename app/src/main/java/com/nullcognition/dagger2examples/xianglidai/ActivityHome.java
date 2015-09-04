//package com.nullcognition.dagger2examples.xianglidai;
//import android.location.LocationManager;
//import android.os.Bundle;
//import android.support.v4.app.FragmentActivity;
//
//import javax.inject.Inject;
///**
// * Created by ersin on 28/01/15 at 3:46 AM
// */
//public class ActivityHome extends FragmentActivity {
//
//   @Inject
//   LocationManager locationManager;
//   private ComponentActivityHome component;
//
//   ComponentActivityHome initComponent(){
//	  return component;
//   }
//
//   @Override
//   protected void onCreate(Bundle savedInstanceState){
//	  super.onCreate(savedInstanceState);
//
//
//
//	  this.component = Dagger_ComponentActivityHome.builder()
//												   .componentApplication( ( (ApplicationDemo)getApplication() ).component() )
//												   .moduleActivity( new ModuleActivity( this ) )
//												   .build();
//	  this.component.inject(this);
//
//	  if(savedInstanceState == null){
//		 getFragmentManager().beginTransaction()
//							 .add(android.R.id.content, new FragmentHome())
//							 .commit();
//	  }
//
//	  // TODO do something with the injected dependencies here!
//   }
//}
