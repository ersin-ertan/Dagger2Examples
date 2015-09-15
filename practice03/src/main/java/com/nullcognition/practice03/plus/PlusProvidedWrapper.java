package com.nullcognition.practice03.plus;
// ersin 14/09/15 Copyright (c) 2015+ All rights reserved.


import android.content.Context;

import com.nullcognition.practice03.App;

import javax.inject.Inject;

public class PlusProvidedWrapper{

	@Inject PlusProvided plusProvided;

	public PlusProvidedWrapper(Context context, boolean isTwo){

		if(!isTwo){ App.get(context).getPlusComponent().inject(this); }
		else{App.get(context).getPlusTwoComponent().inject(this); }
	}

	public String getPlusProvidedInt(){ return String.valueOf(plusProvided.i); }
}
