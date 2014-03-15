package com.example.finalproj;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Jesseth extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jesseth);
		
		Button seeMore = (Button) findViewById(R.id.seemore);
        Button send = (Button) findViewById(R.id.send);
        
        seeMore.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
               
                Intent i = new Intent(getApplicationContext(),ThreadTwo.class);
                startActivity(i);
            }
        });
        
        send.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
            	Toast.makeText(getApplicationContext(), "Your question has been sent.", Toast.LENGTH_LONG).show();
            }
        
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jesseth, menu);
		return true;
	}

}
