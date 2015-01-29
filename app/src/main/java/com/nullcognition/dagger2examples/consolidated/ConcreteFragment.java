package com.nullcognition.dagger2examples.consolidated;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nullcognition.dagger2examples.R;
/**
 * Created by ersin on 28/01/15 at 6:04 PM
 */

public class ConcreteFragment extends Fragment {

   interface Injector {

	  ConcreteFragment inject(ConcreteFragment fragment);
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
