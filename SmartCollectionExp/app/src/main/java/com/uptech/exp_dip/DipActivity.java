package com.uptech.exp_dip;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorinfo.ModulesType;
import com.uptech.sensorinfo.SensorCollection;

public class DipActivity extends Activity {

	private final String TAG = "DipActivity";
	private TextView[] mTextview = new TextView[4];
	private MyBroadcastReceiver recv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dip);
		mTextview[0] = (TextView) findViewById(R.id.state);
		mTextview[1] = (TextView) findViewById(R.id.gid);
		mTextview[2] = (TextView) findViewById(R.id.sid);
		mTextview[3] = (TextView) findViewById(R.id.modules);
		recv = new MyBroadcastReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.DIP);
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
			mTextview[0].setText(SensorCollection.SensorData.SDIP.angle+ "бу");
			mTextview[1].setText((int)(SensorCollection.SensorID.DIP&0xFF) + "");
			mTextview[2].setText(intent.getByteExtra("sid", (byte)0x00) + "");
			mTextview[3].setText(ModulesType.getModulesType(intent.getByteExtra("type", (byte) (0xEF))));
		}

	}
}
