package com.uptech.smarthomeimplmqtt.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.uptech.smarthomeimplmqtt.R;
import com.uptech.smarthomeimplmqtt.adapter.bean.DeviceBean;
import com.uptech.smarthomeimplmqtt.utils.Utils;

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
public class DeviceAllListAdapter extends BaseAdapter{
    private Context context;
    private LayoutInflater inflater;
    private List<DeviceBean> mDatas;
    private OnListViewButtonClickListener clickListener;
    public DeviceAllListAdapter(Context context, List<DeviceBean> datas, OnListViewButtonClickListener listener)
    {
        this.context = context;
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
            convertView = inflater.inflate(R.layout.item_listview_device, parent, false); //加载布局
            holder = new ViewHolder();

            holder.titleTv = convertView.findViewById(R.id.titleTv);
            holder.descTv = convertView.findViewById(R.id.descTv);
            holder.timeTv = convertView.findViewById(R.id.timeTv);
            holder.message = convertView.findViewById(R.id.mesgtips);

            convertView.setTag(holder);
        } else {   //else里面说明，convertView已经被复用了，说明convertView中已经设置过tag了，即holder
            holder = (ViewHolder) convertView.getTag();
        }

        DeviceBean bean = mDatas.get(position);
        holder.titleTv.setText(bean.getTitle());
        holder.descTv.setText(bean.getDesc());
        holder.timeTv.setText(bean.getTime());
        holder.message.setText(bean.getMesg());
        if(bean.getMesg_TextSize() > 0)
            holder.message.setTextSize(Utils.scalaFonts(context,bean.getMesg_TextSize()));
        holder.message.setTextColor(bean.getMesg_textColor());
        holder.message.setBackgroundColor(bean.getMesg_BgColor());
        holder.message.setOnClickListener(new View.OnClickListener() {
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
        TextView message;
    }
}
