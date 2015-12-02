package com.rsnorrena.aminorbluesprimer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainMenu extends Activity implements View.OnClickListener {

	Button button1, button2, button3, button4, button5, button6;

	MediaPlayer solo;

	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainmenu);
		button1 = (Button) findViewById(R.id.menubutton);
		button2 = (Button) findViewById(R.id.mmbutton2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);



		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
		button6.setOnClickListener(this);
		


	}

	

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch (v.getId()) {
		case R.id.menubutton:
			// do stuff;
			try {
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.BluesMusicTheory");
				Intent ourIntent = new Intent(MainMenu.this, ourClass);
				startActivity(ourIntent);
				finish();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			

			break;
		case R.id.mmbutton2:
			// do stuff;
			try {
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.BluesSolosMenu");
				Intent ourIntent = new Intent(MainMenu.this, ourClass);
				startActivity(ourIntent);
				finish();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			break;
		
		case R.id.button3:
			// do stuff;
			try {
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.ImprovTipsAndTricks");
				Intent ourIntent = new Intent(MainMenu.this, ourClass);
				startActivity(ourIntent);
				finish();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			break;

		case R.id.button4:
			// do stuff;
			try {
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.GuitarTuner");
				Intent ourIntent = new Intent(MainMenu.this, ourClass);
				startActivity(ourIntent);
				finish();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			break;
			
		case R.id.button5:
			// do stuff;
			try {
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.WhatAbout");
				Intent ourIntent = new Intent(MainMenu.this, ourClass);
				startActivity(ourIntent);
				finish();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			break;

		case R.id.button6:
			// do stuff;
						
			finish();


			break;
			
		
		}

	}

	@Override
	public void onBackPressed() {
	}
	
}
