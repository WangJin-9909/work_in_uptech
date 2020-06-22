package com.uptech.df940;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.uptech.Tools.Utils;
import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorinfo.ModulesType;
import com.uptech.sensorinfo.SensorCollection;

public class EXP_DF940Activity extends Activity {
	private final String TAG = "EXP_IrstActivity";
	private static TextView[] mTextView = new TextView[4];
	private MyBroadcastReceiver recv;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_df940);
        
        mTextView[0] = (TextView) findViewById(R.id.status);
        mTextView[1] = (TextView) findViewById(R.id.gid);
        mTextView[2] = (TextView) findViewById(R.id.sid);
        mTextView[3] = (TextView) findViewById(R.id.modules);
        recv = new MyBroadcastReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.DF940);
		this.registerReceiver(recv, filter);
    }
    @Override
	public void onPause()
	{
		this.unregisterReceiver(recv);
		this.finish();
		super.onPause();
	}
	private class MyBroadcastReceiver extends BroadcastReceiver
	{

		@Override
		public void onReceive(Context arg0, Intent arg1) {
			
			int df940 = (int) SensorCollection.SensorData.SDF940.df940;
			mTextView[0].setText(Utils.getPress(df940) + " Kg");
			mTextView[1].setText((int)(SensorCollection.SensorID.IRDS&0xFF) + "");
			mTextView[2].setText((int)(arg1.getByteExtra("sid", (byte)0x00)) + "");
			mTextView[3].setText(ModulesType.getModulesType(arg1.getByteExtra("type", (byte)(0xEF))));
		}
		
	}
}