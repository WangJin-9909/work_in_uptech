package com.uptech.multimeter;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.uptech.Tools.Utils;
import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorcollectionexp.SensorCollectionApplication;
import com.uptech.sensorinfo.SensorCollection;

public class MultimeterActivity extends Activity {

	private static final String TAG = "MultimeterActivity";
	private TextView title,value;
	private SensorCollectionApplication myapp;
	private String selectitem,action;
	private MyBroadcastReceiver recv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_multimeter);
		title = (TextView) findViewById(R.id.text_title);
		value = (TextView) findViewById(R.id.text_content);
		myapp = (SensorCollectionApplication)this.getApplication();
		recv = new MyBroadcastReceiver();
		action = "com.uptech.SensorCollection.BC";
		selectitem = "mul_bh";
		title.setText(R.string.mul_bh);
		
	}
	@Override
	protected void onResume() {
		IntentFilter filter = new IntentFilter();
		filter.addAction(action + SensorCollection.SensorID.LLUX);
		filter.addAction(action + SensorCollection.SensorID.SHT);
		filter.addAction(action + SensorCollection.SensorID.DF940);
		this.registerReceiver(recv, filter);
		super.onResume();
	}
	@Override
	public void onPause() {
		this.unregisterReceiver(recv);
		this.finish();
		super.onPause();
	}
	/**
	 * Broadcast Receiver
	 * 
	 */
	private class MyBroadcastReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			String recv_action = intent.getAction();
			if (recv_action.equals(action + SensorCollection.SensorID.LLUX))
			{
				if(selectitem.equals("mul_bh"))
					value.setText(SensorCollection.SensorData.SLLUX.llux + " llux");
			}
			else if (recv_action.equals( action + SensorCollection.SensorID.DF940)) {
				if(selectitem.equals("mul_df940"))
				{
					int df940 = (int) SensorCollection.SensorData.SDF940.df940;
					value.setText(Utils.getPress(df940) + " Kg");
				}
			}
			else if (recv_action.equals(action +  SensorCollection.SensorID.SHT)) {
				if(selectitem.equals("mul_temp"))
					value.setText(SensorCollection.SensorData.SSHT.temp + " ¡æ");
				if(selectitem.equals("mul_humi"))
					value.setText(SensorCollection.SensorData.SSHT.humi + " %");
			}
		}
	}
	
	public void onButton_Click(View v) {
		switch (v.getId()) {
		case R.id.mul_bh:
			value.setText(SensorCollection.SensorData.SLLUX.llux + " llux");
			selectitem = "mul_bh";
			break;
		case R.id.mul_humi:
			value.setText(SensorCollection.SensorData.SSHT.humi + " %");
			selectitem = "mul_humi";
			break;
		case R.id.mul_temp:
			value.setText(SensorCollection.SensorData.SSHT.temp + " ¡æ");
			selectitem = "mul_temp";
			break;
		case R.id.mul_df940:
			int df940 =  SensorCollection.SensorData.SDF940.df940;
			value.setText(Utils.getPress(df940) + " Kg");
			selectitem = "mul_df940";
			break;
		default:
			return;
		}
		title.setText(((Button)v).getText());
	}
}
