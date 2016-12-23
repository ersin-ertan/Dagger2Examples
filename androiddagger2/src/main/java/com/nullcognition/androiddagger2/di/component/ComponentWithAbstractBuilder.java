package com.nullcognition.androiddagger2.di.component;

import com.nullcognition.androiddagger2.FourthActivity;
import com.nullcognition.androiddagger2.di.module.MyModuleA;
import com.nullcognition.androiddagger2.di.module.MyModuleB;
import dagger.Subcomponent;

/**
 * Created by mms on 12/23/16.
 */
@Subcomponent(modules = { MyModuleA.class, MyModuleB.class })
public interface ComponentWithAbstractBuilder {

  void inject(FourthActivity fourthActivity);

  static abstract class ComponentBuilder {

    public abstract ComponentWithAbstractBuilder build();

    public abstract ComponentBuilder myModuleA(MyModuleA myModuleA);

    public abstract ComponentBuilder myModuleB(MyModuleB myModuleB);

    // All other abstract methods must take a single argument and must return void,
    // the Builder type, or a supertype of the builder.
  }
}
