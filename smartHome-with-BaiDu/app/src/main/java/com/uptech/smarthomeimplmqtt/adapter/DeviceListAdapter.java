package com.uptech.smarthomeimplmqtt.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.uptech.smarthomeimplmqtt.R;
import com.uptech.smarthomeimplmqtt.adapter.bean.DeviceBean;

import java.util.List;
/**
 * **********************************************
 * @fileName:    DeviceListAdapter.java
 * **********************************************
 * @descriprion Device 链表的适配器
 * @author       up-tech@jianghj
 * @email:       huijun2014@sina.cn
 * @time         2018/9/19 0019 15:23
 * @version     1.0
 *
 *************************************************/
public class DeviceListAdapter extends BaseAdapter{
    private LayoutInflater inflater;
    private List<DeviceBean> mDatas;
    private OnListViewButtonClickListener clickListener;
    public DeviceListAdapter(Context context, List<DeviceBean> datas,OnListViewButtonClickListener listener)
    {
        inflater = LayoutInflater.from(context);
        mDatas = datas;
        clickListener = listener;
    }

    @Override
    public int getCount() {
        return mDatas.size();
    }

    @Override
    public Object getItem(int i) {
        return mDatas.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {
        ViewHolder holder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item_listview, parent, false); //加载布局
            holder = new ViewHolder();

            holder.titleTv = convertView.findViewById(R.id.titleTv);
            holder.descTv = convertView.findViewById(R.id.descTv);
            holder.timeTv = convertView.findViewById(R.id.timeTv);
            holder.ctl_btn = convertView.findViewById(R.id.ctrl_btn);

            convertView.setTag(holder);
        } else {   //else里面说明，convertView已经被复用了，说明convertView中已经设置过tag了，即holder
            holder = (ViewHolder) convertView.getTag();
        }

        DeviceBean bean = mDatas.get(position);
        holder.titleTv.setText(bean.getTitle());
        holder.descTv.setText(bean.getDesc());
        holder.timeTv.setText(bean.getTime());
        holder.ctl_btn.setText(bean.getMesg());
        holder.ctl_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onClick(parent,mDatas,position,v);
            }
        });
        convertView.setBackgroundColor(bean.getItem_BgColor());
        return convertView;
    }
    private class ViewHolder {
        TextView titleTv;
        TextView descTv;
        TextView timeTv;
        Button ctl_btn;
    }
}
