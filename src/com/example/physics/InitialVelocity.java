package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class InitialVelocity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.u);
		
		//-------text views-------
		final TextView resultTextView = (TextView) findViewById(R.id.u_resultText);
		
		//-----edit text--------
		final EditText vEditText = (EditText) findViewById(R.id.finalv);
		final EditText aEditText = (EditText) findViewById(R.id.accla);
		final EditText tEditText = (EditText) findViewById(R.id.time);
		
		//------button------
		
		Button resultButton = (Button) findViewById(R.id.u_resultbtn);
		
		resultButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vn) {
				double v, a, t, result;
				
				v = Double.parseDouble(vEditText.getText().toString());
				a = Double.parseDouble(aEditText.getText().toString());
				t = Double.parseDouble(tEditText.getText().toString());
				
				result = v - (a * t);
				
				resultTextView.setText("Initial Velocity is= " + Double.toString(result));
								
			}
		});
		
		
		
		
	}

}
