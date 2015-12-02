package com.rsnorrena.aminorbluesprimer;

import com.rsnorrena.aminorbluesprimer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BarChords extends Activity implements View.OnClickListener {
	
	Button bcmenubutton;
	ImageButton bcleftbutton, bcrightbutton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.barchords);
		
		bcleftbutton = (ImageButton) findViewById(R.id.bcleftbutton);
		bcrightbutton = (ImageButton) findViewById(R.id.bcrightbutton);
		
		bcleftbutton.setOnClickListener(this);
		bcrightbutton.setOnClickListener(this);
		
		bcmenubutton = (Button) findViewById(R.id.bcmenubutton);
		bcmenubutton.setOnClickListener(this);
	}
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				switch (v.getId()) {
				case R.id.bcmenubutton:
					// do stuff;

					try {
						Class<?> ourClass = Class
								.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
						Intent ourIntent = new Intent(BarChords.this, ourClass);
						startActivity(ourIntent);
						finish();

					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}

					break;
					
					
					case R.id.bcleftbutton:
						// do stuff;

						try {
							Class<?> ourClass = Class
									.forName("com.rsnorrena.aminorbluesprimer.TwelveBarBlues");
							Intent ourIntent = new Intent(BarChords.this, ourClass);
							startActivity(ourIntent);
							finish();

						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}

						break;
						
					case R.id.bcrightbutton:
						// do stuff;

						try {
							Class<?> ourClass = Class
									.forName("com.rsnorrena.aminorbluesprimer.Scales");
							Intent ourIntent = new Intent(BarChords.this, ourClass);
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
				Intent ourIntent = new Intent(BarChords.this, ourClass);
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
