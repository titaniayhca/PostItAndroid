package com.example.finalproj;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class MemeAdapter extends ArrayAdapter<String>{
	Context context;
	int images[];
	String [] titles;
	
	public MemeAdapter(Context con, String[] name, int image[]){	
		super(con,R.layout.rowlayout,R.id.name,name);
		this.context = con;
		this.images = image;
		this.titles = name;
	}

public class MyViewHolder{
	ImageView image;
	TextView title;
	public MyViewHolder(View v){
		image = (ImageView) v.findViewById(R.id.image1);
		title = (TextView) v.findViewById(R.id.name);
		
	}
	

}
	
	@Override
	public View getView(int position, View convertView , ViewGroup parent){
		View row = convertView;
		MyViewHolder hold = null;
		if(row==null){
    	LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		row = inflater.inflate(R.layout.rowlayout, parent, false);
		
		if(position % 2 == 0){
			row.setBackgroundColor(Color.parseColor("#E6DEDE"));
		} else
			row.setBackgroundColor(Color.parseColor("#F9F5F5"));
		
		hold = new MyViewHolder(row);
		row.setTag(hold);
		}
		else{
			hold = (MyViewHolder) row.getTag();
		}
		
		hold.image.setImageResource(images[position]);
		hold.title.setText(titles[position]);
		
	return row;
	}
}

