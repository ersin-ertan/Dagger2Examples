//package com.nullcognition.dagger2examples.googleactivitygraphs.ui;
//
//import android.app.Activity;
//import android.location.LocationManager;
//import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//import 	android.support.v4.app.*;
//
//
//import com.nullcognition.dagger2examples.googleactivitygraphs.AbstractActivityComponent;
//import com.nullcognition.dagger2examples.googleactivitygraphs.DemoApplication;
//import com.nullcognition.dagger2examples.googleactivitygraphs.PerActivity;
//
//import javax.inject.Inject;
//
//import static android.view.Gravity.CENTER;
//
///**
// * Created by ersin on 18/02/15 at 12:04 AM
// */
//
//public class HomeActivity extends Activity {
//
//   @Inject
//   LocationManager locationManager;
//
//   @Override
//   HomeComponent initComponent(){
//	  return component;
//   }
//
//   @Override
//   protected void onCreate(Bundle savedInstanceState){
//	  super.onCreate(savedInstanceState);
//	  Dagger_HomeActivity_HomeComponent.builder()
//									   .applicationComponent(((DemoApplication)getApplication()).component())
//									   .activityModule(new AbstractActivityComponent.ActivityModule(this))
//									   .build()
//									   .inject(this);
//
//	  if(savedInstanceState == null){
//		 getFragmentManager().beginTransaction()
//									.add(android.R.id.content, new HomeFragment())
//									.commit();
//	  }
//
//	  // TODO do something with the injected dependencies here!
//   }
//}
//
//
//public class HomeFragment extends Fragment {
//
//   @Inject
//   ActivityTitleController titleController;
//
//   @Override
//   public void onActivityCreated(Bundle savedInstanceState){
//	  super.onActivityCreated(savedInstanceState);
//	  ((AbstractDemoActivity)getActivity()).inject(this); // this is not even a class in the project...
//   }
//
//   @Override
//   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//	  TextView tv = new TextView(getActivity());
//	  tv.setGravity(CENTER);
//	  tv.setText("Hello, World");
//	  return tv;
//   }
//
//   @Override
//   public void onResume(){
//	  super.onResume();
//
//	  // Fragments should not modify things outside of their own view. Use an external controller to
//	  // ask the activity to change its title.
//	  titleController.setTitle("Home Fragment");
//   }
//}
//
//@PerActivity
//class ActivityTitleController {
//
//   private final Activity activity;
//
//   @Inject
//   public ActivityTitleController(Activity activity){
//	  this.activity = activity;
//   }
//
//   public void setTitle(CharSequence title){
//	  activity.setTitle(title);
//   }
//}
