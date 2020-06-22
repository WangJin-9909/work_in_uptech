package com.uptech.sht11;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;

import com.uptech.Tools.Utils;
import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorinfo.SensorCollection;

public class EXP_SHT11Activity extends Activity {
	private static final String TAG = "EXP_SHT11Activity";
	private static TextView[] mTextView = new TextView[3];
	private static ImageView mImageView;
	private static float screenDensity = 0f;
	private MyBroadcastReceiver rcv;
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sht11);
		mTextView[0] = (TextView) findViewById(R.id.temp);
		mTextView[1] = (TextView) findViewById(R.id.humi);
		mImageView = (ImageView) findViewById(R.id.scale);
		screenDensity = Utils.getDM(this).density;
		Log.e(TAG, screenDensity + "");
		rcv = new MyBroadcastReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.SHT);
		this.registerReceiver(rcv, filter);
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
			onDataReceived(SensorCollection.SensorData.SSHT.humi,SensorCollection.SensorData.SSHT.temp);
		}
		
	}
	private static void onDataReceived(float humi, float temp) {
		mTextView[0].setText(Float.toString(temp).substring(0, 4) + "¡æ");
		mTextView[1].setText(Float.toString(humi).substring(0, 4) + "%");
		float tmp;
		tmp =  (float) ((1.92*(temp+29.42))*screenDensity);
		ViewGroup.LayoutParams lp = mImageView.getLayoutParams();
		lp.height = (int) tmp;
		mImageView.setLayoutParams(lp);
		ViewGroup.MarginLayoutParams mp = (MarginLayoutParams) mImageView.getLayoutParams();
		mp.topMargin = (int) (203*screenDensity  - tmp);
		mImageView.setLayoutParams(mp);
	}
}