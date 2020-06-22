package com.uptech.Tools;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;

import com.uptech.sensorcollectionexp.R;

public class Utils {

	public static final float APP_PAGE_SIZE = 12.0f;

	public static byte[] sendBuffer = new byte[] { (byte) 0xFE, (byte) 0xEF,
			0x09, 0x78, 0x71, 0x00, (byte) 0xFF, (byte) 0xFF, 0x0A };
	public static int mappnames[] = { R.string.exp_smog,R.string.exp_df940, R.string.exp_sht,
			R.string.exp_led, R.string.exp_irds,R.string.exp_ys17,
			R.string.exp_snow, R.string.exp_bh1750,
			R.string.exp_mcph, R.string.exp_shock, R.string.exp_hall,
			R.string.exp_trac, R.string.exp_Zigbee, R.string.exp_WIFI,
			R.string.exp_BLE, R.string.multimeter,
			R.string.intellgentgreenhouse };

	public static int mappicons[] = { R.drawable.smog,R.drawable.df940, R.drawable.sht,
			R.drawable.ledb, R.drawable.irds,R.drawable.ys17,
			R.drawable.snows, R.drawable.bh1750, R.drawable.mcph,
			R.drawable.shock, R.drawable.hall, R.drawable.trac,
			R.drawable.zigbees, R.drawable.wifis, R.drawable.bles,
			R.drawable.multimeter_ico, R.drawable.intelligentgreenhouse_ico };

	public static int getappcounts() {
		return mappnames.length;
	}

	public static DisplayMetrics getDM(Context context) {
		try {
			DisplayMetrics dm = new DisplayMetrics();
			WindowManager manager = (WindowManager) context
					.getSystemService(Context.WINDOW_SERVICE);
			manager.getDefaultDisplay().getMetrics(dm);
			return dm;
		} catch (Exception ex) {

		}
		return null;
	}

	/**
	 * 判断IP是否合法
	 * 
	 * @param ip
	 *            IP字符串
	 * @return 如果合法返回true，否则返回false
	 */
	public static boolean checkIp(String ip) {
		Pattern p = Pattern
				.compile("(?<=(\\b|\\D))(((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))(?=(\\b|\\D))");
		Matcher m = p.matcher(ip);
		return m.find();
	}

	/**
	 * 判断当前设备是不是开发板设备
	 * 
	 * @return 是返回true，否则返回false
	 */
	public static Boolean isServerDevice() {
        String board = Build.BOARD;
        String product = Build.PRODUCT;
        if(board.equals("SABRESD") && product.equals("sabresd_6dq_mobnet_ii"))
            return true;
        else
            return false;
	}

	public static String getPress(int value) {
		float k1_value = -0.013f;
		float k2_value = -0.111f;
		float k3_value = -0.83f;

		float b1_value = 1.65f;
		float b2_value = 6.44f;
		float b3_value = 19.15f;
		float R_val = 0.0f;
		float g_out = 0.0f;

		float v_out = Float.intBitsToFloat(value);
		R_val = (float) (10 * v_out / (3.3 - v_out));
		if ((R_val <= 100) && (R_val > 50)) {
			g_out = k1_value * R_val + b1_value;
		} else if ((R_val <= 50) && (R_val > 18)) {
			g_out = k2_value * R_val + b2_value;
		} else if (R_val <= 18) {
			g_out = k3_value * R_val + b3_value;
		} else {
			g_out = 0;
		}
		DecimalFormat df = new DecimalFormat("0.00");
		return df.format(g_out);
	}

	/**
	 * 设置图标可见
	 * 
	 * @param menu
	 * @param enable
	 * @throws Exception
	 */
	public static void setIconEnable(android.view.Menu menu, boolean enable)
			throws Exception {
		Class<?> clazz = Class
				.forName("com.android.internal.view.menu.MenuBuilder");
		java.lang.reflect.Method m = clazz.getDeclaredMethod(
				"setOptionalIconsVisible", boolean.class);
		m.setAccessible(true);
		m.invoke(menu, enable);
	}
}
