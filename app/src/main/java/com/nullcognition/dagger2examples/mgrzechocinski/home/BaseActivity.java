package com.nullcognition.dagger2examples.mgrzechocinski.home;
import android.content.SharedPreferences;
import android.support.v4.app.FragmentActivity;

import javax.inject.Inject;
/**
 * Created by ersin on 07/02/15 at 2:23 AM
 */

public class BaseActivity extends FragmentActivity {

   @Inject
   SharedPreferences sharedPreferences;
}
