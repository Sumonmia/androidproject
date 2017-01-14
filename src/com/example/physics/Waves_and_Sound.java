package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Waves_and_Sound extends Activity {
	
	
	TextView show;
	ImageView disp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wave);
		
		
		show = (TextView) findViewById(R.id.ch6);
		disp = (ImageView) findViewById(R.id.imageView1);

	}

}
