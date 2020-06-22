package com.uptech.exps_zigbee;

import java.io.IOException;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Contacts.People;
import android.provider.ContactsContract.Intents;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorcollectionexp.SensorCollectionApplication;
import com.uptech.sensorinfo.SensorCollection;

@SuppressWarnings("deprecation")
public class SmartHomeActivity extends Activity {

	private final String TAG = "MainActivity";
	private TextView tv_temp, tv_humi,tv_pos,tv_type,tv_status;
	private ImageView SMOGView, IRDSView, light,WarnView;
	private Bitmap[] mbitmap;
	private EditText et;
	private String s = "";
	private Boolean status = false,irds_status = false,smog_status = false;
	public byte wBuffer[] = new byte[] { (byte) 0xFE, (byte) 0xEF, 0x0B, 0x58,0x72, 0x00, 0x00, 0x00, 0x70, 0x00, 0x0A };
	private ImageButton imgbtn, bs1, bs2, bs3, bs4, bs5, bs6, bs7, bs8, bs9,
	bs10, bs11, calls;
	public int bi[] = { R.id.imageButton2, R.id.imageButton3,
	R.id.imageButton4, R.id.imageButton5, R.id.imageButton6,
	R.id.imageButton7, R.id.imageButton8, R.id.imageButton9,
	R.id.imageButton10, R.id.imageButton11, R.id.imageButton12};
	private BroadcastReceiver_SMOG recv_smog;
	private BroadcastReceiver_SHT recv_sht;
	private BroadcastReceiver_IRDS recv_irds;
	private SensorCollectionApplication app;
	
	private float k1_value = -0.013f;
	private float k2_value = -0.111f;
	private float k3_value = -0.83f;
	  
	private float b1_value = 1.65f;
	private float b2_value = 6.44f;
	private float b3_value = 19.15f;
	private float R_val = 0.0f;
	private float g_out = 0.0f;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_smarthome);
		tv_temp = (TextView) findViewById(R.id.textView9);
		tv_humi = (TextView) findViewById(R.id.textView12);
		tv_pos = (TextView) findViewById(R.id.textView2);
		tv_type = (TextView) findViewById(R.id.textView6);
		tv_status = (TextView) findViewById(R.id.textView4);
		SMOGView = (ImageView) findViewById(R.id.imageView7);
		IRDSView = (ImageView) findViewById(R.id.imageView6);
		light = (ImageView) findViewById(R.id.light);
		recv_irds = new BroadcastReceiver_IRDS();
		recv_smog = new BroadcastReceiver_SMOG();
		recv_sht = new BroadcastReceiver_SHT();
		IntentFilter filter_irds = new IntentFilter();
		filter_irds.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.DF940);
		this.registerReceiver(recv_irds, filter_irds);
		IntentFilter filter_smog = new IntentFilter();
		filter_smog.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.SMOG);
		this.registerReceiver(recv_smog, filter_smog);
		IntentFilter filter_sht = new IntentFilter();
		filter_sht.addAction("com.uptech.SensorCollection.BC" + SensorCollection.SensorID.SHT);
		this.registerReceiver(recv_sht, filter_sht);
		app = (SensorCollectionApplication) this.getApplication();
		light.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try{
					if(status)
					{
						status = false;
						wBuffer[7] = 0x01;
						app.getSocketThreadManager().getOutputStream().write(wBuffer);
						light.setImageBitmap(mbitmap[5]);
					}
					else
					{
						status = true;
						wBuffer[7] = 0x00;
						app.getSocketThreadManager().getOutputStream().write(wBuffer);
						light.setImageBitmap(mbitmap[4]);
					}
					
				}catch(Exception e)
				{
					SensorCollectionApplication.showMsg("May be not connect");
				}
			}
		});
		WarnView = (ImageView) findViewById(R.id.imageView1);
		mbitmap = new Bitmap[] {
				BitmapFactory.decodeResource(getResources(),R.drawable.node_smog),
				BitmapFactory.decodeResource(getResources(),R.drawable.node_smog_selected),
				BitmapFactory.decodeResource(getResources(),R.drawable.node_magt),
				BitmapFactory.decodeResource(getResources(),R.drawable.node_magt_selected),
				BitmapFactory.decodeResource(getResources(),R.drawable.node_light),
				BitmapFactory.decodeResource(getResources(),R.drawable.node_light_selected),
				BitmapFactory.decodeResource(getResources(),R.drawable.node_warning),
				BitmapFactory.decodeResource(getResources(),R.drawable.node_warning_selected)};
		Typeface face = Typeface.createFromAsset(getAssets(), "fonts/digb.ttf");
		tv_temp.setTypeface(face);
		tv_humi.setTypeface(face);
		SetView();
	}
	private class BroadcastReceiver_SMOG extends BroadcastReceiver
	{

		@Override
		public void onReceive(Context context, Intent intent) {
			try
			{
				if ((SensorCollection.SensorData.SSMOG.status & 0x01) == 0x01) {
					tv_pos.setText("厨房");
					tv_type.setText("烟雾传感器");
					tv_status.setText("异常");
					smog_status = true;
					SMOGView.setImageBitmap(mbitmap[1]);
					WarnView.setImageBitmap(mbitmap[7]);
					wBuffer[6] = 0x01;
					app.getSocketThreadManager().getOutputStream().write(wBuffer);
				} else {
					SMOGView.setImageBitmap(mbitmap[0]);
					WarnView.setImageBitmap(mbitmap[6]);
					smog_status = false;
					if(!irds_status&&!smog_status)
						tv_status.setText("正常");
					wBuffer[6] = 0x00;
					app.getSocketThreadManager().getOutputStream().write(wBuffer);
				}
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	private class BroadcastReceiver_IRDS extends BroadcastReceiver
	{

		@Override
		public void onReceive(Context context, Intent intent) {
			try
			{
				float v_out = Float.intBitsToFloat(SensorCollection.SensorData.SDF940.df940);
			    R_val = (float) (10*v_out/(3.3-v_out));
			    if((R_val <= 100) && (R_val > 50)){
			      g_out = k1_value*R_val + b1_value;
			    }else if((R_val <= 50) && (R_val > 18)){
			      g_out = k2_value*R_val + b2_value;
			    }else if(R_val <= 18){
			      g_out = k3_value*R_val + b3_value;
			    }
			    else {
			      g_out = 0;
			    }
				if (g_out > 2f ) {
					tv_pos.setText("阳台");
					tv_type.setText("薄膜压力传感器");
					tv_status.setText("异常");
					irds_status = true;
					IRDSView.setImageBitmap(mbitmap[3]);
					WarnView.setImageBitmap(mbitmap[7]);
					wBuffer[6] = 0x01;
					app.getSocketThreadManager().getOutputStream().write(wBuffer);
				} else {
					IRDSView.setImageBitmap(mbitmap[2]);
					WarnView.setImageBitmap(mbitmap[6]);
					irds_status = false;
					if(!irds_status&&!smog_status)
						tv_status.setText("正常");
					wBuffer[6] = 0x00;
					app.getSocketThreadManager().getOutputStream().write(wBuffer);
				}
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
		
	}
	private class BroadcastReceiver_SHT extends BroadcastReceiver
	{

		@Override
		public void onReceive(Context context, Intent intent) {
			tv_humi.setText(SensorCollection.SensorData.SSHT.humi + "");
			tv_temp.setText(SensorCollection.SensorData.SSHT.temp + "");
		}
		
	}
	@Override
	protected void onPause() {
		 this.unregisterReceiver(recv_irds);
		 this.unregisterReceiver(recv_sht);
		 this.unregisterReceiver(recv_smog);
		 wBuffer[6] = 0x00;
		 try {
			app.getSocketThreadManager().getOutputStream().write(wBuffer);
		} catch (IOException e) {
			e.printStackTrace();
		}catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		 this.finish();
		 super.onPause();
	}
	/**
	 * 数字键盘及拨号键的监听
	 * 
	 * @param ib
	 * @param value
	 */
	public void Listener(ImageButton ib,final String value) {
		ib.setOnClickListener(new OnClickListener() {
			public void onClick(View view) {
				Log.e(TAG, value);
				if (value == "t") {// 点击拨号按钮
					try {// 拨号
						String inputStr = s.toString().trim();
						Intent intent = new Intent(Intent.ACTION_CALL, Uri
								.parse("tel:" + inputStr));
						startActivity(intent);
						s = "";
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else if (value == "<-")
					try {
						s = s.substring(0, s.length() - 1);
					} catch (StringIndexOutOfBoundsException e) {
					}
				else if (value == "" && s.length() > 0) {
					// 存储联系人，不知道为什么的人自己上网查看安卓文档
					Uri insertUri = People.CONTENT_URI;
					Intent intent = new Intent(Intent.ACTION_INSERT, insertUri);
					intent.putExtra(Intents.Insert.NAME, "张三");
					intent.putExtra(Intents.Insert.PHONE, s);
					intent.putExtra(Intents.Insert.POSTAL, "北京市海淀区知春路56号");
					startActivity(intent);
				} else
					s = s + value;
				if (s.length() > 11)
					s = s.substring(0, 11);
				et.setFocusable(false);
				et.setPadding(0, 0, 0, 0);
				et.setText(s);
			}
		});
	}
	public void SetView() {

		et = (EditText) findViewById(R.id.editText1);
		imgbtn = (ImageButton) findViewById(R.id.imageButton1);
		Listener(imgbtn, "9");
		bs1 = (ImageButton) findViewById(bi[0]);
		Listener(bs1, "8");
		bs2 = (ImageButton) findViewById(bi[1]);
		Listener(bs2, "7");
		bs3 = (ImageButton) findViewById(bi[2]);
		Listener(bs3, "6");
		bs4 = (ImageButton) findViewById(bi[3]);
		Listener(bs4, "5");
		bs5 = (ImageButton) findViewById(bi[4]);
		Listener(bs5, "4");
		bs6 = (ImageButton) findViewById(bi[5]);
		Listener(bs6, "3");
		bs7 = (ImageButton) findViewById(bi[6]);
		Listener(bs7, "2");
		bs8 = (ImageButton) findViewById(bi[7]);
		Listener(bs8, "1");
		bs9 = (ImageButton) findViewById(bi[8]);
		Listener(bs9, "0");
		bs10 = (ImageButton) findViewById(bi[9]);
		Listener(bs10, "");
		bs11 = (ImageButton) findViewById(bi[10]);
		Listener(bs11, "<-");
		calls = (ImageButton) findViewById(R.id.imageButton13);//
		Listener(calls, "t");
	}

}
