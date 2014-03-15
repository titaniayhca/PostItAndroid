package com.example.finalproj;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Settings extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_settings);
		
		Button save = (Button) findViewById(R.id.submit);
		save.setOnClickListener(new View.OnClickListener() {
			 
            public void onClick(View v) {
               
                Intent i = new Intent(getApplicationContext(),HomeLayout.class);
                startActivity(i);
            }
        
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.signout, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.signout:
	        	Intent j = new Intent(Settings.this,MainActivity.class);
                startActivity(j);
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}

}
