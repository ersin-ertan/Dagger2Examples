package com.nullcognition.dagger2examples.gk5885;
import dagger.Component;
/**
 * Created by ersin on 27/01/15 at 7:51 AM
 */

@Component(modules = ModuleApplication.class)
interface ComponentApplicationDemo2 {

   ApplicationDemo injectApplication(ApplicationDemo inApplicationDemo);
}
