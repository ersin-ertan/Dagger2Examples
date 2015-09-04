//package com.nullcognition.dagger2examples.xianglidai;
//import android.app.Fragment;
//import android.location.LocationManager;
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//
//import javax.inject.Inject;
//
//import static android.view.Gravity.CENTER;
///**
// * Created by ersin on 28/01/15 at 3:41 AM
// */
//
//public class FragmentHome extends Fragment {
//
//   @Inject
//   ControllerActivityTitle titleController;
//   @Inject
//   LocationManager         locationManager;
//
//   @Override
//   public void onActivityCreated(Bundle savedInstanceState){
//	  super.onActivityCreated(savedInstanceState);
//	  ((ActivityHome)getActivity()).initComponent()
//								   .inject(this);
//   }
//
//   @Override
//   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
//	  TextView tv = new TextView(getActivity());
//	  tv.setGravity(CENTER);
//	  tv.setText("Hello, World");
//
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
