package com.example.finalproj;

import android.app.ListActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class Home2 extends ListActivity {

  
/** Called when the activity is first created. */

  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);
    
    Resources res = getResources();
    
    int[] image = {R.drawable.erwin2,R.drawable.karl2,R.drawable.debbie2,R.drawable.kee2,R.drawable.ompad2,R.drawable.joseph2,R.drawable.paulo2,R.drawable.irvin2,R.drawable.mike2,R.drawable.ram2};
	String[] name = res.getStringArray(R.array.name);
	String[] time = res.getStringArray(R.array.time);
	String[] title = res.getStringArray(R.array.title);
    
    View header = getLayoutInflater().inflate(R.layout.header, null);
    ListView listView = getListView();
    listView.addHeaderView(header);
    
    HomeAdapter adapter = new HomeAdapter(this,name,image,title,time);
	setListAdapter(adapter);
	
	listView.setAdapter(adapter);

	listView.setOnItemClickListener(new OnItemClickListener() {
	 
     public void onItemClick(AdapterView<?> parent, View view,
        int position, long id) {
       
    	 if(position==0){
 			Intent intent = new Intent(getBaseContext(), Jaxl.class);
 		       startActivity(intent);
 		} else if(position==1){
 			Intent intent = new Intent(getBaseContext(), Jaxl.class);
 		       startActivity(intent);
 		} else if(position==2){
 			Intent intent = new Intent(getBaseContext(), Profile.class);
 		       startActivity(intent);
 		} else if(position==3){
 			Intent intent = new Intent(getBaseContext(), Question.class);
		       startActivity(intent);
		} else if(position==4){
 			Intent intent = new Intent(getBaseContext(), Profile.class);
		       startActivity(intent);
		} else if(position==5){
 			Intent intent = new Intent(getBaseContext(), Question.class);
		       startActivity(intent);
		} else if(position==6){
 			Intent intent = new Intent(getBaseContext(), Profile.class);
		       startActivity(intent);
		} else if(position==7){
 			Intent intent = new Intent(getBaseContext(), Jesseth.class);
		       startActivity(intent);
		} else if(position==8){
 			Intent intent = new Intent(getBaseContext(), Question.class);
		       startActivity(intent);
		} else if(position==9){
 			Intent intent = new Intent(getBaseContext(), Profile.class);
		       startActivity(intent);
		} else if(position==10){
 			Intent intent = new Intent(getBaseContext(), Profile.class);
		       startActivity(intent);
		} 
    	 
     }
}); 
 
}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
	// Inflate the menu; this adds items to the action bar if it is present.
	getMenuInflater().inflate(R.menu.home2, menu);
	return true;
}
}