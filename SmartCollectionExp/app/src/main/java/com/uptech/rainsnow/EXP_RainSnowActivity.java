package com.uptech.rainsnow;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorinfo.SensorCollection;

public class EXP_RainSnowActivity extends Activity {
	private final String TAG = "EXP_RainSnowActivity";
	private static ImageView wImageView;
	private static TextView Mon, Day, Way;
	private MyBroadcastReceiver rcv;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rainsnow);

		wImageView = (ImageView) findViewById(R.id.weather);
		Mon = (TextView) findViewById(R.id.Month);
		Day = (TextView) findViewById(R.id.day);
		Way = (TextView) findViewById(R.id.Way);

		String DateString = Date.StringData();
		int offset = 5;
		if (DateString.charAt(6) >= 0x30 && DateString.charAt(6) <= 0x39) {
			Mon.setText(DateString.substring(offset, offset + 3));
			offset += 3;
		} else {
			Mon.setText(DateString.substring(offset, offset + 2));
			offset += 2;
		}
		if (DateString.charAt(offset + 1) >= 0x30
				&& DateString.charAt(offset + 1) <= 0x39) {
			Day.setText(DateString.substring(offset, offset + 3));
			offset += 4;
		} else {
			Day.setText(DateString.substring(offset, offset + 2));
			offset += 3;
		}
		Way.setText(DateString.substring(offset, offset + 3));
		rcv = new MyBroadcastReceiver();
		IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.SNOW);
        this.registerReceiver(rcv, intentFilter);
	}
	@Override
	protected void onPause() {
		 this.unregisterReceiver(rcv);
		 this.finish();
		 super.onPause();
	}
	private class MyBroadcastReceiver extends BroadcastReceiver
	{
		@Override
		public void onReceive(Context context, Intent intent) {
			Log.e(TAG, "" + SensorCollection.SensorData.SSNOW.status);
			if (SensorCollection.SensorData.SSNOW.status == 0x00) {
				wImageView.setImageResource(R.drawable.sun);
			} else if (SensorCollection.SensorData.SSNOW.status == 0x01) {
				if (Date.StringData().charAt(5) == 0x31
						|| Date.StringData().charAt(5) == 0x32)
					wImageView.setImageResource(R.drawable.snow);
				else
					wImageView.setImageResource(R.drawable.rain);
			}
		}
		
	}
}