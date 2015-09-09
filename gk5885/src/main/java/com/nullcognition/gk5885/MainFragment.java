package com.nullcognition.gk5885;
// ersin 09/09/15 Copyright (c) 2015+ All rights reserved.


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment{

	@Override public void onCreate(final Bundle savedInstanceState){
		super.onCreate(savedInstanceState);

		((HasComponent<Injector>) getActivity()).getComponent().inject(this);
	}

	@Nullable @Override public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState){
		super.onCreateView(inflater, container, savedInstanceState);
		View rootView = inflater.inflate(R.layout.fragment_main, container, false);
		return rootView;
	}
}
