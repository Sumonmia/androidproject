package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Work_Power_and_Energy extends Activity{
	
	TextView show;
	ImageView disp;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.work);
		
		
		show = (TextView) findViewById(R.id.ch3);
		disp = (ImageView) findViewById(R.id.imageView1);

	}



}
