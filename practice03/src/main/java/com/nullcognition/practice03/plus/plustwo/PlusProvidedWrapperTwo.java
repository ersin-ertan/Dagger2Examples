package com.nullcognition.practice03.plus.plustwo;
// ersin 15/09/15 Copyright (c) 2015+ All rights reserved.


import android.content.Context;

import com.nullcognition.practice03.App;
import com.nullcognition.practice03.plus.PlusProvided;

public class PlusProvidedWrapperTwo{

	// may only be created under the two component

	//	@Inject PlusProvided plusProvided;
	PlusProvided plusProvidedExposed;

	public PlusProvidedWrapperTwo(Context context){

//		App.get(context).getPlusTwoComponent().inject(this);

		// attempt to see if exposed object is provided with different scope

		plusProvidedExposed = App.get(context).getPlusTwoComponent().plusProvided();
	}

	//	public String getPlusProvidedInt(){ return String.valueOf(plusProvided.i);
	public String getPlusProvidedInt(){ return String.valueOf(plusProvidedExposed.i); }

}
