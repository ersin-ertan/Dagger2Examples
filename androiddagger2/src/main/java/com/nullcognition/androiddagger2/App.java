package com.nullcognition.androiddagger2;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.nullcognition.androiddagger2.di.component.AppComponent;
import com.nullcognition.androiddagger2.di.component.DaggerAppComponent;
import com.nullcognition.androiddagger2.di.module.AppModule;
import com.nullcognition.androiddagger2.di.module.InstancedModuleNeededForAppComponentBuilding;
import com.nullcognition.androiddagger2.models.ObjectWithoutProvidesButIsConstructorAnnotatedUnscoped;
import com.nullcognition.androiddagger2.models.StringObject;
import javax.inject.Inject;

/**
 * Created by ersin-ertan on 12/20/16.
 *
 * Gregory Kick second talk on the more advanced parts of dagger2
 * Notes from https://www.youtube.com/watch?v=iwjXqRlEevg
 *
 * Whats going on: using the dagger-android artifact
 *
 * First and second activity both inject the singleton object which is large object with one
 * instance between both activities
 *
 * StaticProvidesSingleton in NonInstantiatedModule showcases objects that are created 15-20% fast
 * due to the static keyword in the provides
 * It also shows that modules need not be created
 *
 * InstancedModuleNeededForAppComponentBuilding is required here
 *
 * but NonInstantiatedModule is not, besides being deprecated by design(if you uncomment the line),
 * I've also set the module to block construction, further enforcing that only static modules
 * should
 * be stored in that module
 *
 * instancedModuleNeededForAppComponentBuilding requires one module object, but that need not be
 * true, see ActivityComponent which has two modules in its subcomponets list, so when you look at
 * AppComponent's activityComponent() which is taking in two modules, when you create activity
 * component you must provide both modules.
 *
 * components, especially subscomponents may be annotated with the scope they provide to,
 * and all of their object they provide must adhere to no higher than the this scope, thus you will
 * not see @singleton annotated provides from any of the modules within activity subcomponents
 * module = {...} set
 *
 * to better showcase this, we have ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecy,
 * for the @Singleton scope, but ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecyForActivityScope
 * is explicitly for activity scope, keep in mind that this object may ask for dependencies from
 * both the @Singleton scope aka any module and @provides, or any ObjectWithoutProvidesButIsConstructorAnnotated
 * and even ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecy, because the
 * subcomponent has access to the parent components provideables/dependencies, which can then have
 * dependencies
 * from higher up on the component structure
 *
 * ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecyForActivityScope has dependencies
 * of both scopes, by requiring the stringObject and intObject, from @singleton and @Activity
 * scopes respectively.
 *
 * A large point of my confusion was in AppComponent, figuring out why
 * ObjectWithoutProvidesButIsConstructorAnnotated
 * has a method which would expose the object to dependent objects, I think that the purpose of
 * this, and it will be something that you won't see very often any more is that before
 * subcomponents existing, you would declare componet's modules and its dependencies. Just try
 * command+P on @Component(here), which will show you modules and dependencies. Because both of
 * these can be filled, it is useful for creating a subcomponent in theory but not a @Subcomponent
 * in practice. The reason is that a @Subcomponent will acquire all of the parent components
 * provide
 * -ables. Where as doing the more manual version of declaring the @Component(dependencies = {...})
 * allowe you to list exactly which dependencies you want to expose down to your child component.
 * Thus you would use do something like StringObject stringObject(); as a method, which you would
 * then get the object via ((App) getApplication()).getAppComponent().stringObject(). This is
 * usually where you would create your new module and populate it with whatever you needed in its
 * constructor. So you are saying, I don't need a module of @Provides, I just need one object
 * and that object is obtained and exposed explicitly from within the graph.
 * This is a form of manual injection. See firstActivity for owpbica = ...;
 *
 * ObjectWithoutProvidesButIsConstructorAnnotatedUnscoped has the @Inject on the constructor, and
 * is unscoped with regards to the class annotation, thus it can be injected into any scope in the
 * graph.
 *
 * BindsObjectRequiringDependency is showcasing the interface module with @Binds instead of
 *
 * @Provides for objects that are passed in as the dependency and returned as the reply
 *
 * Use of @Provider and @Lazy in the injecting class to showcase how a your call to get the object
 * can return a new object on each call(for provider) and how you can delay initialization with
 * @Lazy and but use the get as if it was a singleton for that calling scope.
 *
 * Using component builders: Each component dependency and module without a visible default
 * constructor must be set explicitly, but any module with a default or no-args constructor
 * accessible to the component implementation may be elided.
 * component has no component dependencies and only no-arg modules, the generated component will
 * also have a factory method create(). SomeComponent.create() and SomeComponent.builder().build()
 * are both valid
 */

public class App extends Application {

  AppComponent appComponent;

  @Inject ObjectWithoutProvidesButIsConstructorAnnotatedUnscoped canBeInjectedAnywhere;

  public static void toastLog(Context context, String s) {
    Toast.makeText(context, s, Toast.LENGTH_SHORT).show();
    Log.v("app", s);
  }

  public static void toastLog(Context context, boolean b) {
    Toast.makeText(context, String.valueOf(b), Toast.LENGTH_SHORT).show();
    Log.v("app", String.valueOf(b));
  }

  public static void toastLog(Context context, int i) {
    Toast.makeText(context, String.valueOf(i), Toast.LENGTH_SHORT).show();
    Log.v("app", String.valueOf(i));
  }

  public AppComponent getAppComponent() {
    return appComponent;
  }

  @Override public void onCreate() {
    super.onCreate();
    appComponent = DaggerAppComponent.builder()
        .appModule(new AppModule(this))
        .instancedModuleNeededForAppComponentBuilding(
            new InstancedModuleNeededForAppComponentBuilding(new StringObject("s")))
        //.nonInstantiatedModule(new NonInstantiatedModule())
        .build();
    appComponent.inject(this);

    Log.v("inj", canBeInjectedAnywhere.toString());
  }
}
