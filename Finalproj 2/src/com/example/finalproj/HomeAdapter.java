package com.example.finalproj;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class HomeAdapter extends ArrayAdapter<String>{
	Context context;
	int images[];
	String [] titles;
	String [] name;
	String [] time;
	
	public HomeAdapter(Context con, String[] name, int image[], String[] titles, String[] time){	
		super(con,R.layout.listviewhome,R.id.name,name);
		this.context = con;
		this.images = image;
		this.titles = titles;
		this.time = time;
		this.name = name;
	}

public class MyViewHolder{
	ImageView image;
	TextView title;
	TextView time;
	TextView name;
	public MyViewHolder(View v){
		image = (ImageView) v.findViewById(R.id.pic);
		title = (TextView) v.findViewById(R.id.title);
		time = (TextView) v.findViewById(R.id.time);
		name = (TextView) v.findViewById(R.id.name);
		
	}
	

}
	
	@Override
	public View getView(int position, View convertView , ViewGroup parent){
		View row = convertView;
		MyViewHolder hold = null;
		if(row==null){
    	LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		row = inflater.inflate(R.layout.listviewhome, parent, false);
		hold = new MyViewHolder(row);
		row.setTag(hold);
		}
		else{
			hold = (MyViewHolder) row.getTag();
		}
		
		hold.image.setImageResource(images[position]);
		hold.title.setText(titles[position]);
		hold.time.setText(time[position]);
		hold.name.setText(name[position]);
		
	return row;
	}
}

