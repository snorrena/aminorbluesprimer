package com.rsnorrena.aminorbluesprimer;

import com.rsnorrena.aminorbluesprimer.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BluesSolosMenu extends Activity implements View.OnClickListener {

	Button button1, button2, button3, button4, button5, button6, button7;

	MediaPlayer solo;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bluessolosmenu);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.button7);

		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
		button3.setOnClickListener(this);
		button4.setOnClickListener(this);
		button5.setOnClickListener(this);
		button6.setOnClickListener(this);
		button7.setOnClickListener(this);

	}

	public void mediaplayerlaunch(View view) {

		if (solo != null && solo.isPlaying()) {
			solo.stop();
			solo.reset();
			solo.release();
			solo = null;

		}

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch (v.getId()) {
		case R.id.button4:
			// do stuff;
			mediaplayerlaunch(button4);

			try {
				solo = MediaPlayer.create(BluesSolosMenu.this, R.raw.begrifffull);
				solo.start();
			} catch (Exception e) {
				Toast.makeText(BluesSolosMenu.this, "ERROR: audio player not working.",
						Toast.LENGTH_LONG).show();
			}

			break;
		case R.id.button7:
			// do stuff;
			mediaplayerlaunch(button7);

			try {
				solo = MediaPlayer.create(BluesSolosMenu.this, R.raw.intrifffull);
				solo.start();
			} catch (Exception e) {
				Toast.makeText(BluesSolosMenu.this, "ERROR: audio player not working.",
						Toast.LENGTH_LONG).show();
			}
			break;
		case R.id.button5:
			// do stuff;
			mediaplayerlaunch(button5);

			try {
				solo = MediaPlayer.create(BluesSolosMenu.this, R.raw.advrifffull);
				solo.start();
			} catch (Exception e) {
				Toast.makeText(BluesSolosMenu.this, "ERROR: audio player not working.",
						Toast.LENGTH_LONG).show();
			}

			break;
		case R.id.button1:
			// do stuff;
			mediaplayerlaunch(button1);
			
			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.BegRiff1Of3");
				Intent ourIntent = new Intent(BluesSolosMenu.this, ourClass);
				startActivity(ourIntent);
				finish();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			break;

		case R.id.button2:
			// do stuff;
			mediaplayerlaunch(button2);
			
			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.IntRiff1Of3");
				Intent ourIntent = new Intent(BluesSolosMenu.this, ourClass);
				startActivity(ourIntent);
				finish();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			

			break;

		case R.id.button3:
			// do stuff;
			mediaplayerlaunch(button3);

			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.AdvRiff1Of3");
				Intent ourIntent = new Intent(BluesSolosMenu.this, ourClass);
				startActivity(ourIntent);
				finish();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			break;

		case R.id.button6:
			// do stuff;
			mediaplayerlaunch(button6);

			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
				Intent ourIntent = new Intent(BluesSolosMenu.this, ourClass);
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
			
			mediaplayerlaunch(button1);

			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
				Intent ourIntent = new Intent(BluesSolosMenu.this, ourClass);
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
