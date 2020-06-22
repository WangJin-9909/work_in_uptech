package com.uptech.smarthomeimplmqtt;

import android.database.ContentObserver;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.widget.Button;

import com.uptech.smarthomeimplmqtt.base.UptechBaseActivity;
import com.uptech.smarthomeimplmqtt.database.DBOperation;
import com.uptech.smarthomeimplmqtt.database.MyContentProvider;
import com.uptech.smarthomeimplmqtt.sensorInfo.SensorInfo;
import com.uptech.smarthomeimplmqtt.utils.Const;
import com.uptech.smarthomeimplmqtt.utils.Utils;

import org.jetbrains.annotations.NotNull;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import lecho.lib.hellocharts.gesture.ZoomType;
import lecho.lib.hellocharts.model.Axis;
import lecho.lib.hellocharts.model.AxisValue;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.model.ValueShape;
import lecho.lib.hellocharts.model.Viewport;
import lecho.lib.hellocharts.view.LineChartView;

public class SHT11Activity extends UptechBaseActivity implements View.OnClickListener{
    private Button btn_temp, btn_humi;
    private int SensorId;

    private DecimalFormat decimalFormat;
    private List<PointValue> tempPointValues;
    private List<PointValue> humiPointValues;
    private List<AxisValue> mAxisXValues;
    private LineChartView lineChart;
    private MyContentObserver observer;
    private List<SensorInfo> sensorInfos;

    private final int ViewTemp = 1;
    private final int ViewHumi = 2;
    private int current_state;

    private Handler handler = new Handler(Looper.myLooper()){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what)
            {
                case ViewHumi:
                    mAxisXValues.clear();
                    humiPointValues.clear();
                    for (int i = 0; i < sensorInfos.size(); i++) {
                        SensorInfo sensorInfo = sensorInfos.get(i);
                        if (sensorInfo != null) {
                            String time = Utils.transferMillToDate("HH:mm:ss", Long.valueOf(sensorInfo.get_id()));
                            mAxisXValues.add(new AxisValue(i).setLabel(time));
                            float huimidity = Float.parseFloat(sensorInfo.getData_one());
                            String text = decimalFormat.format(huimidity);
                            humiPointValues.add(new PointValue(i, huimidity).setLabel(text+"%"));
                        }
                    }
                    initLineChart();
                    break;
                case ViewTemp:
                    mAxisXValues.clear();
                    tempPointValues.clear();
                    for (int i = 0; i < sensorInfos.size(); i++) {
                        SensorInfo sensorInfo = sensorInfos.get(i);
                        if (sensorInfo != null) {
                            String time = Utils.transferMillToDate("HH:mm:ss", Long.valueOf(sensorInfo.get_id()));
                            mAxisXValues.add(new AxisValue(i).setLabel(time));
                            float temperature = Float.parseFloat(sensorInfo.getData_two());
                            String text = decimalFormat.format(temperature);
                            tempPointValues.add(new PointValue(i, temperature).setLabel(text + "℃"));
                        }
                    }
                    initLineChart();
                    break;
            }
        }
    };

    @Override
    protected void onCreate(@NotNull Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_humi);
        decimalFormat =new DecimalFormat("0.00");
        observer = new MyContentObserver(handler);
        tempPointValues = new ArrayList<>();
        humiPointValues = new ArrayList<>();
        mAxisXValues = new ArrayList<>();
        current_state = ViewTemp;
        SensorId = getIntent().getIntExtra("sensorid",0);
        initView();
    }
    @Override
    protected void onPause() {
        super.onPause();
        getContentResolver().unregisterContentObserver(observer);
    }

    @Override
    protected void onResume() {
        super.onResume();
        getContentResolver().registerContentObserver(MyContentProvider.getUri(String.valueOf(SensorId)), false, observer);
    }
    public class MyContentObserver extends ContentObserver {

        private Handler handler;

        public MyContentObserver(Handler handler) {
            super(handler);
            this.handler = handler;
        }

        @Override
        public void onChange(boolean selfChange) {
            super.onChange(selfChange);
            sensorInfos.clear();
            sensorInfos = DBOperation.getInstance(SHT11Activity.this).queryData(Const.SENSORID_TEXT, String.valueOf(SensorId),50);
            handler.sendEmptyMessage(current_state);
        }
    }
    @Override
    public void initView() {
        btn_humi = findViewById(R.id.btn_viewHumi);
        btn_temp =  findViewById(R.id.btn_viewTemp);
        lineChart = findViewById(R.id.temp_humidity);

        btn_temp.setOnClickListener(this);
        btn_humi.setOnClickListener(this);
        sensorInfos = DBOperation.getInstance(SHT11Activity.this).queryData(Const.SENSORID_TEXT, String.valueOf(SensorId),50);
        handler.sendEmptyMessage(1);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_viewHumi:
                handler.sendEmptyMessage(ViewHumi);
                current_state = ViewHumi;
                break;
            case R.id.btn_viewTemp:
                handler.sendEmptyMessage(ViewTemp);
                current_state = ViewTemp;
                break;
        }
    }

    private void initLineChart() {
        List<Line> lines = new ArrayList<>();
        Line line;
        if(current_state == ViewTemp)
            line = new Line(tempPointValues).setColor(Color.parseColor("#FFCD41"));  //折线的颜色
        else
            line = new Line(humiPointValues).setColor(Color.parseColor("#00FFFF"));  //折线的颜色

        line.setShape(ValueShape.CIRCLE);//折线图上每个数据点的形状  这里是圆形 （有三种 ：ValueShape.SQUARE  ValueShape.CIRCLE  ValueShape.SQUARE）
        line.setCubic(true);//曲线是否平滑
        line.setFilled(true);//是否填充曲线的面积
        line.setHasLabels(true);//曲线的数据坐标是否加上备注
        line.setHasLines(true);//是否用直线显示。如果为false 则没有曲线只有点显示
        line.setHasPoints(true);//是否显示圆点 如果为false 则没有原点只有点显示
        lines.add(line);
        LineChartData data = new LineChartData();
        data.setLines(lines);

        //坐标轴
        Axis axisX = new Axis(); //X轴
        axisX.setHasTiltedLabels(true);  //X轴下面坐标轴字体是斜的显示还是直的，true是斜的显示
//	    axisX.setTextColor(Color.WHITE);  //设置字体颜色
        axisX.setTextColor(Color.parseColor("#000000"));//黑色

        axisX.setName("");  //表格名称
        axisX.setTextSize(11);//设置字体大小
        axisX.setMaxLabelChars(7); //最多几个X轴坐标，意思就是你的缩放让X轴上数据的个数7<=x<=mAxisValues.length
        axisX.setValues(mAxisXValues);  //填充X轴的坐标名称
        data.setAxisXBottom(axisX); //x 轴在底部
//	    data.setAxisXTop(axisX);  //x 轴在顶部
        axisX.setHasLines(true); //x 轴分割线


        Axis axisY = new Axis();  //Y轴
        if(current_state == ViewTemp)
            axisY.setName("温度（℃）");//y轴标注
        else
            axisY.setName("湿度（%）");//y轴标注
        axisY.setTextSize(11);//
        axisY.setTextColor(Color.parseColor("#000000"));//黑色
        data.setAxisYLeft(axisY);  //Y轴设置在左边
        //data.setAxisYRight(axisY);  //y轴设置在右边
        //设置行为属性，支持缩放、滑动以及平移
        lineChart.setInteractive(true);
        lineChart.setZoomType(ZoomType.HORIZONTAL);  //缩放类型，水平
        lineChart.setMaxZoom(5f);//缩放比例
        lineChart.setLineChartData(data);
        lineChart.setVisibility(View.VISIBLE);
        Viewport v = new Viewport(lineChart.getMaximumViewport());
        v.right = 30;
        lineChart.setCurrentViewport(v);
    }
}
