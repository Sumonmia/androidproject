package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Current extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.current);
		
		//-------text views-------
		final TextView resultTextView = (TextView) findViewById(R.id.current_resultText);
		
		//-----edit text--------
		final EditText fEditText = (EditText) findViewById(R.id.voltage);
		final EditText aEditText = (EditText) findViewById(R.id.resistance);
		
		//------button------
		
		Button resultButton = (Button) findViewById(R.id.current_resultbtn);
		
		resultButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vn) {
				double V, R, result;
				
				V =Double.parseDouble(fEditText.getText().toString());
				R = Double.parseDouble(aEditText.getText().toString());
				
				result = (V / R);
				
				resultTextView.setText("Calculated current is(I=V/R) = " + Double.toString(result));
								
			}
		});
		
	}

}
