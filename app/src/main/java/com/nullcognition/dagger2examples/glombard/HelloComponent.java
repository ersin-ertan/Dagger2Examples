package com.nullcognition.dagger2examples.glombard;
import dagger.Component;
/**
 * Created by ersin on 29/01/15 at 7:32 PM
 */

@ActivityScope
@Component(modules = HelloModule.class)
public interface HelloComponent {

   void initialize(HelloActivity inHelloActivity);
}
