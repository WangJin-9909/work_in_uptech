package com.uptech.smarthomeimplmqtt.adapter;

import android.view.View;
import android.view.ViewGroup;

import com.uptech.smarthomeimplmqtt.adapter.bean.DeviceBean;

import java.util.List;

public interface OnListViewButtonClickListener {
    void onClick(ViewGroup parent, List<DeviceBean> mDatas, int position,View view);
}
