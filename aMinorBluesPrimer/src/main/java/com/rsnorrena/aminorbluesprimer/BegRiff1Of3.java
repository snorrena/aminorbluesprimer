package com.rsnorrena.aminorbluesprimer;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class BegRiff1Of3 extends Activity implements View.OnClickListener {

	Button bbsAudioButton, bbsVideoButton;
	ImageButton bbsLeftButton, bbsRightButton;

	MediaPlayer solo;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.begriff1of3);
		
		
		bbsAudioButton = (Button) findViewById(R.id.bbsAudioButton);
		bbsVideoButton = (Button) findViewById(R.id.bbsVideoButton);
		
		bbsAudioButton.setOnClickListener(this);
		bbsVideoButton.setOnClickListener(this);
		
		bbsLeftButton = (ImageButton) findViewById(R.id.bbsLeftButton);
		bbsRightButton = (ImageButton) findViewById(R.id.bbsRightButton);
		

		bbsLeftButton.setOnClickListener(this);
		bbsRightButton.setOnClickListener(this);
		

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
		
		case R.id.bbsLeftButton:
			// do stuff;
			mediaplayerlaunch(bbsLeftButton);
			
			try {
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.BluesSolosMenu");
				Intent ourIntent = new Intent(BegRiff1Of3.this, ourClass);
				startActivity(ourIntent);
				finish();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

			break;
		
		case R.id.bbsAudioButton:
			// do stuff;
			mediaplayerlaunch(bbsAudioButton);
			
			try {
				solo = MediaPlayer.create(BegRiff1Of3.this, R.raw.begriff1of3);
				solo.start();

			} catch (Exception e) {
				Toast.makeText(BegRiff1Of3.this, "ERROR: audio player not working.",
						Toast.LENGTH_LONG).show();
			}

			break;
		case R.id.bbsVideoButton:
			// do stuff;
			
			mediaplayerlaunch(bbsVideoButton);
			
			
			try {
				
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.VideoPlayerActivity");
				Intent ourIntent = new Intent(BegRiff1Of3.this, ourClass);
				ourIntent.putExtra("VideoFileName", "begriff1of3video");
				ourIntent.putExtra("ActivityName", "BegRiff1Of3");
				ourIntent.putExtra("RiffTitle", "Beginner Riff: 1 of 3");
				startActivity(ourIntent);
				finish();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			
			break;
		
		

		case R.id.bbsRightButton:
			// do stuff;
			
			mediaplayerlaunch(bbsRightButton);
			
			try {
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.BegRiff2Of3");
				Intent ourIntent = new Intent(BegRiff1Of3.this, ourClass);
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
	    	
	    	mediaplayerlaunch(bbsAudioButton);
	    	
	    	try {
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
				Intent ourIntent = new Intent(BegRiff1Of3.this, ourClass);
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
