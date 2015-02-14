package com.nullcognition.dagger2examples.konmik;

import dagger.Component;

/**
 * Created by ersin on 13/02/15 at 4:19 PM
 */


@Component
public interface AppComponent { // @Component says to Dagger 2 that it should generate code for injection into MainActivity.

   void inject(ActivityKon inActivityKon);
}
