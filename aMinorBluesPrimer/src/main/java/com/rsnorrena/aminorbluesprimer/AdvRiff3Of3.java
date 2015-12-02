package com.rsnorrena.aminorbluesprimer;

import com.rsnorrena.aminorbluesprimer.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class AdvRiff3Of3 extends Activity implements View.OnClickListener {

	Button bbsAudioButton, bbsVideoButton;
	ImageButton bbsLeftButton, bbsRightButton;

	MediaPlayer solo;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.advriff3of3);
		
		
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
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.AdvRiff2Of3");
				Intent ourIntent = new Intent(AdvRiff3Of3.this, ourClass);
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
				solo = MediaPlayer.create(AdvRiff3Of3.this, R.raw.advriff3of3);
				solo.start();

			} catch (Exception e) {
				Toast.makeText(AdvRiff3Of3.this, "ERROR: audio player not working.",
						Toast.LENGTH_LONG).show();
			}

			break;
		case R.id.bbsVideoButton:
			// do stuff;
			
			mediaplayerlaunch(bbsVideoButton);
			
			
			try {
				
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.VideoPlayerActivity");
				Intent ourIntent = new Intent(AdvRiff3Of3.this, ourClass);
				ourIntent.putExtra("VideoFileName", "advriff3of3video");
				ourIntent.putExtra("ActivityName", "AdvRiff3Of3");
				ourIntent.putExtra("RiffTitle", "Advanced Riff: 3 of 3");
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
				Class<?> ourClass = Class.forName("com.rsnorrena.aminorbluesprimer.BluesSolosPractise");
				Intent ourIntent = new Intent(AdvRiff3Of3.this, ourClass);
				ourIntent.putExtra("ActivityName", "AdvRiff3Of3");
				ourIntent.putExtra("SoloTitle", "Advanced Blues Solo");
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
				Intent ourIntent = new Intent(AdvRiff3Of3.this, ourClass);
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
