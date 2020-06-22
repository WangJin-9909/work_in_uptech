package com.uptech.exp_mcph;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorinfo.ModulesType;
import com.uptech.sensorinfo.SensorCollection;

public class McphActivity extends Activity {
	private final String TAG = "McphActivity";
	private TextView[] mTextview = new TextView[5];
	private MyBroadcastReceiver recv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mcph);
		mTextview[0] = (TextView) findViewById(R.id.light);
		mTextview[1] = (TextView) findViewById(R.id.voi);
		mTextview[2] = (TextView) findViewById(R.id.gid);
		mTextview[3] = (TextView) findViewById(R.id.sid);
		mTextview[4] = (TextView) findViewById(R.id.modules);
		recv = new MyBroadcastReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.MCPH);
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
			if (SensorCollection.SensorData.SMCPH.mic == 0x01)
				mTextview[0].setText("异常");
			else
				mTextview[0].setText("正常");
			if (SensorCollection.SensorData.SMCPH.phs == 0x01)
				mTextview[1].setText("异常");
			else
				mTextview[1].setText("正常");
			mTextview[2].setText((int)(SensorCollection.SensorID.MCPH&0xFF) + "");
			mTextview[3].setText(intent.getByteExtra("sid", (byte)0x00) + "");
			mTextview[4].setText(ModulesType.getModulesType(intent.getByteExtra("type", (byte) (0xEF))));
		}

	}
}
