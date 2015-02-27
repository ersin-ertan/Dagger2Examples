package com.nullcognition.dagger2examples.joesteele;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by ersin on 26/02/15 at 7:19 PM
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {}
