package com.uptech.smarthomeimplmqtt;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.uptech.smarthomeimplmqtt.adapter.MyPagerAdpter;
import com.uptech.smarthomeimplmqtt.base.MyApplication;
import com.uptech.smarthomeimplmqtt.base.UptechBaseActivity;
import com.uptech.smarthomeimplmqtt.fragments.AboutFragment;
import com.uptech.smarthomeimplmqtt.fragments.DeviceFragment;
import com.uptech.smarthomeimplmqtt.fragments.HomeFragment;
import com.uptech.smarthomeimplmqtt.fragments.VideoFragment;
import com.uptech.smarthomeimplmqtt.mqtt.MQTTManagerThread;
import com.uptech.smarthomeimplmqtt.service.LocalService;
import com.uptech.smarthomeimplmqtt.utils.Const;
import com.uptech.smarthomeimplmqtt.utils.Utils;
import com.uptech.smarthomeimplmqtt.view.BottomNavigationViewHelper;

public class MainActivity extends UptechBaseActivity {
    /***************************物管理******************************/
    final String mbroker = "tcp://d3294c7d4cd34f2bb6ff29fc9f7f6d2e.mqtt.iot.gz.baidubce.com:1883";
    final String musername = "d3294c7d4cd34f2bb6ff29fc9f7f6d2e/smartHome";
    final String mpassword = "TGKPh375sbnUDghi048o8pTOu9fW4t7URPiBN7A9eOQ=";
    private long exitTime = 0;
    private BottomNavigationView bottomNavigationView;
    private ViewPager viewPager;
    private MyApplication myApplication;
    private MyPagerAdpter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myApplication = (MyApplication) getApplication();
        initView();
        setListener();
        initParams();
    }

    @Override
    public void initView() {
        bottomNavigationView = findViewById(R.id.bottomNV);
        viewPager = findViewById(R.id.viewpager);
        BottomNavigationViewHelper.disableShiftMode(bottomNavigationView);
        setupViewPager(viewPager);
    }

    @Override
    public void initParams() {
        Intent intent = new Intent(this, LocalService.class);
        intent.putExtra("mbroker", mbroker);
        intent.putExtra("musername", musername);
        intent.putExtra("mpassword", mpassword);
        startService(intent);
    }

    @Override
    public void setListener() {
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_tab1:
                        viewPager.setCurrentItem(0);
                        return true;

                    case R.id.item_tab2:
                        viewPager.setCurrentItem(1);
                        return true;

                    case R.id.item_tab3:
                        viewPager.setCurrentItem(2);
                        return true;

                    case R.id.item_tab4:
                        viewPager.setCurrentItem(3);
                        return true;
                }
                return false;
            }
        });
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int position) {
                bottomNavigationView.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int i) {
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    private void setupViewPager(ViewPager viewPager) {
        adapter = new MyPagerAdpter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new DeviceFragment());
        adapter.addFragment(new VideoFragment());
        adapter.addFragment(new AboutFragment());
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onBackPressed() {
        if (System.currentTimeMillis() - exitTime > 2000) {
            Toast.makeText(getApplicationContext(), "再按一次退出程序", Toast.LENGTH_SHORT).show();
            exitTime = System.currentTimeMillis();
        } else {
            stopService( new Intent(this, LocalService.class));
            HomeFragment hf = (HomeFragment) adapter.getItem(0);
            if(hf != null)
                hf.saveDatas();
            if(myApplication.getDeviceBeanList().size() > 0)
            {
                Utils.writeObject2File(this, Const.FILE_All_NAME,myApplication.getDeviceBeanList());
            }
            android.os.Process.killProcess(android.os.Process.myPid());
        }
    }
}
