package com.uptech.bH1750;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.EditText;

import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorinfo.ModulesType;
import com.uptech.sensorinfo.SensorCollection;

public class EXP_Bh1750Activity extends Activity {
	private final String TAG = "EX09_Bh1750Activity";
	private static EditText[] mTextView = new EditText[4];;
	private MyBroadcastReceiver rcv;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bh1750);

		mTextView[0] = (EditText) findViewById(R.id.LightStrengh);
		mTextView[1] = (EditText) findViewById(R.id.gid);
		mTextView[2] = (EditText) findViewById(R.id.sid);
		mTextView[3] = (EditText) findViewById(R.id.modules);
		rcv = new MyBroadcastReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.LLUX);
		this.registerReceiver(rcv, filter);
		
	}
	@Override
	public void onPause()
	{
		this.unregisterReceiver(rcv);
		this.finish();
		super.onPause();
	}
	private class MyBroadcastReceiver extends BroadcastReceiver
	{

		@Override
		public void onReceive(Context arg0, Intent arg1) {
			mTextView[0].setText(SensorCollection.SensorData.SLLUX.llux + "  lux");
			mTextView[1].setText((int)(SensorCollection.SensorID.LLUX&0xFF) + "");
			mTextView[2].setText((int)(arg1.getByteExtra("sid", (byte)0x00)) + "");
			mTextView[3].setText(ModulesType.getModulesType(arg1.getByteExtra("type", (byte)(0xFF))));
		}
		
	}
}