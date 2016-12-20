package com.nullcognition.androiddagger2.di.component;

import com.nullcognition.androiddagger2.FirstActivity;
import com.nullcognition.androiddagger2.SecondActivity;
import com.nullcognition.androiddagger2.di.module.ActivityModule;
import com.nullcognition.androiddagger2.di.module.SecondModuleButWithActivityScope;
import com.nullcognition.androiddagger2.di.scope.ActivityScope;
import dagger.Subcomponent;

/**
 * Created by mms on 12/20/16.
 */

@ActivityScope
// components, especially subscomponents may be annotated with the scope they provide to,
// and all of their object they provide must adhere to no higher than the this scope, thus you will
// not see @singleton annotated provides from any of the modules within this subcomponents module = {...} set
@Subcomponent(modules = { ActivityModule.class, SecondModuleButWithActivityScope.class })
public interface ActivityComponent {

  void inject(FirstActivity firstActivity);

  void inject(SecondActivity secondActivity);
}
