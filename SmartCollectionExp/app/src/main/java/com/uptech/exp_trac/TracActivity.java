package com.uptech.exp_trac;

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

public class TracActivity extends Activity {

	private final String TAG = "TracActivity";
	private TextView[] mTextview = new TextView[6];
	private MyBroadcastReceiver recv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trac);
		mTextview[0] = (TextView) findViewById(R.id.text_x);
		mTextview[3] = (TextView) findViewById(R.id.gid);
		mTextview[4] = (TextView) findViewById(R.id.sid);
		mTextview[5] = (TextView) findViewById(R.id.modules);
		recv = new MyBroadcastReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.TRACL);
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.TRAC);
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
			if(intent.getAction() == "com.uptech.SensorCollection.BC" + SensorCollection.SensorID.TRACL){
				mTextview[0].setText("X:" + SensorCollection.SensorData.STRACL.x + "     Y:" + 
						SensorCollection.SensorData.STRACL.y + "    Z:" + SensorCollection.SensorData.STRACL.z);
				mTextview[3].setText((int)(SensorCollection.SensorID.TRACL&0xFF)  + "");
				mTextview[4].setText(intent.getByteExtra("sid", (byte)0x00) + "");
				mTextview[5].setText(ModulesType.getModulesType(intent.getByteExtra("type", (byte) (0xEF))));
			}else if(intent.getAction() == "com.uptech.SensorCollection.BC" + SensorCollection.SensorID.TRAC){
				mTextview[0].setText("X:" + SensorCollection.SensorData.STRAC.x + "     Y:" + 
						SensorCollection.SensorData.STRAC.y + "    Z:" + SensorCollection.SensorData.STRAC.z);
				mTextview[3].setText((int)(SensorCollection.SensorID.TRAC&0xFF)  + "");
				mTextview[4].setText(intent.getByteExtra("sid", (byte)0x00) + "");
				mTextview[5].setText(ModulesType.getModulesType(intent.getByteExtra("type", (byte) (0xEF))));
			}
			
		}

	}
}
