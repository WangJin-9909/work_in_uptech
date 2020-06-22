package com.uptech.smog;

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

public class EXP_SmogActivity extends Activity {
	private final String TAG = "EXP_SmogActivity";
	private static TextView[] mTextView = new TextView[4]; 
	private MyBroadcaseReceiver rcv;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smog);
        mTextView[0] = (TextView) findViewById(R.id.status);
        mTextView[1] = (TextView) findViewById(R.id.gid);
        mTextView[2] = (TextView) findViewById(R.id.sid);
        mTextView[3] = (TextView) findViewById(R.id.modules);
        rcv = new MyBroadcaseReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.SMOG);
        this.registerReceiver(rcv, filter);
    }
    @Override
    public void onPause()
    {
    	this.unregisterReceiver(rcv);
    	this.finish();
    	super.onPause();
    }
    private class MyBroadcaseReceiver extends BroadcastReceiver
    {

		@Override
		public void onReceive(Context context, Intent intent) {
			if(SensorCollection.SensorData.SSMOG.status == 0x01)
				mTextView[0].setText("Òì³£");
			else
				mTextView[0].setText("Õý³£");
			mTextView[1].setText((int)(SensorCollection.SensorID.SMOG&0xFF) + "");
			mTextView[2].setText(Integer.toHexString((int)(intent.getByteExtra("sid", (byte)0x00))));
			mTextView[3].setText(ModulesType.getModulesType(intent.getByteExtra("type", (byte)0xEF)));
		}
    	
    }
}