package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Resistance extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.resistance);
		
		//-------text views-------
		final TextView resultTextView = (TextView) findViewById(R.id.resistance_resultText);
		
		//-----edit text--------
		final EditText fEditText = (EditText) findViewById(R.id.voltage);
		final EditText aEditText = (EditText) findViewById(R.id.current);
		
		//------button------
		
		Button resultButton = (Button) findViewById(R.id.resistance_resultbtn);
		
		resultButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vn) {
				double V, I, result;
				
				V = Double.parseDouble(fEditText.getText().toString());
				I = Double.parseDouble(aEditText.getText().toString());
				
				result = (V / I);
				
				resultTextView.setText("Calculated resistance is(R=V/I) = " + Double.toString(result));
								
			}
		});
		
	}
	
}
