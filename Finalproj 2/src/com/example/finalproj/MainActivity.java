package com.example.finalproj;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button signUp = (Button) findViewById(R.id.button1);
		Button signIn = (Button) findViewById(R.id.button2);
        
        // Listening to register new account link
        signUp.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
               
                Intent i = new Intent(getApplicationContext(),Signup.class);
                startActivity(i);
            }
        
        });
        
        signIn.setOnClickListener(new View.OnClickListener() {
        	 
            public void onClick(View v) {
               
                Intent i = new Intent(getApplicationContext(),HomeLayout.class);
                startActivity(i);
            }
            
        
        });
    }
}



