package com.example.physics;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Back extends Activity {

	@Override
	protected void onCreate(Bundle PhysicsTutor) {
		// TODO Auto-generated method stub
		super.onCreate(PhysicsTutor);
		setContentView(R.layout.back);
		
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(2000);
				}catch (InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openPhysicsCore = new Intent("com.example.physics.MENU");
					startActivity(openPhysicsCore);
				}
			}
			
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	

}
