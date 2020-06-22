package com.uptech.sensorcollectionexp;

import java.io.IOException;
import java.net.UnknownHostException;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.EditText;
import android.widget.GridView;

import com.uptech.ScrollView.ScrollLayout;
import com.uptech.Tools.Utils;
import com.uptech.bH1750.EXP_Bh1750Activity;
import com.uptech.df940.EXP_DF940Activity;
import com.uptech.exp_dip.DipActivity;
import com.uptech.exp_hall.EXP_HallActivity;
import com.uptech.exp_mcph.McphActivity;
import com.uptech.exp_shock.ShockActivity;
import com.uptech.exp_trac.TracActivity;
import com.uptech.exp_ys17.YS17Activity;
import com.uptech.exps_ble.BLEActivity;
import com.uptech.exps_wifi.Exps_WifiActivity;
import com.uptech.exps_zigbee.SmartHomeActivity;
import com.uptech.intelligentgreenhouse.IntelligentGreenHouseActivity;
import com.uptech.irst.EXP_IrstActivity;
import com.uptech.ledbuzzer.EXP_LedBuzzerActivity;
import com.uptech.multimeter.MultimeterActivity;
import com.uptech.rainsnow.EXP_RainSnowActivity;
import com.uptech.sensorinfo.ReConnectSocket;
import com.uptech.sensorinfo.SensorFrameFilter;
import com.uptech.sensorinfo.SocketTheadManager;
import com.uptech.sht11.EXP_SHT11Activity;
import com.uptech.smog.EXP_SmogActivity;

public class MainActivity extends Activity implements OnItemClickListener {

	private ScrollLayout mScrollLayout;
	private static final int ONE_PAGE_SIZE = 12;
	private SensorContentAdapter mAdapter;
	private final String TAG = "MainActivity";
	private SocketTheadManager socketThreadManager;
	private SensorCollectionApplication myapp;
	private long exitTime = 0;
	private SensorFrameFilter filter;
	private WifiChangeBroadcastReceiver recv;
	private boolean client_status;
	
	private ReConnectSocket reConnectSocket = new ReConnectSocket() {

		@Override
		public void reconnect() {
			int count = 0;
			stopClientThread();
			while (count < 100) {
				if (Utils.isServerDevice()) {
					SensorCollectionApplication.showMsg("This Device Contain Server,reConnect to Localhost.");
					if(startClient(myapp.getIpstr(),myapp.getPort()))
					{
						count = 0;
						break;
					}
					Log.d(TAG, "reconnect");
				} else {
					SensorCollectionApplication .showMsg("This Device not Contain Server, you'd better set the connection.");
					Log.d(TAG, "This Device not Contain Server, you'd better set the connection.");
				}
				try {
					count ++;
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		if (android.os.Build.VERSION.SDK_INT > 9) {
			StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
			StrictMode.setThreadPolicy(policy);
		}
		recv = new WifiChangeBroadcastReceiver();
		mScrollLayout = (ScrollLayout) findViewById(R.id.myscrollview1);
		initViews();
		myapp = (SensorCollectionApplication) this.getApplication();
		filter = SensorFrameFilter.getinstance(myapp.getApplicationContext());
		filter.setAction("com.uptech.SensorCollection.BC");
		myapp.setSensorFrameFilter(filter);
		myapp.setPort(6008);
		if(Utils.isServerDevice())
		{
			myapp.setIpstr("127.0.0.1");
			SensorCollectionApplication.showMsg("This Device Contain Server, Connect to Localhost.");
			startClient(myapp.getIpstr(),myapp.getPort());
		}
		else
		{
			SensorCollectionApplication.showMsg("This Device not Contain Server, you'd better set the connection.");
		}
		IntentFilter filter = new IntentFilter();
		filter.addAction("android.net.wifi.RSSI_CHANGED");
		this.registerReceiver(recv, filter);
	}

	private boolean startClient(final String ip,final int port) {
		Thread t = new Thread(new Runnable() {
			public void run() {
				try {
					socketThreadManager = SocketTheadManager.getSocketThreadManager(ip, port);
					socketThreadManager.setDebug(true);
					socketThreadManager.setReadRate(10);
					socketThreadManager.setSendRate(2000);
					socketThreadManager.setFilter(myapp.getSensorFrameFilter());
					socketThreadManager.setSenddata(Utils.sendBuffer);
					socketThreadManager.startSocketThread();
					socketThreadManager.setReconnetInterface(reConnectSocket);
					myapp.setSocketThreadManager(socketThreadManager);
					client_status = true;
				} catch (UnknownHostException e) {
					SensorCollectionApplication.showMsg(e.getMessage());
					client_status = false;
					e.printStackTrace();
				} catch (IOException e) {
					SensorCollectionApplication.showMsg(e.getMessage());
					e.printStackTrace();
					client_status = false;
				}
			}
		});
		t.start();
		Log.e(TAG, "Client Started ");
		return client_status;
	}

	private void stopClientThread() {
		if(socketThreadManager != null)
			socketThreadManager.release();
		Log.e(TAG, "stoped");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		try {
			Utils.setIconEnable(menu, true);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
    public boolean onOptionsItemSelected(MenuItem i){
    	switch(i.getItemId()){
		    case R.id.action_settings:
		    	LayoutInflater inflater = (LayoutInflater) myapp.getSystemService(LAYOUT_INFLATER_SERVICE);
				View view = inflater.inflate(R.layout.setting, null);
				final EditText iptext = (EditText)view.findViewById(R.id.serverip);
				final EditText porttext = (EditText)view.findViewById(R.id.serverport);
				iptext.setText(myapp.getIpstr());
				porttext.setText(myapp.getPort() + "");
				new AlertDialog.Builder(MainActivity.this)
						.setIcon(android.R.drawable.ic_dialog_info)
						.setTitle("服务器设置")
						.setView(view)
						.setNegativeButton("确定", new OnClickListener() {
							
							@Override
							public void onClick(DialogInterface dialog, int which) {
								String ipinfoString = iptext.getText().toString();
								int port = 0;
								try {
								port = Integer.valueOf(porttext.getText().toString());
								} catch (NumberFormatException e) {
									SensorCollectionApplication.showMsg("转换失败！端口号在1024 ~ 65535之间");
									return;
								}
								if (!Utils.checkIp(ipinfoString)) {
									ipinfoString = myapp.getIpstr();
									SensorCollectionApplication.showMsg("请输入合法的ip地址");
									return ;
								}
								myapp.setIpstr(ipinfoString);
								if(port<1024||port>65535)
								{
									port = myapp.getPort();
									SensorCollectionApplication.showMsg("端口号在1024 ~ 65535之间");
									return;
								}
								myapp.setPort(port);
								stopClientThread();
								startClient(myapp.getIpstr(), myapp.getPort());
							}
							
						})
						.setPositiveButton("取消", null)
						.show();

		    	return true;
		    case R.id.action_quit:
		    	this.unregisterReceiver(recv);
		    	this.stopClientThread();
		    	this.finish();
	            System.exit(0);
		    	return true;
		    default:
		    	return false;
		}
    }
	public void initViews() {

		final int PageCount = (int) Math.ceil(Utils.getappcounts()
				/ Utils.APP_PAGE_SIZE);
		for (int i = 0; i < PageCount; i++) {
			GridView appPage = new GridView(this);
			mAdapter = new SensorContentAdapter(this, i);
			appPage.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT,
					LayoutParams.MATCH_PARENT));
			appPage.setColumnWidth(120);
			appPage.setGravity(Gravity.CENTER);
			appPage.setHorizontalSpacing(20);
			appPage.setVerticalSpacing(15);
			appPage.setAlpha(0.8f);
			appPage.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
			appPage.setAdapter(mAdapter);
			appPage.setNumColumns(4);
			appPage.setOnItemClickListener(this);
			mScrollLayout.addView(appPage);
		}
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if (keyCode == KeyEvent.KEYCODE_BACK
				&& event.getAction() == KeyEvent.ACTION_DOWN) {
			if ((System.currentTimeMillis() - exitTime) > 2000) {
				SensorCollectionApplication.showMsg("再按一次退出程序");
				exitTime = System.currentTimeMillis();
			} else {
				this.unregisterReceiver(recv);
		    	this.stopClientThread();
		    	this.finish();
				System.exit(0);
			}
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
	
	private class WifiChangeBroadcastReceiver extends BroadcastReceiver {
	    @Override 
	    public void onReceive(Context context, Intent intent) { 
	        WifiManager wifiManager = (WifiManager) context.getSystemService(Context.WIFI_SERVICE); 
	        WifiInfo wifiInfo = wifiManager.getConnectionInfo(); 
	        if (wifiInfo.getBSSID() != null) {
	            String ssid = wifiInfo.getSSID();
	            int ip = wifiManager.getConnectionInfo().getIpAddress();
	            if(ip!=0)
	            {
	            	String ipstr = (ip & 0xFF) + "." + ((ip >> 8) & 0xFF) + "." + ((ip >> 16) & 0xFF)
		    				+ "." + ((ip >> 24) & 0xFF);
	            	if(!ssid.equals(myapp.getSsid()))
	            	{
	            		myapp.setSsid(ssid);
	            		myapp.setIpstr(ipstr);
	            		SensorCollectionApplication.showMsg("网络发生了改变,SSID: " + ssid +" ,IP: " + ipstr);
	            		stopClientThread();
	        			startClient(myapp.getIpstr(), myapp.getPort());
	            	}
	            	else if(!((myapp.getIpstr()).equals(ipstr)))
	            	{
	            		myapp.setIpstr(ipstr);
	            		SensorCollectionApplication.showMsg("IP发生了改变,IP: " + ipstr);
	            		stopClientThread();
	        			startClient(myapp.getIpstr(), myapp.getPort());
	            	}
	            }
	        }
	    }  
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int pos, long id) {
		int cur = pos + mScrollLayout.getCurScreen() * ONE_PAGE_SIZE;
		if (mAdapter.getResId(cur) == R.string.exp_snow) {
			Intent ConnectIntent = new Intent(this, EXP_RainSnowActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_sht) {
			Intent ConnectIntent = new Intent(this, EXP_SHT11Activity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_smog) {
			Intent ConnectIntent = new Intent(this, EXP_SmogActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_ys17) {
			Intent ConnectIntent = new Intent(this, YS17Activity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_led) {
			Intent ConnectIntent = new Intent(this, EXP_LedBuzzerActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_bh1750) {
			Intent ConnectIntent = new Intent(this, EXP_Bh1750Activity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_df940) {
			Intent ConnectIntent = new Intent(this, EXP_DF940Activity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_irds) {
			Intent ConnectIntent = new Intent(this, EXP_IrstActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_Zigbee) {
			Intent ConnectIntent = new Intent(this, SmartHomeActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_mcph) {
			Intent ConnectIntent = new Intent(this, McphActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_dip) {
			Intent ConnectIntent = new Intent(this, DipActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_shock) {
			Intent ConnectIntent = new Intent(this, ShockActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_trac) {
			Intent ConnectIntent = new Intent(this, TracActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_WIFI) {
			Intent ConnectIntent = new Intent(this, Exps_WifiActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_BLE) {
			Intent ConnectIntent = new Intent(this, BLEActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.multimeter) {
			Intent ConnectIntent = new Intent(this, MultimeterActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.intellgentgreenhouse) {
			Intent ConnectIntent = new Intent(this, IntelligentGreenHouseActivity.class);
			this.startActivity(ConnectIntent);
		} else if (mAdapter.getResId(cur) == R.string.exp_hall) {
			Intent ConnectIntent = new Intent(this, EXP_HallActivity.class);
			this.startActivity(ConnectIntent);
		}
	}
}
