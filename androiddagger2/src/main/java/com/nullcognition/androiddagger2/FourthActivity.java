package com.nullcognition.androiddagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.nullcognition.androiddagger2.di.component.ComponentWithAbstractBuilder;
import com.nullcognition.androiddagger2.di.component.ComponentWithInterfaceBuilder;
import com.nullcognition.androiddagger2.di.module.MyModuleA;
import com.nullcognition.androiddagger2.di.module.MyModuleB;
import com.nullcognition.androiddagger2.di.module.MyModuleC;
import com.nullcognition.androiddagger2.di.module.MyModuleD;

public class FourthActivity extends AppCompatActivity {

  ComponentWithAbstractBuilder componentWithAbstractBuilder;
  ComponentWithAbstractBuilder.ComponentBuilder compWABComponentBuilder;

  ComponentWithInterfaceBuilder componentWithInterfaceBuilder;
  ComponentWithInterfaceBuilder.CompBuilder compWIBComponentBuilder;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fourth);

    componentWithAbstractBuilder =
        compWABComponentBuilder.myModuleA(new MyModuleA()).myModuleB(new MyModuleB()).build();
    componentWithAbstractBuilder.inject(this);

    compWIBComponentBuilder.myModuleC(new MyModuleC()).myModuleD(new MyModuleD()).build();
    componentWithInterfaceBuilder.inject(this);
  }
}
