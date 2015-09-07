package com.nullcognition.activitygraphs;
// ersin 06/09/15 Copyright (c) 2015+ All rights reserved.


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

public class MainFragment extends Fragment{

	@Inject ActivityTitleController titleController;

	@Override public void onActivityCreated(final Bundle savedInstanceState){
		super.onActivityCreated(savedInstanceState);

		((MainActivity) getActivity()).getMainActivityComponent().inject(this);
	}

	@Nullable @Override public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState){
//		super.onCreateView(inflater, container, savedInstanceState); // could have used a layout file too
		// but would it have the ability to retain its components states, this way you can extend the component
		// module composition to the views and layouts to keep them in the object graph
		TextView tv = new TextView(getActivity());
		tv.setGravity(Gravity.CENTER);
		tv.setText("Hello, World");
		return tv;
	}
	@Override public void onResume(){
		super.onResume();
		titleController.setTitle(MainFragment.class.getSimpleName());
	}
}
