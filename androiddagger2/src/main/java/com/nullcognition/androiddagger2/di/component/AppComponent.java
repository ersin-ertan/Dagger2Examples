package com.nullcognition.androiddagger2.di.component;

import com.nullcognition.androiddagger2.App;
import com.nullcognition.androiddagger2.di.module.ActivityModule;
import com.nullcognition.androiddagger2.di.module.AppModule;
import com.nullcognition.androiddagger2.di.module.InstancedModuleNeededForAppComponentBuilding;
import com.nullcognition.androiddagger2.di.module.NonInstantiatedModule;
import com.nullcognition.androiddagger2.di.module.SecondModuleButWithActivityScope;
import com.nullcognition.androiddagger2.models.ObjectWithoutProvidesButIsConstructorAnnotated;
import dagger.Component;
import javax.inject.Singleton;

/**
 * Created by mms on 12/20/16.
 */

@Singleton @Component(modules = {
    AppModule.class, NonInstantiatedModule.class, InstancedModuleNeededForAppComponentBuilding.class
}) public interface AppComponent {

  // App can be injected with the object of anything from the @Component(modules={...}) set
  void inject(App app);

  // this allows the activity components to accept an activity module for anysubcomponents of an app
  // like an activity.
  ActivityComponent activityComponent(ActivityModule activityModule,
      SecondModuleButWithActivityScope secondModuleButWithActivityScope);

  // this does not work, becaus only one method can create a given subcomponent
  //ActivityComponent activityComponent(ActivityModule activityModule);

  // objects can also be provided without an @Provides, and without being listed in one of the the module in the set
  // now this object can be provided as if it was in a module, and annotated because the constructor is annotated

  // one of my points of confusion is the purpose of this method, see app notes "A large point..."
  ObjectWithoutProvidesButIsConstructorAnnotated objectWithoutProvidesButIsConstructorAnnotated();
}
