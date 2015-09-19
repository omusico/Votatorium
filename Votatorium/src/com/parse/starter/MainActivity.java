package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;

import com.parse.ParseAnalytics;
import com.parse.ui.ParseLoginBuilder;

public class MainActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		ParseLoginBuilder builder = new ParseLoginBuilder(MainActivity.this);
		startActivityForResult(builder.build(), 0);

		ParseAnalytics.trackAppOpenedInBackground(getIntent());
	}
}
