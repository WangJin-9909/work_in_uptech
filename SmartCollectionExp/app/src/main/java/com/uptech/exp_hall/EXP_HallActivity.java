package com.uptech.exp_hall;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ImageView;

import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorinfo.SensorCollection;

public class EXP_HallActivity extends Activity {
	//private final String TAG = "EXP_HallActivity";
	private static ImageView ReedSwitch, HolzerSwitch;
	private MyBroadcastReceiver recv;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hall);
		ReedSwitch = (ImageView) findViewById(R.id.Reed);
		HolzerSwitch = (ImageView) findViewById(R.id.Holzer);
		recv = new MyBroadcastReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.HALL);
		this.registerReceiver(recv, filter);
	}

	@Override
	public void onPause() {
		this.unregisterReceiver(recv);
		this.finish();
		super.onPause();
	}

	private class MyBroadcastReceiver extends BroadcastReceiver {

		@Override
		public void onReceive(Context arg0, Intent intent) {
			if (SensorCollection.SensorData.SHALL.hall == 0x00)
				ReedSwitch.setImageResource(R.drawable.off);
			else if (SensorCollection.SensorData.SHALL.hall == 0x01)
				ReedSwitch.setImageResource(R.drawable.on);
			if (SensorCollection.SensorData.SHALL.door == 0x00)
				HolzerSwitch.setImageResource(R.drawable.off);
			else if (SensorCollection.SensorData.SHALL.door == 0x01)
				HolzerSwitch.setImageResource(R.drawable.on);
		}

	}
}