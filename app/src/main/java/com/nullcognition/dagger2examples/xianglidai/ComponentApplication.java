//package com.nullcognition.dagger2examples.xianglidai;
///**
// * Created by ersin on 28/01/15 at 2:40 AM
// */
//
//import android.location.LocationManager;
//
//import javax.inject.Singleton;
//
//import dagger.Component;
//
///**
// * A component whose lifetime is the life of the application.
// */
//
//@Singleton // Constraints this component to one-per-application or unscoped bindings.
//@Component(modules = ModuleApplicationDemo.class)
//public interface ComponentApplication {
//
//   // Field injections of any dependencies of the DemoApplication
//   void inject(ApplicationDemo application);
//
//   // Exported for child-components.
//
//   ApplicationDemo application();
//
//   LocationManager locationManager();
//}
