package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FinalVelocity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.v);
		
		//-------text views-------
		final TextView resultTextView = (TextView) findViewById(R.id.v_resultText);
		
		//-----edit text--------
		final EditText uEditText = (EditText) findViewById(R.id.initialu);
		final EditText aEditText = (EditText) findViewById(R.id.accla);
		final EditText tEditText = (EditText) findViewById(R.id.time);
		
		//------button------
		
		Button resultButton = (Button) findViewById(R.id.v_resultbtn);
		
		resultButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vn) {
				double u, a, t, result;
				
				u = Double.parseDouble(uEditText.getText().toString());
				a = Double.parseDouble(aEditText.getText().toString());
				t = Double.parseDouble(tEditText.getText().toString());
				
				result = u + (a * t);
				
				resultTextView.setText("Final Velocity is= " + Double.toString(result));
								
			}
		});
		
	}
	
}
