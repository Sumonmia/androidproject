package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mass extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.m);
		
		//-------text views-------
		final TextView resultTextView = (TextView) findViewById(R.id.m_resultText);
		
		//-----edit text--------
		final EditText fEditText = (EditText) findViewById(R.id.mforce);
		final EditText aEditText = (EditText) findViewById(R.id.accla);
		
		//------button------
		
		Button resultButton = (Button) findViewById(R.id.m_resultbtn);
		
		resultButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vn) {
				double f, a, result;
				
				f = Double.parseDouble(fEditText.getText().toString());
				a = Double.parseDouble(aEditText.getText().toString());
				
				result = (f / a);
				
				resultTextView.setText("Calculated mass is(m=F/a) = " + Double.toString(result));
								
			}
		});
		
	}
	
}
