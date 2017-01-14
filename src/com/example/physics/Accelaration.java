package com.example.physics;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Accelaration extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.a);
		
		//-------text views-------
		final TextView resultTextView = (TextView) findViewById(R.id.a_resultText);
		
		//-----edit text--------
		final EditText vEditText = (EditText) findViewById(R.id.finalv);
		final EditText uEditText = (EditText) findViewById(R.id.initialu);
		final EditText tEditText = (EditText) findViewById(R.id.time);
		
		//------button------
		
		Button resultButton = (Button) findViewById(R.id.a_resultbtn);
		
		resultButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vn) {
				double v, u, t, result;
				
				v = Double.parseDouble(vEditText.getText().toString());
				u = Double.parseDouble(uEditText.getText().toString());
				t = Double.parseDouble(tEditText.getText().toString());
				
				
				result = (v - u) / t;
				
				resultTextView.setText("Accelaration is= " + Double.toString(result));
								
			}
		});
		
	}
}
