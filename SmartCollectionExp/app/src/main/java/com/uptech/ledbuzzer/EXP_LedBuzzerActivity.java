package com.uptech.ledbuzzer;

import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import com.uptech.sensorcollectionexp.R;
import com.uptech.sensorcollectionexp.SensorCollectionApplication;

public class EXP_LedBuzzerActivity extends Activity implements OnClickListener {
	private final String TAG = "LedBuzzerActivity";
	public ImageView lightstatus;
	public ImageView beeperstatus;
	private SensorCollectionApplication app;
	public byte wBuffer[] = new byte[] { (byte) 0xFE, (byte) 0xE0, 0x0B, 0x58,
			0x72, 0x00, 0x00, 0x00, 0x70, 0x00, 0x0A };

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_led);

		Button btn_lighton = (Button) findViewById(R.id.lightonbutton);
		Button btn_lightoff = (Button) findViewById(R.id.lightoffbutton);
		Button btn_beeperon = (Button) findViewById(R.id.beeperonbutton);
		Button btn_beeperoff = (Button) findViewById(R.id.beeperoffbutton);

		lightstatus = (ImageView) findViewById(R.id.lightstatus);
		beeperstatus = (ImageView) findViewById(R.id.beeperstatus);
		app = (SensorCollectionApplication) getApplicationContext();
		btn_lighton.setOnClickListener(this);
		btn_lightoff.setOnClickListener(this);
		btn_beeperon.setOnClickListener(this);
		btn_beeperoff.setOnClickListener(this);
	}

	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.lightonbutton:
			lightstatus.setImageResource(R.drawable.lighton);
			wBuffer[7] = 0x01;
			break;
		case R.id.lightoffbutton:
			lightstatus.setImageResource(R.drawable.lightoff);
			wBuffer[7] = 0x00;
			break;
		case R.id.beeperonbutton:
			beeperstatus.setImageResource(R.drawable.beeperon);
			wBuffer[6] = 0x01;
			break;
		case R.id.beeperoffbutton:
			beeperstatus.setImageResource(R.drawable.beeperoff);
			wBuffer[6] = 0x00;
			break;
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
}