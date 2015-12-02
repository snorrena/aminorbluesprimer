package com.rsnorrena.aminorbluesprimer;

import com.rsnorrena.aminorbluesprimer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TwelveBarBlues extends Activity implements View.OnClickListener {

	Button tbbmenubutton;
	ImageButton tbbleftbutton, tbbrightbutton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.twelvebarblues);
		
		tbbleftbutton = (ImageButton) findViewById(R.id.tbbleftbutton);
		tbbrightbutton = (ImageButton) findViewById(R.id.tbbrightbutton);
		
		tbbleftbutton.setOnClickListener(this);
		tbbrightbutton.setOnClickListener(this);

		tbbmenubutton = (Button) findViewById(R.id.tbbmenubutton);
		tbbmenubutton.setOnClickListener(this);
	}

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				switch (v.getId()) {
				case R.id.tbbmenubutton:
					// do stuff;

					try {
						Class<?> ourClass = Class
								.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
						Intent ourIntent = new Intent(TwelveBarBlues.this, ourClass);
						startActivity(ourIntent);
						finish();

					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}

					break;
					
					
					case R.id.tbbleftbutton:
						// do stuff;

						try {
							Class<?> ourClass = Class
									.forName("com.rsnorrena.aminorbluesprimer.BluesMusicTheory");
							Intent ourIntent = new Intent(TwelveBarBlues.this, ourClass);
							startActivity(ourIntent);
							finish();

						} catch (ClassNotFoundException e) {
							e.printStackTrace();
						}

						break;
						
					case R.id.tbbrightbutton:
						// do stuff;

						try {
							Class<?> ourClass = Class
									.forName("com.rsnorrena.aminorbluesprimer.BarChords");
							Intent ourIntent = new Intent(TwelveBarBlues.this, ourClass);
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
				Intent ourIntent = new Intent(TwelveBarBlues.this, ourClass);
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
