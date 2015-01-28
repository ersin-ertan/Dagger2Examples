package com.nullcognition.dagger2examples.gk5885;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nullcognition.dagger2examples.R;

// do we need import javax.inject.Inject;


/**
 * Created by ersin on 27/01/15 at 8:03 AM
 */
public class FragmentDemo extends Fragment {

   interface Injector {

	  FragmentDemo inject(FragmentDemo fragment);
   }

   @Override
   public void onCreate(Bundle savedInstanceState){
	  super.onCreate(savedInstanceState);

	  ((HasComponent<Injector>)getActivity()).getComponent()
											 .inject(this);
   }

   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
	  View rootView = inflater.inflate(R.layout.fragment_demo, container, false);
	  return rootView;
   }
}
