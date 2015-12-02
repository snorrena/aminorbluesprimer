package com.rsnorrena.aminorbluesprimer;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.IOException;

import static com.rsnorrena.aminorbluesprimer.R.raw.twelvebarrhythm;

public class BluesSolosPractise extends Activity implements
		View.OnClickListener {

	Button AudioButton, StopButton;
	ImageButton LeftButton, RightButton;



	MediaPlayer solo;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bluessolospractise);

		String Var1 = this.getIntent().getExtras().getString("SoloTitle");

		TextView textView = (TextView) findViewById(R.id.textView3);
		textView.setText(Var1);

		AudioButton = (Button) findViewById(R.id.AudioButton);
		StopButton = (Button) findViewById(R.id.StopButton);

		AudioButton.setOnClickListener(this);
		StopButton.setOnClickListener(this);

		LeftButton = (ImageButton) findViewById(R.id.LeftButton);
		RightButton = (ImageButton) findViewById(R.id.RightButton);

		LeftButton.setOnClickListener(this);
		RightButton.setOnClickListener(this);

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
		case R.id.LeftButton:
			// do stuff;
			mediaplayerlaunch(LeftButton);

			String Var2 = this.getIntent().getExtras()
					.getString("ActivityName");

			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer." + Var2);
				Intent ourIntent = new Intent(BluesSolosPractise.this, ourClass);
				startActivity(ourIntent);
				finish();

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			break;
		case R.id.AudioButton:
			// do stuff;
			mediaplayerlaunch(AudioButton);


            solo = MediaPlayer.create(this.getApplicationContext(),R.raw.twelvebarrhythmloop);

            solo.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    solo.start();

                    solo.setLooping(true);
                }
            });
            solo.start();

            solo.setLooping(true);






			break;
		case R.id.StopButton:
			// do stuff;
			mediaplayerlaunch(StopButton);

			break;
		case R.id.RightButton:
			// do stuff;
			mediaplayerlaunch(RightButton);

			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
				Intent ourIntent = new Intent(BluesSolosPractise.this, ourClass);
				startActivity(ourIntent);
				finish();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			break;

		}

	}

    public void onCompletion(MediaPlayer mp) {
        solo.start();

        solo.setLooping(true);
    }

	public boolean onKeyUp(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_MENU) {
			// ........

			mediaplayerlaunch(AudioButton);

			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
				Intent ourIntent = new Intent(BluesSolosPractise.this, ourClass);
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
