package com.example.finalproj;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.app.ListActivity;
import android.content.Intent;
import android.content.res.Resources;

public class Thread extends ListActivity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		
		Resources res = getResources();
		int[] image = {R.drawable.erwin2,R.drawable.karl2,R.drawable.debbie2,R.drawable.kee2,R.drawable.ompad2,R.drawable.joseph2,R.drawable.paulo2,R.drawable.irvin2,R.drawable.mike2,R.drawable.ram2};
		String[] name = res.getStringArray(R.array.name);
		String[] qa = res.getStringArray(R.array.qa);
		
		NewAdapter myAdapter = new NewAdapter(this,image,name,qa);
		setListAdapter(myAdapter);
		
		ListView list = getListView();
		list.setOnItemClickListener(new OnItemClickListener(){
	          public void onItemClick(AdapterView<?> parent, View view,
	                  int position, long id) {
	        	  
	                 TextView title = (TextView) view.findViewById(R.id.name);
	                 ImageView image = (ImageView) view.findViewById(R.id.image1);

	                 String s = title.getText().toString();
	                
	                Intent intent = new Intent(getApplicationContext(), Display.class);

	                 intent.putExtra("title",s);
	                 intent.putExtra("image",position);
	                 startActivity(intent);
	                 
	              }
	            });
	}	

}
