package com.nullcognition.dagger2examples.xianglidai;
import dagger.Component;
/**
 * Created by ersin on 28/01/15 at 3:43 AM
 */

@PerActivity
@Component(dependencies = ComponentApplication.class, modules = ModuleActivity.class)
public interface ComponentActivityHome extends AbstractComponentActivityDemo {

   // in order for ApplicationDemo to correctly build the application Component, the correctly inject class must be provided
   void inject(ActivityHome homeActivity);


   void inject(FragmentHome homeFragment);
}
