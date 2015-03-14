package com.amicorum.csumbparking;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Current_Location_GPS extends Activity {

	


		Button btnShowLocation;
		
		GPSTracker gps;
		
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_current__location__gps);
	        
	        btnShowLocation = (Button) findViewById(R.id.show_location);
	        
	        btnShowLocation.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					gps = new GPSTracker(Current_Location_GPS.this);
					
					if(gps.canGetLocation()) {
						double latitude = gps.getLatitude();
						double longitude = gps.getLongitude();
						
						Toast.makeText(
								getApplicationContext(),
								"Your Location is -\nLat: " + latitude + "\nLong: "
										+ longitude, Toast.LENGTH_LONG).show();
					} else {
						gps.showSettingsAlert();
					}
				}
			});
	    }
	}
