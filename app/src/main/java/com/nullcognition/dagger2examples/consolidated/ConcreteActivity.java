//package com.nullcognition.dagger2examples.consolidated;
//import android.app.Activity;
//import android.os.Bundle;
//
//import com.nullcognition.dagger2examples.R;
//
//import dagger.Component;
//import dagger.Module;
//import dagger.Provides;
///**
// * Created by ersin on 28/01/15 at 2:30 PM
// */
//public class ConcreteActivity extends Activity implements HasComponent<ComponentOfActivity> {
//
//
//   @Override
//   public ComponentOfActivity getComponent(){
//	  return componentOfActivity;
//   }
//
//   private ComponentOfActivity componentOfActivity;
//
//   @Override
//   protected void onCreate(Bundle savedInstanceState){
//	  super.onCreate(savedInstanceState);
//
//	  componentOfActivity = Dagger_ComponentOfActivity
//		.builder()
//		.componentOfApplication(((ConcreteApplication)getApplication()).getComponentOfApplication())
//		.moduleOfActivity(new ModuleOfActivity(this))
//		.build();
//	  componentOfActivity.injectActivity(this);
//
//	  setContentView(R.layout.activity_main);
//
//	  if(savedInstanceState == null){
//		 getFragmentManager().beginTransaction()
//							 .add(R.id.container, new ConcreteFragment())
//							 .commit();
//	  }
//   }
//}
//
//@Component(dependencies = ComponentOfApplication.class,
//		   modules = ModuleOfActivity.class)
//interface ComponentOfActivity extends ConcreteFragment.Injector {
//
//   ConcreteActivity injectActivity(ConcreteActivity inConcreteActivity);
//}
//
//@Module
//final class ModuleOfActivity {
//
//   private final ConcreteActivity concreteActivity;
//
//   ModuleOfActivity(ConcreteActivity inConcreteActivity){
//	  concreteActivity = inConcreteActivity;
//   }
//
//   @Provides
//   ConcreteActivity provideActivity(){return concreteActivity;}
//
//
//}
