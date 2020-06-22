package com.uptech.exp_ys17;

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

public class YS17Activity extends Activity {

	private final String TAG = "YS17Activity";
	private TextView[] mTextview = new TextView[4];
	private MyBroadcastReceiver recv;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ys17);
		mTextview[0] =(TextView) findViewById(R.id.ys17_data);
		mTextview[1] =(TextView) findViewById(R.id.gid);
		mTextview[2] =(TextView) findViewById(R.id.sid);
		mTextview[3] =(TextView) findViewById(R.id.modules);
		recv = new MyBroadcastReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.YS17);
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
			Log.e(TAG,"status = " + SensorCollection.SensorData.SYS17.status );
			if (SensorCollection.SensorData.SYS17.status == 0x01){
				mTextview[0].setText("异常");
			}				
			else if(SensorCollection.SensorData.SYS17.status == 0x00){
				mTextview[0].setText("正常");
			}else{
				mTextview[0].setText("数据异常");
			}
			mTextview[1].setText((int)(SensorCollection.SensorID.YS17&0xFF) + "");
			mTextview[2].setText(intent.getByteExtra("sid", (byte)0x00) + "");
			mTextview[3].setText(ModulesType.getModulesType(intent.getByteExtra("type", (byte) (0xEF))));
		}
	}
}