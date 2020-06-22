package com.uptech.sensorcollectionexp;

import java.util.ArrayList;
import java.util.List;

import com.uptech.Tools.Utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

public class SensorContentAdapter extends BaseAdapter implements ListAdapter {

	class mapp {
		int icon;
		int app;

		public mapp(int icon, int app) {
			this.icon = icon;
			this.app = app;
		}

		public int loadicon() {
			return icon;
		}

		public int loadapp() {
			return app;
		}
	}

	private List<mapp> mList;
	private Context mContext;

	public SensorContentAdapter(Context context, int page) {
		this.mContext = context;
		mList = new ArrayList<SensorContentAdapter.mapp>();
		int i = (int) (page * Utils.APP_PAGE_SIZE);
		int iEnd = (int) (i + Utils.APP_PAGE_SIZE);
		while ((i < Utils.getappcounts()) && (i < iEnd)) {
			mList.add(new mapp(Utils.mappicons[i], Utils.mappnames[i]));
			i++;
		}
	}

	@Override
	public int getCount() {
		return mList.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View_EXP view_EXP;
		mapp currentApp = mList.get(position);
		if (convertView == null) {
			View v = LayoutInflater.from(mContext).inflate(R.layout.app_item,null);
			view_EXP = new View_EXP();
			view_EXP.text = (TextView) v.findViewById(R.id.myText);
			view_EXP.image = (ImageView) v.findViewById(R.id.myImage);
			v.setTag(view_EXP);
			convertView = v;
		} else {
			view_EXP = (View_EXP) convertView.getTag();
		}
		view_EXP.image.setBackgroundResource(currentApp.loadicon());
		view_EXP.text.setText(currentApp.loadapp());

		return convertView;
	}

	public int getResId(int position) {

		return (Utils.mappnames[position]);
	}

	private class View_EXP {
		TextView text;
		ImageView image;
	}
}
