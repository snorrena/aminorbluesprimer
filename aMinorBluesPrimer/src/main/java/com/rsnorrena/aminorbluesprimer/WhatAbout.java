package com.rsnorrena.aminorbluesprimer;


import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

public class WhatAbout extends LicenseCheckActivity {
	
	Button aboutNextButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about);
		
		//Toast.makeText(this, "Checking Application License", Toast.LENGTH_SHORT).show();
        // Check the license
        //checkLicense();
		
		aboutNextButton = (Button) findViewById(R.id.aboutNextButton);
		aboutNextButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				try {
					Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
					Intent ourIntent = new Intent(WhatAbout.this, ourClass);
					startActivity(ourIntent);
					finish();
					}catch(ClassNotFoundException e){
						e.printStackTrace();
				}
				
			}
		});
	}
	
	public boolean onKeyUp(int keyCode, KeyEvent event) {
	    if (keyCode == KeyEvent.KEYCODE_MENU) {
	         // ........
	    	
	    	try {
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
				Intent ourIntent = new Intent(WhatAbout.this, ourClass);
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

