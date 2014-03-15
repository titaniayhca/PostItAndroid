package com.example.finalproj;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Register extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		
	Button register = (Button) findViewById(R.id.save);
        
        // Listening to register new account link
        register.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
               
                Intent i = new Intent(getApplicationContext(),HomeLayout.class);
                startActivity(i);
            }
        });
    }
}
