package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Formula extends Activity{
	
	TextView display;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        display = (TextView) findViewById(R.id.tV1);
        display = (TextView) findViewById(R.id.tV2);
        display = (TextView) findViewById(R.id.tV3);
    }

}
