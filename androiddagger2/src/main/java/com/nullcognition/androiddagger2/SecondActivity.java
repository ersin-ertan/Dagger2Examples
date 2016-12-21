package com.nullcognition.androiddagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import com.nullcognition.androiddagger2.di.component.ActivityComponent;
import com.nullcognition.androiddagger2.di.module.ActivityModule;
import com.nullcognition.androiddagger2.di.module.SecondModuleButWithActivityScope;
import com.nullcognition.androiddagger2.models.AppScopeSharedSingleton;
import com.nullcognition.androiddagger2.models.IntObject;
import com.nullcognition.androiddagger2.models.ObjectWithoutProvidesButIsConstructorAnnotated;
import com.nullcognition.androiddagger2.models.ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecy;
import com.nullcognition.androiddagger2.models.ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecyForActivityScope;
import com.nullcognition.androiddagger2.models.StaticProvideSingleton;
import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

  @Inject AppScopeSharedSingleton appScopeSharedSingleton;
  @Inject StaticProvideSingleton staticProvideSingleton;
  @Inject IntObject intObject;
  @Inject ObjectWithoutProvidesButIsConstructorAnnotated constructorAnnotated;
  @Inject ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecy hasADependecy;
  @Inject ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecyForActivityScope
      hasADependecyForActivityScope;

  ActivityComponent activityComponent;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    // an activity component constructed without requirement of the second module does not work
    // only one method can create a given subcomponent, thus there can be no variablity on the
    // activityComponent aka the subcomponent creation
    //activityComponent = ((App) getApplication()).getAppComponent().activityComponent(new ActivityModule(this));

    activityComponent = ((App) getApplication()).getAppComponent()
        .activityComponent(new ActivityModule(this),
            new SecondModuleButWithActivityScope(new IntObject(8)));

    activityComponent.inject(this);

    App.toastLog(this, "is appScopeSharedSingleton init ?: "
        + appScopeSharedSingleton.isInit()
        + " and the instance count is "
        + AppScopeSharedSingleton.INSTANCE_COUNT); // ~15MB

    App.toastLog(this, "is staticProvideSingleton init ?: "
        + staticProvideSingleton.isInit
        + " and the instance count is "
        + StaticProvideSingleton.INSTANCE_COUNT);

    App.toastLog(this, "is stringObject init ?: " + intObject.i);

    App.toastLog(this, "is ObjectWithoutProvides... init ? yes if the instance count is 1 "
        + " and the instance count is "
        + ObjectWithoutProvidesButIsConstructorAnnotated.INSTANCE_COUNT);

    ((TextView) findViewById(R.id.tv1)).setText(
        "is ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecy init ?: "
            + hasADependecy.stringObject.s
            + " is its string object value\nand the instance count is "
            + ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecy.INSTANCE_COUNT);

    ((TextView) findViewById(R.id.tv2)).setText("is ...hasADependecyForActivityScope init ? "
        + hasADependecyForActivityScope.stringObject.s
        + " is its string object value, "
        + "and its intObject value is "
        + hasADependecyForActivityScope.intObject.i
        + "\nand the instance count should be 2 and is:"
        + ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecyForActivityScope.INSTANCE_COUNT
        + " because this is the second instantiation, axa second activity"
        + " because it will be created in each activity via @Inject,\nalso see that its dependency(ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecy) has a dependency of stringObject which should return the same value of the previous string since they both receive value from the same source:"
        + hasADependecyForActivityScope.owp.stringObject.s);

    findViewById(R.id.button1).setOnClickListener(view -> startActivity(
        new Intent(SecondActivity.this, FirstActivity.class).addFlags(
            Intent.FLAG_ACTIVITY_NEW_TASK)));

    findViewById(R.id.button2).setOnClickListener(
        view -> startActivity(new Intent(SecondActivity.this, ThirdActivity.class).addFlags(
            Intent.FLAG_ACTIVITY_NEW_TASK)));
  }

  @Override protected void onDestroy() {
    activityComponent = null;
    super.onDestroy();
  }
}
