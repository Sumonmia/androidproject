package com.example.physics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Time extends Accelaration {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.t);
		
		//-------text views-------
		final TextView resultTextView = (TextView) findViewById(R.id.t_resultText);
		
		//-----edit text--------
		final EditText vEditText = (EditText) findViewById(R.id.finalv);
		final EditText uEditText = (EditText) findViewById(R.id.initialu);
		final EditText aEditText = (EditText) findViewById(R.id.accla);
		
		//------button------
		
		Button resultButton = (Button) findViewById(R.id.t_resultbtn);
		
		resultButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vn) {
				double v, u, a, result;
				
				v = Double.parseDouble(vEditText.getText().toString());
				u = Double.parseDouble(uEditText.getText().toString());
				a = Double.parseDouble(aEditText.getText().toString());
				
				result = (v - u) / a;
				
				resultTextView.setText("Calculated time is= " + Double.toString(result));
								
			}
		});
		
	}
	
}
