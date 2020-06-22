package com.uptech.irst;
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

public class EXP_IrstActivity extends Activity {
	private final String TAG = "EXP_IrstActivity";
	private static TextView[] mTextView = new TextView[4];
	private MyBroadcastReceiver recv;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irds);
        
        mTextView[0] = (TextView) findViewById(R.id.status);
        mTextView[1] = (TextView) findViewById(R.id.gid);
        mTextView[2] = (TextView) findViewById(R.id.sid);
        mTextView[3] = (TextView) findViewById(R.id.modules);
        recv = new MyBroadcastReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.IRDS);
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
			Log.i(TAG, SensorCollection.SensorData.SIRDS.status + "");
			if(SensorCollection.SensorData.SIRDS.status == 0x01)
				mTextView[0].setText("Òì³£");
			else
				mTextView[0].setText("Õý³£");
			mTextView[1].setText((int)(SensorCollection.SensorID.IRDS&0xFF) + "");
			mTextView[2].setText((int)(arg1.getByteExtra("sid", (byte)0x00)) + "");
			mTextView[3].setText(ModulesType.getModulesType(arg1.getByteExtra("type", (byte)(0xEF))));
		}
		
	}
}