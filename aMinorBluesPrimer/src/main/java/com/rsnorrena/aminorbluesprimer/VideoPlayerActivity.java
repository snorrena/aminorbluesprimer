package com.rsnorrena.aminorbluesprimer;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.MediaController.MediaPlayerControl;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoPlayerActivity extends Activity implements
		View.OnClickListener {

	protected static final MediaPlayerControl videoView = null;
	Button button1;

	private MediaController controller = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.videoplayeractivity);

        Configuration config = getResources().getConfiguration();
        if (config.smallestScreenWidthDp < 2048) {
            setContentView(R.layout.videoplayeractivity);
        } else {
            setContentView(R.layout.videoplayeractivitytablet);
        }

		String Var1 = this.getIntent().getExtras().getString("VideoFileName");
		String Var2 = this.getIntent().getExtras().getString("RiffTitle");

		TextView textView = (TextView) findViewById(R.id.textView1);
		textView.setText(Var2);

		button1 = (Button) findViewById(R.id.menubutton);
		button1.setOnClickListener(this);
		final VideoView videoView = (VideoView) findViewById(R.id.videoView1);

		String uriPath = "android.resource://" + getPackageName() + "/raw/"
				+ Var1;
		Uri uri = Uri.parse(uriPath);
		videoView.setVideoURI(uri);

		final MediaController.MediaPlayerControl mcEvents = new MediaController.MediaPlayerControl() {
			public void start() {
				videoView.start();
				controller.setVisibility(View.GONE);
				controller.hide();
			}

			public void seekTo(int pos) {
				videoView.seekTo(pos);
			}

			public void pause() {
				videoView.pause();
			}

			public boolean isPlaying() {

				return videoView.isPlaying();

			}

			public int getDuration() {
				return videoView.getDuration();
			}

			public int getCurrentPosition() {
				return videoView.getCurrentPosition();

			}

			public boolean canSeekForward() {
				return true;
			}

			public boolean canSeekBackward() {
				return true;
			}

			public boolean canPause() {
				return true;
			}

			@Override
			public int getAudioSessionId() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int getBufferPercentage() {
				// TODO Auto-generated method stub
				return 0;
			}

		};

		controller = new MediaController(this);

		controller.setMediaPlayer(mcEvents);
		controller.setAnchorView(findViewById(R.id.videoView1));

		videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {

			@Override
			public void onPrepared(MediaPlayer mp) {
				// TODO Auto-generated method stub

			}

		});

		videoView.start();
		controller.setVisibility(View.VISIBLE);

		videoView
				.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
					@Override
					public void onCompletion(MediaPlayer mp) {

						controller.setVisibility(View.VISIBLE);

						Toast toast = Toast.makeText(getApplicationContext(),
								"Press to replay.", Toast.LENGTH_SHORT);
						toast.setGravity(Gravity.CENTER_VERTICAL
								| Gravity.CENTER_HORIZONTAL, 0, 0);
						toast.show();

					}
				});

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		String Var2 = this.getIntent().getExtras().getString("ActivityName");

		try {
			Class<?> ourClass = Class
					.forName("com.rsnorrena.aminorbluesprimer." + Var2);
			Intent ourIntent = new Intent(VideoPlayerActivity.this, ourClass);
			startActivity(ourIntent);
			finish();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	public boolean onKeyUp(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_MENU) {
			// ........

			try {
				Class<?> ourClass = Class
						.forName("com.rsnorrena.aminorbluesprimer.MainMenu");
				Intent ourIntent = new Intent(VideoPlayerActivity.this,
						ourClass);
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

	@Override
	public boolean onTouchEvent(MotionEvent event) {

		controller.show();

		return false;
	}

}
