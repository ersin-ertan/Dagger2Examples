package com.nullcognition.dagger2examples.glombard;
import javax.inject.Inject;
/**
 * Created by ersin on 29/01/15 at 7:38 PM
 */
public class HelloPresenterImpl implements HelloPresenter {

   private final HelloView       view;
   private final MessageSupplier messageSupplier;

   @Inject
   public HelloPresenterImpl(HelloView inHelloView, MessageSupplier inMessageSuplier){

	  view = inHelloView;
	  this.messageSupplier = inMessageSuplier;
   }

   public void requestMessage(){

	  view.onMessageUpdated(messageSupplier.getMessage());
   }
}
