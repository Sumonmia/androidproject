package com.example.physics;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Mforce extends Accelaration {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.f);
		
		//-------text views-------
		final TextView resultTextView = (TextView) findViewById(R.id.f_resultText);
		
		//-----edit text--------
		final EditText mEditText = (EditText) findViewById(R.id.mass);
		final EditText aEditText = (EditText) findViewById(R.id.accla);
		
		//------button------
		
		Button resultButton = (Button) findViewById(R.id.f_resultbtn);
		
		resultButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vn) {
				double m, a, result;
				
				m = Double.parseDouble(mEditText.getText().toString());
				a = Double.parseDouble(aEditText.getText().toString());
				
				result = (m * a);
				
				resultTextView.setText("Calculated force is(F=ma) = " + Double.toString(result));
								
			}
		});
		
	}

}
