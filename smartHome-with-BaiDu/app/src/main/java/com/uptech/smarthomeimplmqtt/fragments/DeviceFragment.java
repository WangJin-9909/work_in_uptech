package com.uptech.smarthomeimplmqtt.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.uptech.smarthomeimplmqtt.R;
import com.uptech.smarthomeimplmqtt.SHT11Activity;
import com.uptech.smarthomeimplmqtt.adapter.DeviceAllListAdapter;
import com.uptech.smarthomeimplmqtt.adapter.OnListViewButtonClickListener;
import com.uptech.smarthomeimplmqtt.adapter.bean.DeviceBean;
import com.uptech.smarthomeimplmqtt.base.MyApplication;
import com.uptech.smarthomeimplmqtt.utils.Const;
import com.uptech.smarthomeimplmqtt.utils.Utils;

import java.util.List;


public class DeviceFragment extends Fragment {
    private final String TAG = "DeviceFragment";
    private ListView listView;
    private List<DeviceBean> mDatas;
    private DeviceAllListAdapter mAdapter;
    private MyBroadcastReceiver receiver;
    private MyApplication myApplication;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myApplication = (MyApplication) getActivity().getApplicationContext();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_monitor, null);
        listView = view.findViewById(R.id.device_all_list);
        initData();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        receiver = new MyBroadcastReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction(Const.SensorInfoAction);
        getActivity().registerReceiver(receiver,filter);
    }

    @Override
    public void onPause() {
        super.onPause();
        getActivity().unregisterReceiver(receiver);
    }

    //方法；初始化Data
    private void initData() {
        mDatas = myApplication.getDeviceBeanList();
        //为数据绑定适配器
        mAdapter = new DeviceAllListAdapter(getActivity(), mDatas, new OnListViewButtonClickListener() {
            @Override
            public void onClick(ViewGroup parent, List<DeviceBean> mDatas, int position,View view) {
                DeviceBean deviceBean = mDatas.get(position);
                if(deviceBean.getDeviceID() == 2048)
                {
                    Intent intent = new Intent();
                    intent.putExtra("sensorid",deviceBean.getDeviceID());
                    intent.setClass(getActivity(), SHT11Activity.class);
                    startActivity(intent);
                }
            }
        });
        listView.setAdapter(mAdapter);
    }

    /**
   * **********************************************
   * @fileName:    DeviceFragment.java
   * **********************************************
   * @descriprion received mesage from  service
   * @author       up-tech@jianghj
   * @email:       huijun2014@sina.cn
   * @time         2018/9/30 11:51
   * @version     1.0
   *
   *************************************************/
    private class MyBroadcastReceiver extends BroadcastReceiver
    {
        private String  getMesg(int sensorId,Intent intent)
        {
            int gid = (sensorId & 0x00FF00) >>8;
            String mesg = "";
            int status = intent.getIntExtra("status",-1);
            switch (gid)
            {
                case 0x00DD://wifi hub
                case 0x00D8://门禁阴极锁
                    if(status == 1){
                        mesg = "已开启";
                    }
                    else if(status == 0){
                        mesg = "已关闭";
                    }
                    break;
                case 0x00DC: //遥控器
                    mesg = "";
                    break;
                case 0x00DB://电动窗帘
                    if(status == 18)
                        mesg = "已关闭";
                    else if(status == 33)
                        mesg = "已开启";
                    else if(status == 17)
                        mesg = "已停止";
                    break;
                case 0x00D9://报警灯
                case 0x00DA://照明灯
//                    Log.e(TAG, "getMesg: " + status);
                    if(status == 1){
                        mesg = "已关闭";
                    }
                    else if(status == 2){
                        mesg = "已开启";
                    }
                    break;
                case 0x0008:// sht 11
                    double current_temp = intent.getDoubleExtra("temprature",0.0);
                    double current_humi = intent.getDoubleExtra("humidity",0.0);
                    mesg = current_temp + "℃    " + current_humi +"%" ;
                    break;
                case 0x00C9:
                case 0x00C8:
                case 0x00C7:
                case 0x00C6:
                case 0x00C5:
                case 0x00C4:
                case 0x00C3:
                case 0x00C2:
                case 0x00C1:
                case 0x00C0:
                    if(status == 1)
                    {
                        mesg = "异常";
                    }
                    else if(status == 0){
                        mesg = "正常";
                    }
                    break;
                default:
                    mesg = "status:" + status;
            }
            return  mesg;
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            final String[] dev_all_name = myApplication.getStringArray(R.array.dev_all_name);
            final String[] dev_all_desc = myApplication.getStringArray(R.array.dev_all_desc);

            int status = intent.getIntExtra("status",0);
            int sensorId = intent.getIntExtra("sensorID",0);
            int gid = sensorId & 0x00FF00;
            int index = Utils.getArrayIndex(gid,myApplication.getIntArray(R.array.dev_all_id));

//            Log.e(TAG, intent.getAction() + ": " + status + ":" + sensorId);

            for(int i = 0 ; i < mDatas.size() ; i ++)
            {
                if(mDatas.get(i).getDeviceID() == sensorId)
                {
                    if(sensorId >= 2048 && sensorId <= 2303) //sht11
                    {
                        mDatas.get(i).setMesg(getMesg(sensorId,intent));
                        mDatas.get(i).setTime(Utils.getCurrentTime());
                        mDatas.get(i).setMesg_textColor(Color.BLACK);
                        mDatas.get(i).setItem_BgColor(Color.GREEN);
                        mAdapter.notifyDataSetChanged();
                        return;
                    }

                    if(status == 1)
                    {
                        mDatas.get(i).setMesg_textColor(Color.RED);
                    }else{
                        mDatas.get(i).setMesg_textColor(Color.BLACK);
                    }
                    mDatas.get(i).setMesg(getMesg(sensorId,intent));
                    mDatas.get(i).setTime(Utils.getCurrentTime());
                    mDatas.get(i).setItem_BgColor(Color.GREEN);
                    mAdapter.notifyDataSetChanged();
                    return;
                }
            }
            //can't find , add it
            DeviceBean bean = new DeviceBean(dev_all_name[index], dev_all_desc[index], Utils.getCurrentTime(), getMesg(sensorId,intent),sensorId);
            mDatas.add(bean);
            mAdapter.notifyDataSetChanged();
        }
    }
}