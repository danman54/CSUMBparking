package com.amicorum.csumbparking;

//Israel 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	ImageButton gpsButton;
	ImageButton parkingButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		gpsButton = (ImageButton) findViewById(R.id.gps_button);
		gpsButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				goToGPSActivity();

			}
		});
		
		parkingButton = (ImageButton) findViewById(R.id.parking_button1);
		parkingButton.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				goToMapActivity();

			}
		});
		
		

	}

	public void goToGPSActivity() {
		Intent intent = new Intent(MainActivity.this,
				Current_Location_GPS.class);
		startActivity(intent);
	}
	
	public void goToMapActivity() {
		Intent intent = new Intent(MainActivity.this,
				MapActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
