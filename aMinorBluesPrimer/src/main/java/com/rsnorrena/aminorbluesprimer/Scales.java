package com.rsnorrena.aminorbluesprimer;

import com.rsnorrena.aminorbluesprimer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Scales extends Activity implements View.OnClickListener {
	
	Button smenubutton;
	ImageButton sleftbutton, srightbutton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scales);
		
		sleftbutton = (ImageButton) findViewById(R.id.sleftbutton);
		srightbutton = (ImageButton) findViewById(R.id.srightbutton);
		
		sleftbutton.setOnClickListener(this);
		srightbutton.setOnClickListener(this);
		
		smenubutton = (Button) findViewById(R.id.smenubutton);
		smenubutton.setOnClickListener(this);
		
	}
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				switch (v.getId()) {
				case R.id.smenubutton:
					// do stuff;

					try {
						Class<?> ourClass = Class
								.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
						Intent ourIntent = new Intent(Scales.this, ourClass);
						startActivity(ourIntent);
						finish();

					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}

					break;
					
					
					case R.id.sleftbutton:
						// do stuff;

						try {
							Class<?> ourClass = Class
									.forName("com.rsnorrena.aminorbluesprimer.BarChords");
							Intent ourIntent = new Intent(Scales.this, ourClass);
							startActivity(ourIntent);
							finish();

						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}

						break;
						
					case R.id.srightbutton:
						// do stuff;

						try {
							Class<?> ourClass = Class
									.forName("com.rsnorrena.aminorbluesprimer.ScalesView");
							Intent ourIntent = new Intent(Scales.this, ourClass);
							startActivity(ourIntent);
							finish();

						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}

						break;

					}
				

			}
		
	public boolean onKeyUp(int keyCode, KeyEvent event) {
	    if (keyCode == KeyEvent.KEYCODE_MENU) {
	         // ........
	    	
	    	try {
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
				Intent ourIntent = new Intent(Scales.this, ourClass);
				startActivity(ourIntent);
				finish();
				}catch(ClassNotFoundException e){
					e.printStackTrace();
			}
	    	
	     }
	    return true;
	 }	

	@Override
	public void onBackPressed() {
	}
	
}
