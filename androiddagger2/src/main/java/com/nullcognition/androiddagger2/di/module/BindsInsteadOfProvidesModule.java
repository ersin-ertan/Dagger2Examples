package com.nullcognition.androiddagger2.di.module;

import com.nullcognition.androiddagger2.models.BindsObject;
import com.nullcognition.androiddagger2.models.BindsObjectRequiringDependency;
import dagger.Binds;
import dagger.Module;

/**
 * Created by mms on 12/21/16.
 *
 * @Provides and @Binds cant be in the same module, @Provides has an instance, @Binds does not
 *
 * note that this is an interface
 */

@Module public interface BindsInsteadOfProvidesModule {

  // binds object is provided else where and is a subtype of bindsObjectRequiringDependency,
  // thus what will be returned is the bindsObject
  @Binds BindsObjectRequiringDependency bindBindsObjectWithDependency(BindsObject bindsObject);
}
