package com.nullcognition.practice.modules;
// ersin 04/09/15 Copyright (c) 2015+ All rights reserved.

import com.nullcognition.practice.models.Toilet;
import com.nullcognition.practice.models.ToiletPaper;

import dagger.Module;
import dagger.Provides;

@Module
public class ToiletModule{

	@Provides public Toilet getToilet(){return new Toilet();}

	@Provides public ToiletPaper getToiletPaper(){return new ToiletPaper();}
}
