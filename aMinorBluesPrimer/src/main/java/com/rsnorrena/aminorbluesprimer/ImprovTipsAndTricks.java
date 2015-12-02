package com.rsnorrena.aminorbluesprimer;

import com.rsnorrena.aminorbluesprimer.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ImprovTipsAndTricks extends Activity implements View.OnClickListener {

	Button bmtmenubutton;
	ImageButton bmtleftbutton, bmtrightbutton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.improvtipsandtricks);
		bmtmenubutton = (Button) findViewById(R.id.bmtmenubutton);
		

		bmtmenubutton.setOnClickListener(this);
		
		bmtleftbutton = (ImageButton) findViewById(R.id.bmtleftbutton);
		bmtrightbutton = (ImageButton) findViewById(R.id.bmtrightbutton);
		
		bmtleftbutton.setOnClickListener(this);
		bmtrightbutton.setOnClickListener(this);
		

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch (v.getId()) {
		case R.id.bmtmenubutton:
			// do stuff;

			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
				Intent ourIntent = new Intent(ImprovTipsAndTricks.this, ourClass);
				startActivity(ourIntent);
				finish();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			break;
			
		case R.id.bmtleftbutton:
			// do stuff;

			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
				Intent ourIntent = new Intent(ImprovTipsAndTricks.this, ourClass);
				startActivity(ourIntent);
				finish();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			break;
			
		case R.id.bmtrightbutton:
			// do stuff;

			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.ImprovTipsAndTricks1");
				Intent ourIntent = new Intent(ImprovTipsAndTricks.this, ourClass);
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
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
				Intent ourIntent = new Intent(ImprovTipsAndTricks.this, ourClass);
				startActivity(ourIntent);
				finish();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		}
		return true;
	}

	@Override
	public void onBackPressed() {
	}

}
