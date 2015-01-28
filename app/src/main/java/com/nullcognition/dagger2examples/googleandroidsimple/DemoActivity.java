package com.nullcognition.dagger2examples.googleandroidsimple;
import android.app.Activity;
import android.os.Bundle;
/**
 * Created by ersin on 27/01/15 at 8:30 PM
 */
public class DemoActivity extends Activity {

   @Override
   protected void onCreate(Bundle inBundle){
	  super.onCreate(inBundle);

	  ((DemoActivity)getApplication()).component()
									  .inject(this);
   }
}
