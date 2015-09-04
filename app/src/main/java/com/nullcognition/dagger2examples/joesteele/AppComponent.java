//package com.nullcognition.dagger2examples.joesteele;
//
//import com.squareup.okhttp.OkHttpClient;
//
//import javax.inject.Singleton;
//
//import dagger.Component;
//
///**
// * Created by ersin on 26/02/15 at 7:15 PM
// */
//
//@Singleton
//@Component(modules = {AppModule.class, NetworkModule.class})
//public interface AppComponent {
//
//   ComponentTest app();
////
//   OkHttpClient httpClient();
//
//   void inject(ComponentTest app);
//
//   final static class Initializer {
//
//	  static AppComponent buildAndInject(ComponentTest app){
//		 AppComponent component = com.nullcognition.dagger2examples.joesteele.Dagger_AppComponent.builder()
//													 .appModule(new AppModule(app))
//													 .build();
//		 component.inject(app);
//		 return component;
//	  }
//
//	  private Initializer(){}
//   }
//}
