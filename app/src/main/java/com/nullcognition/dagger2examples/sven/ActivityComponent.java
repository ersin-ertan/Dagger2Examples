package com.nullcognition.dagger2examples.sven;

import com.nullcognition.dagger2examples.sven.components.a.AFragment;
import com.nullcognition.dagger2examples.sven.components.a.AModule;
import com.nullcognition.dagger2examples.sven.components.b.BFragment;
import com.nullcognition.dagger2examples.sven.components.b.BModule;

import dagger.Component;

/**
 * Created by ersin on 15/02/15 at 8:00 PM
 */

@Component(dependencies = ApplicationComponent.class,
		   modules = {MainActivityModule.class, AModule.class, BModule.class})
interface ActivityComponent extends AFragment.Injector,
									BFragment.Injector {

   void inject(MainActivity inMainActivity);

   void inject(AnotherActivity inAnotherActivity);

}
