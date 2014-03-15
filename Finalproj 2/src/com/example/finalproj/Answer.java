package com.example.finalproj;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Answer extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_answer);
		
		Button answer = (Button) findViewById(R.id.answer);
        
        // Listening to register new account link
        answer.setOnClickListener(new View.OnClickListener() {
 
            public void onClick(View v) {
               
            	Toast.makeText(getApplicationContext(), "You just answered the question.", Toast.LENGTH_LONG).show();
            }
        
        });
        
    }
}



