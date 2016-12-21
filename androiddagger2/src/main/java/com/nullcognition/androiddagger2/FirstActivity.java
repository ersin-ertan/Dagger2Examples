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
import com.nullcognition.androiddagger2.models.ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecyForActivityScope;
import com.nullcognition.androiddagger2.models.ObjectWithoutProvidesButIsConstructorAnnotatedUnscoped;
import com.nullcognition.androiddagger2.models.StaticProvideSingleton;
import com.nullcognition.androiddagger2.models.StringObject;
import javax.inject.Inject;

public class FirstActivity extends AppCompatActivity {

  @Inject AppScopeSharedSingleton appScopeSharedSingleton;
  @Inject StaticProvideSingleton staticProvideSingleton;
  @Inject StringObject stringObject;
  @Inject ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecyForActivityScope
      hasADependecyForActivityScope;

  // note I am not @Inject annotated
  ObjectWithoutProvidesButIsConstructorAnnotated owpbica;

  @Inject ObjectWithoutProvidesButIsConstructorAnnotatedUnscoped canBeInjectedIntoAnyScope;

  ActivityComponent activityComponent;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_first);

    activityComponent = ((App) getApplication()).getAppComponent()
        .activityComponent(new ActivityModule(this),
            new SecondModuleButWithActivityScope(new IntObject(2)));
    activityComponent.inject(this);

    App.toastLog(this, "is appScopeSharedSingleton init ?: "
        + appScopeSharedSingleton.isInit()
        + " and the instance count is "
        + AppScopeSharedSingleton.INSTANCE_COUNT); // ~15MB

    App.toastLog(this, "is staticProvideSingleton init ?: "
        + staticProvideSingleton.isInit
        + " and the instance count is "
        + StaticProvideSingleton.INSTANCE_COUNT);

    App.toastLog(this, "is stringObject init ?: " + stringObject.s);

    // if this wasn't a @Subcomponent but rather an explicit dependency to appComponent, then objects
    // would be exposed explicitly vie the methods in appComponent, this is a form of manual injection
    owpbica =
        ((App) getApplication()).getAppComponent().objectWithoutProvidesButIsConstructorAnnotated();
    App.toastLog(this, "is owpbica init ?: " + String.valueOf(owpbica != null));

    ((TextView) findViewById(R.id.tv1)).setText("is ...hasADependecyForActivityScope init ?: "
        + hasADependecyForActivityScope.stringObject.s
        + " is its string object value, "
        + "\nand its intObject value is "
        + hasADependecyForActivityScope.intObject.i
        + "\nand the instance count should be 1: "
        + ObjectWithoutProvidesButIsConstructorAnnotatedAndHasADependecyForActivityScope.INSTANCE_COUNT
        + " and increasing, on each rotation because new instances are being provided for each activity creation"
        + " \nbecause it will be created in each activity if required via @Inject 'ed into the activity"
        + "\n its dependencys' stringObject value is "
        + hasADependecyForActivityScope.owp.stringObject.s);

    App.toastLog(this,
        "is ObjectWithoutProvidesButIsConstructorAnnotatedUnscoped init ?: " + String.valueOf(
            canBeInjectedIntoAnyScope != null));

    findViewById(R.id.button1).setOnClickListener(view -> startActivity(
        new Intent(FirstActivity.this, SecondActivity.class).addFlags(
            Intent.FLAG_ACTIVITY_NEW_TASK)));

    findViewById(R.id.button2).setOnClickListener(
        view -> startActivity(new Intent(FirstActivity.this, ThirdActivity.class).addFlags(
            Intent.FLAG_ACTIVITY_NEW_TASK)));
  }

  @Override protected void onDestroy() {
    activityComponent = null;
    super.onDestroy();
  }
}
