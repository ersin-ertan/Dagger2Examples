//package com.nullcognition.dagger2examples.consolidated;
//import android.app.Application;
//
//import dagger.Component;
//import dagger.Module;
//import dagger.Provides;
///**
// * Created by ersin on 28/01/15 at 2:42 PM
// */
//public class ConcreteApplication extends Application {
//
//   private ComponentOfApplication componentOfApplication;
//
//   ComponentOfApplication getComponentOfApplication(){ return componentOfApplication; }
//
//   @Override
//   public void onCreate(){
//	  super.onCreate();
//
//	  componentOfApplication = Dagger_ComponentOfApplication.builder()
//															.moduleOfApplication(new ModuleOfApplication(this))
//															.build();
//
//	  componentOfApplication.injectApplication(this);
//   }
//
//}
//
//@Component(modules = ModuleOfApplication.class)
//interface ComponentOfApplication {
//
//   ConcreteApplication injectApplication(ConcreteApplication inConcreteApplication);
//}
//
//@Module
//final class ModuleOfApplication {
//
//   private final Application application;
//
//
//   ModuleOfApplication(Application inApplication){
//	  application = inApplication;
//   }
//
//   @Provides
//   Application provideApplication(){return application;}
//}
