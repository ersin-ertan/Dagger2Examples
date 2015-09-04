//package com.nullcognition.dagger2examples.konmik;
//
///**
// * Created by ersin on 13/02/15 at 4:19 PM
// */
//
//// this is a simple component
////@Component
////public interface AppComponent { // @Component says to Dagger 2 that it should generate code for injection into MainActivity.
////
////   void inject(ActivityKon inActivityKon);
////}
//
//// this is a component for a module
//
//import javax.inject.Singleton;
//
//import dagger.Component;
//
//@Singleton //  this component will keep singletons instances inside.
//@Component(modules = AppModuleKon.class) //  AppModule will be used for injections by AppComponent.
//interface AppComponent {
//
//   void inject(ActivityKon activity); // inject more than just an activity
//
////   void inject(MainFragment fragment);
//
////   void inject(MainToolbarView view);
//}
