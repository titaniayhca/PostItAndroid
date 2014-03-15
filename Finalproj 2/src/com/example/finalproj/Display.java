package com.example.finalproj;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Display extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_display);
		int[] image = {R.drawable.erwin,R.drawable.karl,R.drawable.debbie,R.drawable.kee,R.drawable.ompad,R.drawable.joseph,R.drawable.paulo,R.drawable.irvin,R.drawable.mike,R.drawable.ram};
		TextView titles = (TextView) findViewById(R.id.textView1);
        ImageView imgs = (ImageView) findViewById(R.id.imageView1);
        
        Intent i = getIntent();
        
        String title = i.getStringExtra("title");
        int pos = i.getIntExtra("image", 0);

        
        titles.setText(title);
        imgs.setImageResource(image[pos]);
        
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
        
    }
