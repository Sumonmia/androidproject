package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


public class Tutorials extends Activity {

	
	
	ImageView disp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tutorial);
		
		
	
		disp = (ImageView) findViewById(R.id.imageView1);

	}
}
