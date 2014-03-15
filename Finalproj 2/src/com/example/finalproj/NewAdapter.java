package com.example.finalproj;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class NewAdapter extends ArrayAdapter<String>{
	Context context;
	int images[];
	String [] s;
	String [] question;
	
	public NewAdapter(Context con, int image[], String[] name, String[] question){	
		super(con,R.layout.layout,R.id.name,name);
		this.context = con;
		this.images = image;
		this.s = name;
		this.question = question;
	}

public class MyViewHolder{
	ImageView imaged;
	TextView title;
	TextView question;
	
	public MyViewHolder(View v){
		imaged = (ImageView) v.findViewById(R.id.imageView1);
		title = (TextView) v.findViewById(R.id.name);
		question = (TextView) v.findViewById(R.id.question);
	}
}
	
	@Override
	public View getView(int position, View convertView , ViewGroup parent){
		View row = convertView;
		MyViewHolder hold = null;
		if(row==null){
    	LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		row = inflater.inflate(R.layout.layout, parent, false);
		
		if(position == 0){
			row.setBackgroundColor(Color.parseColor("#DF7D7D"));
		} else if(position == 1){
			row.setBackgroundColor(Color.parseColor("#4D3C8A"));
		} else if(position == 2){
			row.setBackgroundColor(Color.parseColor("#25C157"));
		} else if(position == 3){
			row.setBackgroundColor(Color.parseColor("#90DF40"));
		} else if(position == 4){
			row.setBackgroundColor(Color.parseColor("#C73B6E"));
		} else if(position == 5){
			row.setBackgroundColor(Color.parseColor("#2595C1"));
		} else if(position == 6){
			row.setBackgroundColor(Color.parseColor("#E8FB96"));
		} else if(position == 7){
			row.setBackgroundColor(Color.parseColor("#FB96BB"));
		} else if(position == 8){
			row.setBackgroundColor(Color.parseColor("#508761"));
		} else if(position == 9){
			row.setBackgroundColor(Color.parseColor("#4725C1"));
		}
		hold = new MyViewHolder(row);
		row.setTag(hold);
		}
		else{
			hold = (MyViewHolder) row.getTag();
		}
		
		hold.imaged.setImageResource(images[position]);
		hold.title.setText(s[position]);
		hold.question.setText(question[position]);
	return row;
	}
}

