package com.uptech.exps_ble;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorinfo.SensorCollection;

public class BLEActivity extends Activity {

	private final static String TAG = "BLEActivity";
	private MyBroadcastReceiver recv;
	private TextView[] mTextView = new TextView[5];
	private ImageView mImageView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ble);
		mTextView[0] = (TextView) findViewById(R.id.hall_data);
		mTextView[1] = (TextView) findViewById(R.id.shock_data);
		//mTextView[1] = (TextView) findViewById(R.id.mfs_x);
		//mTextView[2] = (TextView) findViewById(R.id.mfs_y);
		//mTextView[3] = (TextView) findViewById(R.id.mfs_z);
		mTextView[2] = (TextView) findViewById(R.id.trac_x);
		mTextView[3] = (TextView) findViewById(R.id.trac_y);
		mTextView[4] = (TextView) findViewById(R.id.trac_z);
		mImageView = (ImageView) findViewById(R.id.img_ship);
		recv = new MyBroadcastReceiver();
		IntentFilter filter = new IntentFilter();
		filter.addAction("com.uptech.SensorCollection.BC"+ SensorCollection.SensorID.MCPH);
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.HALL);
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.TRACL);
		filter.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.TRAC);
		filter.addAction("com.uptech.SensorCollection.BC"+ SensorCollection.SensorID.SHK);
		this.registerReceiver(recv, filter);
	}
	/**
	 * Broadcast Receiver
	 * 
	 */
	private class MyBroadcastReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			if (intent.getAction().equals( "com.uptech.SensorCollection.BC" + SensorCollection.SensorID.MCPH))
			{
				if(SensorCollection.SensorData.SMCPH.mic ==1 && SensorCollection.SensorData.SMCPH.phs== 1)
				{
					mImageView.setImageResource(R.drawable.ship2);
				}
				else
					mImageView.setImageResource(R.drawable.ship1);
			}
			else if (intent.getAction().equals( "com.uptech.SensorCollection.BC" + SensorCollection.SensorID.SHK))
			{
				if(SensorCollection.SensorData.SSHK.status == 0x00)
				{
					mTextView[1].setText("״̬���� ");				
				}else if(SensorCollection.SensorData.SSHK.status == 0x01)
				{
					mTextView[1].setText("���쳣 ");				
				}else{
					mTextView[1].setText("��ֵ�쳣 ");	
				}				
			}
			else if (intent.getAction().equals( "com.uptech.SensorCollection.BC"+ SensorCollection.SensorID.HALL))
			{
				if(SensorCollection.SensorData.SHALL.hall == 0x00){
					mTextView[0].setText("���Źر�");
				}else if(SensorCollection.SensorData.SHALL.hall == 0x01)
				{
					mTextView[0].setText("���Ŵ�");
				}
				if(SensorCollection.SensorData.SHALL.door == 0x00){
					
				}else if(SensorCollection.SensorData.SHALL.door == 0x01)
				{
					
				}
			}
			else if (intent.getAction().equals( "com.uptech.SensorCollection.BC" + SensorCollection.SensorID.TRACL)) {
				mTextView[2].setText("X���� " + SensorCollection.SensorData.STRACL.x);
				mTextView[3].setText("Y���� " + SensorCollection.SensorData.STRACL.y );
				mTextView[4].setText("Z���� " + SensorCollection.SensorData.STRACL.z );
			}
			else if (intent.getAction().equals( "com.uptech.SensorCollection.BC" + SensorCollection.SensorID.TRAC)) {
				mTextView[2].setText("X���� " + SensorCollection.SensorData.STRAC.x);
				mTextView[3].setText("Y���� " + SensorCollection.SensorData.STRAC.y );
				mTextView[4].setText("Z���� " + SensorCollection.SensorData.STRAC.z );
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
