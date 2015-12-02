package com.rsnorrena.aminorbluesprimer;

import com.rsnorrena.aminorbluesprimer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ScalesView extends Activity implements View.OnClickListener {
	
	Button svmenubutton;
	ImageButton svleftbutton, svrightbutton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scaleview);
		
		svleftbutton = (ImageButton) findViewById(R.id.svleftbutton);
		svrightbutton = (ImageButton) findViewById(R.id.svrightbutton);
		
		svleftbutton.setOnClickListener(this);
		svrightbutton.setOnClickListener(this);
		
		svmenubutton = (Button) findViewById(R.id.svmenubutton);
		svmenubutton.setOnClickListener(this);
			
	}	
		@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			switch (v.getId()) {
			case R.id.svmenubutton:
				// do stuff;

				try {
					Class<?> ourClass = Class
							.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
					Intent ourIntent = new Intent(ScalesView.this, ourClass);
					startActivity(ourIntent);
					finish();

				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}

				break;
				
				
				case R.id.svleftbutton:
					// do stuff;

					try {
						Class<?> ourClass = Class
								.forName("com.rsnorrena.aminorbluesprimer.Scales");
						Intent ourIntent = new Intent(ScalesView.this, ourClass);
						startActivity(ourIntent);
						finish();

					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}

					break;
					
				case R.id.svrightbutton:
					// do stuff;

					try {
						Class<?> ourClass = Class
								.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
						Intent ourIntent = new Intent(ScalesView.this, ourClass);
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
				Intent ourIntent = new Intent(ScalesView.this, ourClass);
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