//package com.nullcognition.dagger2examples.gk5885;
//import android.app.Activity;
//import android.os.Bundle;
//
//import com.nullcognition.dagger2examples.R;
///**
// * Created by ersin on 27/01/15 at 7:59 AM
// */
//public class ActivityDemo extends Activity implements HasComponent<ComponentActivityDemo> {
//
//   private ComponentActivityDemo component;
//
//   @Override
//   protected void onCreate(Bundle savedInstanceState){
//	  super.onCreate(savedInstanceState);
//
//	  component = Dagger_ComponentActivityDemo.builder()
//											  .componentApplicationDemo2(((ApplicationDemo)getApplication()).getComponent())
//											  .moduleActivity(new ModuleActivity(this))
//											  .build();
//	  component.injectActivity(this);
//
//	  setContentView(R.layout.activity_main);
//
//	  if(savedInstanceState == null){
//		 getFragmentManager().beginTransaction()
//							 .add(R.id.container, new FragmentDemo())
//							 .commit();
//	  }
//   }
//
//   @Override
//   public ComponentActivityDemo getComponent(){
//	  return component;
//   }
//}
