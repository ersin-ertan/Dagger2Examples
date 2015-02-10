package com.nullcognition.dagger2examples.mgrzechocinski.home;
/**
 * Created by ersin on 07/02/15 at 2:23 AM
 */

// could not get retro lamda dependency properly configured

public class HomeActivity extends BaseActivity {
//
//   private static final String PREF_KEY_SAMPLE = "PREF_KEY_SAMPLE";
//
//   @Inject
//   NetworkStateManager networkStateManager;
//
//   @Inject
//   Twitter twitter;
//
//   @InjectView(R.id.The_id_tv_pref)
//   TextView preferenceValueTextView;
//
//   @InjectView(R.id.The_id_tv_util)
//   TextView utilOutputTextView;
//
//   @InjectView(R.id.The_id_tv_network_state)
//   TextView networkStateTextView;
//
//   @InjectView(R.id.The_id_btn_load_preference)
//   Button button;
//
//   private TheCollectionUtils TheStringUtils;
//
//   @Override
//   protected void onCreate(Bundle savedInstanceState){
//	  super.onCreate(savedInstanceState);
//	  setContentView(R.layout.activity_home);
//
//	  ButterKnife.inject(this);
//
//	  //Inject to non-private fields
//	  TheApplication.component(this)
//					.inject(this);
//
//	  //Inject to private fields or local variables
//	  TheStringUtils = TheApplication.component(this)
//									 .getTheStringUtils();
//
////	  //Lambda usage example
////	  button.setOnClickListener(v -> {
////		 sharedPreferences.edit()
////						  .putString(PREF_KEY_SAMPLE, "foo")
////						  .apply();
////		 preferenceValueTextView.setText(sharedPreferences.getString(PREF_KEY_SAMPLE, "bar"));
////		 twitter.tweet("Hey, I clicked button!");
////	  });
//
//	  //Method reference example
//	  List<String> sortedAscending = TheStringUtils.toSortedList(String::compareTo, "zombie", "dog", "animal");
//	  utilOutputTextView.setText(sortedAscending.get(0));
//
//	  //Custom class (NetworkStateManager) with nested dependencies provided by constructor
//	  networkStateTextView.setText(getString(R.string.network_text, networkStateManager.isConnectedOrConnecting()));
//
//	  twitter.tweet("Hello world!");
//   }
}
