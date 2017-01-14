package com.example.physics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Mathsolver extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.math);
		
		
final RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
		
		Button nextButton = (Button) findViewById(R.id.mathnextbtn);
		
		//-------if next buttonis clicked------
		nextButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View vn) {
				Intent intent;

				switch (radioGroup.getCheckedRadioButtonId()) {
				case R.id.radioButton1:

					intent = new Intent(Mathsolver.this, InitialVelocity.class);
					startActivity(intent);
					break;
					
				case R.id.radioButton2:

					intent = new Intent(Mathsolver.this, FinalVelocity.class);
					startActivity(intent);
					break;

		
				case R.id.radioButton3:

					intent = new Intent(Mathsolver.this, Accelaration.class);
					startActivity(intent);
					break;

				case R.id.radioButton4:

					intent = new Intent(Mathsolver.this, Time.class);
					startActivity(intent);
					break;
					
				case R.id.radioButton5:

					intent = new Intent(Mathsolver.this, Mforce.class);
					startActivity(intent);
					break;
					
				case R.id.radioButton6:

					intent = new Intent(Mathsolver.this, Mass.class);
					startActivity(intent);
					break;
					
				case R.id.radioButton7:

					intent = new Intent(Mathsolver.this, Workdone.class);
					startActivity(intent);
					break;
					
				case R.id.radioButton8:

					intent = new Intent(Mathsolver.this, Distance.class);
					startActivity(intent);
					break;
					
					
				case R.id.radioButton9:

					intent = new Intent(Mathsolver.this, Voltage.class);
					startActivity(intent);
					break;
					
				case R.id.radioButton10:

					intent = new Intent(Mathsolver.this, Current.class);
					startActivity(intent);
					break;
					
				case R.id.radioButton11:

					intent = new Intent(Mathsolver.this, Resistance.class);
					startActivity(intent);
					break;
					
				}				
			}
		});
		
		
		
		
	}
	
}
