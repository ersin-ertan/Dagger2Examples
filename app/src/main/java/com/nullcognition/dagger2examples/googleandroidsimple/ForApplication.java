package com.nullcognition.dagger2examples.googleandroidsimple;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;
/**
 * Created by ersin on 27/01/15 at 8:56 PM
 */

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface ForApplication {}
