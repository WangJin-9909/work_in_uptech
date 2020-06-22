package com.uptech.intelligentgreenhouse;

import java.io.IOException;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorcollectionexp.SensorCollectionApplication;
import com.uptech.sensorinfo.SensorCollection;

public class IntelligentGreenHouseActivity extends Activity {
	private static final String TAG = "IntelligentGreenHouseActivity";
	private TextView[] mTextView;
	private String action;
	private MyBroadcastReceiver recv;
	private ImageView lightView;
	private int count = 0;
	private LinearLayout linearLayout;
	private SensorCollectionApplication app;

	public byte wBuffer[] = new byte[] { (byte) 0xFE, (byte) 0xE0, 0x0B, 0x58,
			0x72, 0x00, 0x00, 0x00, 0x70, 0x00, 0x0A };
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intelligentgreenhouse);
		app = (SensorCollectionApplication) getApplicationContext();
		mTextView = new TextView[6];
		mTextView[0] = (TextView) findViewById(R.id.bh1750);
		mTextView[1] = (TextView) findViewById(R.id.temp);
		mTextView[2] = (TextView) findViewById(R.id.humi);
		mTextView[3] = (TextView) findViewById(R.id.irds);
		mTextView[4] = (TextView) findViewById(R.id.snow);
		mTextView[5] = (TextView) findViewById(R.id.ys17);
		lightView = (ImageView) findViewById(R.id.light_img);
		linearLayout = (LinearLayout) findViewById(R.id.LinearLayout1);
		recv = new MyBroadcastReceiver();
		action = "com.uptech.SensorCollection.BC";
		IntentFilter filter = new IntentFilter();
		filter.addAction(action + SensorCollection.SensorID.IRDS);
		filter.addAction(action + SensorCollection.SensorID.LLUX);
		filter.addAction(action + SensorCollection.SensorID.SHT);
		filter.addAction(action + SensorCollection.SensorID.SNOW);
		filter.addAction(action + SensorCollection.SensorID.YS17);
		this.registerReceiver(recv, filter);
	}
	@Override
	public void onPause() {
		this.unregisterReceiver(recv);
		this.finish();
		super.onPause();
	}
	/**开关按钮点击事件*/
	public void onLedBtn_Click(View v)
	{
		count +=1;
		count %=2;
		ImageButton btn = (ImageButton)v;
		if(count == 0)
		{
			linearLayout.setBackgroundResource(R.drawable.bg_intelligentgreenhouse_off);
			btn.setBackgroundResource(R.drawable.led_off);
			lightView.setBackgroundResource(R.drawable.light);
			wBuffer[7] = 0x00;
		}
		else
		{
			linearLayout.setBackgroundResource(R.drawable.bg_intelligentgreenhouse_on);
			btn.setBackgroundResource(R.drawable.led_open);
			lightView.setBackgroundResource(R.drawable.light_on);
			wBuffer[7] = 0x01;
		}
		try {
			app.getSocketThreadManager().getOutputStream().write(wBuffer);
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(NullPointerException ex){
			ex.printStackTrace();
		}
	}
	/**
	 * Broadcast Receiver
	 *
	 */
	private class MyBroadcastReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			if (intent.getAction().equals( action + SensorCollection.SensorID.IRDS))
			{
				if(SensorCollection.SensorData.SIRDS.status == 0x01)
					mTextView[3].setText("红外：异常");
				else
					mTextView[3].setText("红外：正常");
			}
			else if (intent.getAction().equals(action + SensorCollection.SensorID.LLUX))
			{
				mTextView[0].setText("光照："+SensorCollection.SensorData.SLLUX.llux + " llux");
			}
			else if (intent.getAction().equals( action + SensorCollection.SensorID.SNOW))
			{
				if(SensorCollection.SensorData.SSNOW.status == 0x01)
					mTextView[4].setText("天气：下雨");
				else
					mTextView[4].setText("天气：晴朗");
			}
			else if (intent.getAction().equals( action + SensorCollection.SensorID.YS17)) {
				if(SensorCollection.SensorData.SYS17.status == 0x01)
					mTextView[5].setText("火焰：注意火灾" );
				else
					mTextView[5].setText("火焰：安  全");
			}
			else if (intent.getAction().equals( action + SensorCollection.SensorID.SHT)) {
				mTextView[1].setText("温度："+SensorCollection.SensorData.SSHT.temp + " ℃");
				mTextView[2].setText("湿度："+SensorCollection.SensorData.SSHT.humi + " %");
			}
		}
	}
}