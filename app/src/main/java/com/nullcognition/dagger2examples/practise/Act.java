//package com.nullcognition.dagger2examples.practise;
//
//import android.app.Activity;
//import android.os.Bundle;
//
//import com.nullcognition.dagger2examples.R;
//
//import javax.inject.Inject;
//
//import hugo.weaving.DebugLog;
//import lombok.NonNull;
//
///**
// * Created by ersin on 13/02/15 at 6:40 PM
// */
//public class Act extends Activity {
//
//   @Inject
//   SomeService someService;
//
//   @Override
//   protected void onCreate(Bundle savedInstanceState){
//	  super.onCreate(savedInstanceState);
//
//	  App.inject(this);
//
//	  //ButterKnife.inject(this); // like so
//
//	  someService.addLayout(this);
//   }
//}
//
//class SomeService {
//
//   @Inject
//   SomeService(){}
//
//   @DebugLog
//   @NonNull
//   public void addLayout(Activity inActivity){inActivity.setContentView(R.layout.activity_main_wtext); }
//
//}
