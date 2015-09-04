//package com.nullcognition.dagger2examples.konmik;
//
//import android.os.Bundle;
//import android.support.v7.app.ActionBarActivity;
//import android.view.Menu;
//import android.view.MenuItem;
//
//import com.nullcognition.dagger2examples.R;
//
//import javax.inject.Inject;
//
//public class ActivityKon extends ActionBarActivity {
//
//   @Inject
//   PreferencesLogger logger;
//
//   @Override
//   protected void onCreate(Bundle savedInstanceState){
//	  super.onCreate(savedInstanceState);
////	  setContentView(R.layout.activity_kon);
//
//	  AppKon.inject(this);
//
//	  logger.log();
//
//   }
//
//
//   @Override
//   public boolean onCreateOptionsMenu(Menu menu){
//	  // Inflate the menu; this adds items to the action bar if it is present.
//	  getMenuInflater().inflate(R.menu.menu_kon, menu);
//	  return true;
//   }
//
//   @Override
//   public boolean onOptionsItemSelected(MenuItem item){
//	  // Handle action bar item clicks here. The action bar will
//	  // automatically handle clicks on the Home/Up button, so long
//	  // as you specify a parent activity in AndroidManifest.xml.
//	  int id = item.getItemId();
//
//	  //noinspection SimplifiableIfStatement
//	  if(id == R.id.action_settings){
//		 return true;
//	  }
//
//	  return super.onOptionsItemSelected(item);
//   }
//}
