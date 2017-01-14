package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Workdone extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.w);
		
		//-------text views-------
		final TextView resultTextView = (TextView) findViewById(R.id.w_resultText);
		
		//-----edit text--------
		final EditText fEditText = (EditText) findViewById(R.id.mforce);
		final EditText aEditText = (EditText) findViewById(R.id.distance);
		
		//------button------
		
		Button resultButton = (Button) findViewById(R.id.w_resultbtn);
		
		resultButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vn) {
				double f, s, result;
				
				f = Double.parseDouble(fEditText.getText().toString());
				s = Double.parseDouble(aEditText.getText().toString());
				
				result = (f * s);
				
				resultTextView.setText("Calculated work done is(W=Fs) = " + Double.toString(result));
								
			}
		});
		
	}
	
}
