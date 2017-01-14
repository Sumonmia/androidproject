package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Voltage extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.voltage);
		
		//-------text views-------
		final TextView resultTextView = (TextView) findViewById(R.id.voltage_resultText);
		
		//-----edit text--------
		final EditText fEditText = (EditText) findViewById(R.id.current);
		final EditText aEditText = (EditText) findViewById(R.id.resistance);
		
		//------button------
		
		Button resultButton = (Button) findViewById(R.id.voltage_resultbtn);
		
		resultButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vn) {
				double I, R, result;
				
				I = Double.parseDouble(fEditText.getText().toString());
				R = Double.parseDouble(aEditText.getText().toString());
				
				result = (I * R);
				
				resultTextView.setText("Calculated voltage is(V=IR) = " + Double.toString(result));
								
			}
		});
		
	}
	
}
