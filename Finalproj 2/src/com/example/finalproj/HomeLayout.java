package com.example.finalproj;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class HomeLayout extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home_layout);
		
		TabHost tabHost = getTabHost();
		TabHost.TabSpec spec;
		
		Resources res = getResources();
		Intent intent;
		
		intent = new Intent().setClass(this, Home2.class);
		spec = tabHost.newTabSpec("Home").setIndicator("", res.getDrawable(R.drawable.bhome)).setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, Profile.class);
		spec = tabHost.newTabSpec("Profile").setIndicator("", res.getDrawable(R.drawable.bprofile)).setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, FollowLayout.class);
		spec = tabHost.newTabSpec("Follow").setIndicator("", res.getDrawable(R.drawable.bfollow)).setContent(intent);
		tabHost.addTab(spec);
		
		intent = new Intent().setClass(this, Postit.class);
		spec = tabHost.newTabSpec("Post-it").setIndicator("", res.getDrawable(R.drawable.bpostit)).setContent(intent);
		tabHost.addTab(spec);
		
		tabHost.setCurrentTab(4);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.settings:
	        	Intent i = new Intent(HomeLayout.this,Settings.class);
                startActivity(i);
	            return true;
	        case R.id.signout:
	        	Intent j = new Intent(HomeLayout.this,MainActivity.class);
                startActivity(j);
	            return true;
	        default:
	            return super.onOptionsItemSelected(item);
	    }
	}
	
	

}
