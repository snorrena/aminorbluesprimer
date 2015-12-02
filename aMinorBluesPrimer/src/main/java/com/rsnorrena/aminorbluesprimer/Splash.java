package com.rsnorrena.aminorbluesprimer;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;

public class Splash extends Activity {

	MediaPlayer mp;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.splash);

        Configuration config = getResources().getConfiguration();
        if (config.smallestScreenWidthDp < 2048) {
            setContentView(R.layout.splash);
        } else {
            setContentView(R.layout.splashtablet);
        }


		mp = MediaPlayer.create(Splash.this, R.raw.splashsound);
		mp.setOnCompletionListener(new OnCompletionListener() {

			@Override
			public void onCompletion(MediaPlayer mp) {
				performOnEnd();
			}

		});
		mp.start();

		Thread timer = new Thread() {

			public void run() {

				try {
					sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Class<?> ourClass;
					try {
						ourClass = Class
								.forName("com.rsnorrena.aminorbluesprimer.WhatAbout");
						Intent ourIntent = new Intent(Splash.this, ourClass);
						startActivity(ourIntent);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			}

		};

		timer.start();
	}

	protected void performOnEnd() {
		// TODO Auto-generated method stub
		mp.reset();
		mp.release();
		finish();
	}

}
