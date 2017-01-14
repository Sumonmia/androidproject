package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Modern_Physics extends Activity {
	
	
	TextView show;
	ImageView disp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.modern);
		
		
		show = (TextView) findViewById(R.id.ch9);
		disp = (ImageView) findViewById(R.id.imageView1);

	}


}
