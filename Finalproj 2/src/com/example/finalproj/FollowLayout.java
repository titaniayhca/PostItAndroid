package com.example.finalproj;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class FollowLayout extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_follow_layout);
		
		TabHost tabHost = getTabHost();
		
		TabSpec follower = tabHost.newTabSpec("Followers");
		TabSpec following = tabHost.newTabSpec("Following");
		
		follower.setIndicator("Followers");
        follower.setContent(new Intent(this, Follower.class));
        
        following.setIndicator("Following");
        following.setContent(new Intent(this, Following.class));
        
        tabHost.addTab(follower); 
        tabHost.addTab(following);
	}
}
