package com.nullcognition.androiddagger2.di.component;

import com.nullcognition.androiddagger2.FourthActivity;
import com.nullcognition.androiddagger2.di.module.MyModuleC;
import com.nullcognition.androiddagger2.di.module.MyModuleD;
import dagger.Subcomponent;

/**
 * Created by mms on 12/23/16.
 */

@Subcomponent(modules = { MyModuleC.class, MyModuleD.class })
public interface ComponentWithInterfaceBuilder {

  void inject(FourthActivity fourthActivity);

  @Subcomponent.Builder interface CompBuilder {
    abstract ComponentWithInterfaceBuilder build();

    abstract CompBuilder myModuleC(MyModuleC myModuleC);

    abstract CompBuilder myModuleD(MyModuleD myModuleD);

    // All other abstract methods must take a single argument and must return void,
    // the Builder type, or a supertype of the builder.
  }
}
