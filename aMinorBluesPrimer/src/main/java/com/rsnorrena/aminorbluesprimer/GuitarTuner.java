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

public class GuitarTuner extends Activity implements View.OnClickListener {

	Button button1, button2, button3, button4, button5, button6, button7;

	MediaPlayer solo;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.guitartuner);
		button1 = (Button) findViewById(R.id.menubutton);
		button2 = (Button) findViewById(R.id.mmbutton2);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		button7 = (Button) findViewById(R.id.quit);

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

		case R.id.menubutton:
			// do stuff;
			mediaplayerlaunch(button1);

			try {
				solo = MediaPlayer.create(GuitarTuner.this, R.raw.e6);
				solo.start();
			} catch (Exception e) {
				Toast.makeText(GuitarTuner.this,
						"ERROR: audio player not working.", Toast.LENGTH_LONG)
						.show();
			}

			break;

		case R.id.mmbutton2:
			// do stuff;
			mediaplayerlaunch(button2);

			try {
				solo = MediaPlayer.create(GuitarTuner.this, R.raw.a5);
				solo.start();
			} catch (Exception e) {
				Toast.makeText(GuitarTuner.this,
						"ERROR: audio player not working.", Toast.LENGTH_LONG)
						.show();
			}

			break;

		case R.id.button3:
			// do stuff;
			mediaplayerlaunch(button3);

			try {
				solo = MediaPlayer.create(GuitarTuner.this, R.raw.d4);
				solo.start();
			} catch (Exception e) {
				Toast.makeText(GuitarTuner.this,
						"ERROR: audio player not working.", Toast.LENGTH_LONG)
						.show();
			}

			break;

		case R.id.button4:
			// do stuff;
			mediaplayerlaunch(button4);

			try {
				solo = MediaPlayer.create(GuitarTuner.this, R.raw.g3);
				solo.start();

			} catch (Exception e) {
				Toast.makeText(GuitarTuner.this,
						"ERROR: audio player not working.", Toast.LENGTH_LONG)
						.show();
			}

			break;

		case R.id.button5:
			// do stuff;
			mediaplayerlaunch(button5);

			try {
				solo = MediaPlayer.create(GuitarTuner.this, R.raw.b2);
				solo.start();
			} catch (Exception e) {
				Toast.makeText(GuitarTuner.this,
						"ERROR: audio player not working.", Toast.LENGTH_LONG)
						.show();
			}

			break;

		case R.id.button6:
			// do stuff;
			mediaplayerlaunch(button6);

			try {
				solo = MediaPlayer.create(GuitarTuner.this, R.raw.e1);
				solo.start();
			} catch (Exception e) {
				Toast.makeText(GuitarTuner.this,
						"ERROR: audio player not working.", Toast.LENGTH_LONG)
						.show();
			}

			break;

		case R.id.quit:
			// do stuff;
			mediaplayerlaunch(button7);

			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
				Intent ourIntent = new Intent(GuitarTuner.this, ourClass);
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
				Intent ourIntent = new Intent(GuitarTuner.this, ourClass);
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
