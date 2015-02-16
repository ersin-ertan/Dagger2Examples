package com.nullcognition.dagger2examples.sven.components.b;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nullcognition.dagger2examples.R;
import com.nullcognition.dagger2examples.sven.inject.HasComponent;

import javax.inject.Inject;

public class BFragment extends Fragment {

   public interface Injector {

	  void inject(BFragment fragment);
   }

   @Inject
   SomeBDependency mSomeBDependency;

   public static BFragment newInstance(){
	  return new BFragment();
   }

   @Override
   public void onAttach(final Activity activity){
	  super.onAttach(activity);

	  ((HasComponent<Injector>)activity).getComponent()
										.inject(this);
   }

   @Override
   public View onCreateView(final LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable final Bundle savedInstanceState){

	  final View view = inflater.inflate(R.layout.fragment_component, container, false);

	  final TextView textView = (TextView)view.findViewById(R.id.text);
	  textView.setText(mSomeBDependency.getText());

	  return view;
   }
}
