package com.uptech.smarthomeimplmqtt.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.uptech.smarthomeimplmqtt.R;

public class AboutFragment extends Fragment {
    private TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_about, null);
        textView = view.findViewById(R.id.textView);
        textView.setText("     智能家居APP是基于百度天工平台做的一款简单的实例客户端。\r\n\r\n     版权所有，仅限学习交流。");
        return view;
    }
}
