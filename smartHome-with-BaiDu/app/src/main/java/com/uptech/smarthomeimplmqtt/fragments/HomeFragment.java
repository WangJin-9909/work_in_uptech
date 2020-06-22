package com.uptech.smarthomeimplmqtt.fragments;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.uptech.smarthomeimplmqtt.R;
import com.uptech.smarthomeimplmqtt.TeleActivity;
import com.uptech.smarthomeimplmqtt.adapter.DeviceListAdapter;
import com.uptech.smarthomeimplmqtt.adapter.OnListViewButtonClickListener;
import com.uptech.smarthomeimplmqtt.adapter.bean.DeviceBean;
import com.uptech.smarthomeimplmqtt.base.MyApplication;
import com.uptech.smarthomeimplmqtt.mqtt.MQTTManagerThread;
import com.uptech.smarthomeimplmqtt.mqtt.SensorBean;
import com.uptech.smarthomeimplmqtt.utils.Const;
import com.uptech.smarthomeimplmqtt.utils.Utils;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private final String TAG = "HomeFragment";
    private ListView listView;
    private List<DeviceBean> mDatas;
    private DeviceListAdapter mAdapter;
    private MyApplication myApplication;
    private MyBroadcastReceiver receiver;
    private Handler handler = new Handler(Looper.myLooper())
    {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what)
            {
                case 1:
                    SensorBean sb = (SensorBean) msg.obj;
                    int sensorID = msg.arg1;
                    if(sb != null) {
                        MQTTManagerThread.getInstance().sendMessage(String.valueOf(sensorID), sb.toString());
                        mAdapter.notifyDataSetChanged();
                    }
                    break;
            }
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, null);
        receiver = new MyBroadcastReceiver();
        listView = view.findViewById(R.id.device_list);
        myApplication = (MyApplication)getActivity().getApplicationContext();
        initData();
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Const.SensorInfoAction);
        getActivity().registerReceiver(receiver,intentFilter);
    }

    @Override
    public void onPause() {
        getActivity().unregisterReceiver(receiver);
        super.onPause();
    }

    //方法；初始化Data
    private void initData() {
        final String[] dev_ctl_name = myApplication.getStringArray(R.array.dev_ctl_name);
        final String[] dev_ctl_desc = myApplication.getStringArray(R.array.dev_ctl_desc);
        final int[] dev_ctl_name_id = myApplication.getIntArray(R.array.dev_ctl_name_id);
        mDatas = ( List<DeviceBean> ) Utils.readObjectFromFile(getActivity(), Const.FILE_CTRL_NAME);
        if(mDatas == null) {
            mDatas = new ArrayList<>();
            for (int i = 0; i < dev_ctl_name.length; i++) {
                DeviceBean bean = new DeviceBean(dev_ctl_desc[i], dev_ctl_name[i], " ", " ", dev_ctl_name_id[i]);
                mDatas.add(bean);
            }
            Utils.writeObject2File(getActivity(),Const.FILE_CTRL_NAME,mDatas);
        }
         //为数据绑定适配器
        mAdapter = new DeviceListAdapter(getActivity(), mDatas, new OnListViewButtonClickListener() {
            @Override
            public void onClick(ViewGroup parent, List<DeviceBean> mDatas, int position,View view) {
                SensorBean sb;
                sb = new SensorBean();
                DeviceBean deviceBean = mDatas.get(position);
                String mesg = deviceBean.getMesg();

                int gid = (deviceBean.getDeviceID() & 0x00FF00) >>8;
                switch (gid)
                {
                    case 0x00DA://照明灯
                    case 0x00DD://wifi hub
                        if(mesg != "开启")
                        {
                            sb.getDesired().setStatus(1);
                            deviceBean.setMesg("开启");
                        }
                        else if(mesg == "开启"){
                            sb.getDesired().setStatus(0);
                            deviceBean.setMesg("关闭");
                        }
                        break;
                    case 0x00DC: //遥控器
                        Intent intent = new Intent();
                        intent.putExtra("deviceID",deviceBean.getDeviceID());
                        intent.setClass(getActivity(), TeleActivity.class);
                        startActivity(intent);
                        return;
                    case 0x00DB://电动窗帘
                        if(mesg != "开启")
                        {
                            sb.getDesired().setStatus(33);
                            deviceBean.setMesg("开启");
                        }
                        else if(mesg == "开启"){
                            sb.getDesired().setStatus(18);
                            deviceBean.setMesg("关闭");
                        }
                        break;
                    case 0x00D9://报警灯
                    case 0x00D8://门禁阴极锁
                        if(mesg != "开启")
                        {
                            sb.getDesired().setStatus(1);
                            deviceBean.setMesg("开启");
                        }
                        else if(mesg == "开启"){
                            sb.getDesired().setStatus(2);
                            deviceBean.setMesg("关闭");
                        }
                        break;
                    default:
                }
                sb.setRequestId(MQTTManagerThread.getInstance().generateRequestId());
                deviceBean.setTime(Utils.getCurrentTime());
                Message message = handler.obtainMessage();
                message.what = 1;
                message.obj = sb;
                message.arg1 = deviceBean.getDeviceID();
                handler.sendMessage(message);
            }
        });
        listView.setAdapter(mAdapter);
    }

    public void saveDatas() {
        Utils.writeObject2File(getActivity(),Const.FILE_CTRL_NAME,mDatas);
    }

    private class MyBroadcastReceiver extends BroadcastReceiver
    {
        private String  getMesg(int sensorId,Intent intent)
        {
            String mesg = "";
            int status = intent.getIntExtra("status",-1);
//            Log.e(TAG, "getMesg: " + status );
            int gid = (sensorId & 0x00FF00) >>8;
            switch (gid)
            {
                case 0x00DA://照明灯
                case 0x00DD://wifi hub
                    if(status == 1)
                        mesg = "开启";
                    else
                        mesg = "关闭";
                    break;
                case 0x00DC: //遥控器
                        mesg = "";
                    break;
                case 0x00DB://电动窗帘
                    if(status == 18)
                        mesg = "关闭";
                    else if(status == 33)
                        mesg = "开启";
                    else
                        mesg = "停止";
                    break;
                case 0x00D9://报警灯
                    if(status == 2){
                        mesg = "关闭";
                    }
                    else {
                        mesg = "开启";
                    }
                    break;
                case 0x00D8://门禁阴极锁
                    if(status == 1){
                        mesg = "开启";
                    }
                    else{
                        mesg = "关闭";
                    }
                    break;
                default:
                        mesg = "status:" + status;
            }
            return  mesg;
        }

        @Override
        public void onReceive(Context context, Intent intent) {
            int sensorId = intent.getIntExtra("sensorID",0);
            int index = Utils.getArrayIndex(sensorId,myApplication.getIntArray(R.array.dev_ctl_name_id));
            if(index == -1 ) return;
            for(int i = 0 ; i < mDatas.size() ; i ++)
            {
                if(mDatas.get(i).getDeviceID() == sensorId)
                {
                    mDatas.get(i).setMesg_textColor(Color.BLACK);
                    mDatas.get(i).setMesg(getMesg(sensorId,intent));
                    mDatas.get(i).setTime(Utils.getCurrentTime());
                    mDatas.get(i).setItem_BgColor(Color.GREEN);
                    mAdapter.notifyDataSetChanged();
                    return;
                }
            }
        }
    }
}
