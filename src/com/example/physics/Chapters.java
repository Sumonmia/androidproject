package com.example.physics;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Chapters extends ListActivity {

	
	String classes[] = {"Motion","Force","Work_Power_and_Energy","Pressure","Heat"
			,"Waves_and_Sound","Light","Electricity","Modern_Physics","Physics_and_Life"};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(Chapters.this, android.R.layout.simple_list_item_1, classes));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		String chap = classes[position];
		try{
		Class ourClass = Class.forName("com.example.physics." + chap);
		Intent ourIntent = new Intent(Chapters.this, ourClass);
		startActivity(ourIntent);
		}catch (ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	
}
