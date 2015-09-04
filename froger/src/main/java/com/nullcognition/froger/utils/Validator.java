package com.nullcognition.froger.utils;
// ersin 03/09/15 Copyright (c) 2015+ All rights reserved.


import android.text.TextUtils;

public class Validator{

	public Validator(){ }

	public boolean validUsername(String username){ return !TextUtils.isEmpty(username); }

}
