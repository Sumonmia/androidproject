package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Distance extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.s);
		
		//-------text views-------
		final TextView resultTextView = (TextView) findViewById(R.id.s_resultText);
		
		//-----edit text--------
		final EditText fEditText = (EditText) findViewById(R.id.workdone);
		final EditText aEditText = (EditText) findViewById(R.id.mforce);
		
		//------button------
		
		Button resultButton = (Button) findViewById(R.id.s_resultbtn);
		
		resultButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vn) {
				double W, f, result;
				
				W = Double.parseDouble(fEditText.getText().toString());
				f = Double.parseDouble(aEditText.getText().toString());
				
				result = (W / f);
				
				resultTextView.setText("Calculated distance is(s=W/f) = " + Double.toString(result));
								
			}
		});
		
	}
	
}
