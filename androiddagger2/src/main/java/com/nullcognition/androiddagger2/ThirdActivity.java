package com.nullcognition.androiddagger2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.nullcognition.androiddagger2.di.component.ActivityComponent;
import com.nullcognition.androiddagger2.di.module.ActivityModule;
import com.nullcognition.androiddagger2.di.module.SecondModuleButWithActivityScope;
import com.nullcognition.androiddagger2.models.BindsObject;
import com.nullcognition.androiddagger2.models.BindsObjectRequiringDependency;
import com.nullcognition.androiddagger2.models.IntObject;
import javax.inject.Inject;

public class ThirdActivity extends AppCompatActivity {

  ActivityComponent activityComponent;

  @Inject BindsObject bindsObject; // from app module
  @Inject BindsObjectRequiringDependency bindsObjectWithDependency;
      // from BindsInsteadOfProvidesModule

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_third);

    activityComponent = ((App) getApplication()).getAppComponent()
        .activityComponent(new ActivityModule(this),
            new SecondModuleButWithActivityScope(new IntObject(6)));
    activityComponent.inject(this);

    App.toastLog(this, bindsObject.isInit);
    App.toastLog(this, bindsObjectWithDependency.isInit);

    findViewById(R.id.button1).setOnClickListener(view -> startActivity(
        new Intent(ThirdActivity.this, FirstActivity.class).addFlags(
            Intent.FLAG_ACTIVITY_NEW_TASK)));

    findViewById(R.id.button2).setOnClickListener(view -> startActivity(
        new Intent(ThirdActivity.this, SecondActivity.class).addFlags(
            Intent.FLAG_ACTIVITY_NEW_TASK)));
  }
}
