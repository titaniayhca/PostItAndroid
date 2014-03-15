package com.example.finalproj;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Profile extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_profile);
		
		Button seeMore = (Button) findViewById(R.id.button2);
		Button editProf = (Button) findViewById(R.id.editprof);
		
        seeMore.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
               
                Intent i = new Intent(getApplicationContext(),Thread.class);
                startActivity(i);
            }
        });
        
        editProf.setOnClickListener(new View.OnClickListener() {
       	 
            public void onClick(View v) {
               
                Intent i = new Intent(getApplicationContext(),Register.class);
                startActivity(i);
            }
            
        
        });
        
}
    
}
