package com.nullcognition.dagger2examples.glombard;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;
/**
 * Created by ersin on 29/01/15 at 7:24 PM
 */

@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {}
