package com.uptech.exps_wifi;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.format.Time;
import android.widget.ImageView;
import android.widget.TextView;

import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorinfo.SensorCollection;

public class Exps_WifiActivity extends Activity {

	private final static String TAG = "Exps_WifiActivity";
	private Time time;
	private MyBroadcastReceiver recv;
	private TextView[] mTextView = new TextView[4];
	private ImageView mImageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_exps__wifi);
		mTextView[0] = (TextView) findViewById(R.id.light_value);
		mTextView[1] = (TextView) findViewById(R.id.ys17_value);
		mTextView[2] = (TextView) findViewById(R.id.irds_value);
		mImageView = (ImageView) findViewById(R.id.snow_img);
		time = new Time("GMT+8");       
	    time.setToNow();
		recv = new MyBroadcastReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction("com.uptech.SensorCollection.BC"+ SensorCollection.SensorID.YS17);
		filter.addAction("com.uptech.SensorCollection.BC"+ SensorCollection.SensorID.IRDS);
		filter.addAction("com.uptech.SensorCollection.BC"+ SensorCollection.SensorID.SNOW);
		filter.addAction("com.uptech.SensorCollection.BC"+ SensorCollection.SensorID.LLUX);
		this.registerReceiver(recv, filter);
	}
	/**
	 * Broadcast Receiver
	 * 
	 */
	private class MyBroadcastReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			if (intent.getAction().equals("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.SNOW))
			{
				if(SensorCollection.SensorData.SSNOW.status == 0x00)
					mImageView.setImageResource(R.drawable.sun);
				else if(SensorCollection.SensorData.SSNOW.status == 0x01)
				{
				    int month = time.month + 1;
				    if((month==12)||(month<3))
				    	mImageView.setImageResource(R.drawable.snow);
				    else
				    	mImageView.setImageResource(R.drawable.rain);
				}
			}
			else if (intent.getAction().equals("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.IRDS))
			{
				if(SensorCollection.SensorData.SIRDS.status == 0x00)
					mTextView[2].setText("正常");
				else if(SensorCollection.SensorData.SIRDS.status == 0x01)
					mTextView[2].setText("异常");
			}
			else if (intent.getAction().equals("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.YS17))
			{
				if(SensorCollection.SensorData.SYS17.status == 0x00)
					mTextView[1].setText("正常");
				else if(SensorCollection.SensorData.SYS17.status == 0x01)
					mTextView[1].setText("异常");
			}
			else if (intent.getAction().equals("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.LLUX)) {
				mTextView[0].setText(SensorCollection.SensorData.SLLUX.llux + " llux");
			}
		}

	}
	@Override
	public void onPause()
	{
		this.unregisterReceiver(recv);
		this.finish();
		super.onPause();
	}
}
