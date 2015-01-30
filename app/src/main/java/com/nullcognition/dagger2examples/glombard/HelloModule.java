package com.nullcognition.dagger2examples.glombard;
import dagger.Module;
import dagger.Provides;
/**
 * Created by ersin on 29/01/15 at 7:33 PM
 */

@Module
public class HelloModule {

   private final HelloView view;

   public HelloModule(HelloView inHelloView){
	  view = inHelloView;
   }

   @Provides
   HelloView helloView(){
	  return view;
   }

   @Provides
   MessageSupplier messageSupplier(MessageSupplierImpl impl){
	  return impl;
   }

   @Provides
   TimeService timeService(TimeServiceImpl impl){
	  return impl;
   }

   @Provides
   HelloPresenter helloPresenter(HelloPresenterImpl impl){
	  return impl;
   }
}
