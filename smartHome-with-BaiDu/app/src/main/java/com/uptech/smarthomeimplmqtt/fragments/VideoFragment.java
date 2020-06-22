package com.uptech.smarthomeimplmqtt.fragments;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.uptech.smarthomeimplmqtt.R;
import com.uptech.smarthomeimplmqtt.base.MyApplication;
import com.uptech.smarthomeimplmqtt.http.DigestHttpHandler;
import com.uptech.smarthomeimplmqtt.utils.PermisionUtils;
import com.uptech.smarthomeimplmqtt.utils.Utils;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.util.EntityUtils;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.net.SocketTimeoutException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class VideoFragment extends Fragment implements View.OnClickListener{
    private DigestHttpHandler digestHttpHandler;
    private HttpGetTask httpGetTask;
    private MyApplication app;
    private TextureView videoView;
    private Spinner spinner;
    private Rect rect;
    private Button btn_set,btn_capture;
    private Boolean reported,savePic;

    private final String TAG = this.getClass().getName();
    private final int GET_VIDEO = 0;
    private final int SHOW_BTN = 1;
    private final int PRESS_DOWN = 2;
    private final int PRESS_UP = 3;
    private final int CONNECT_ERROR = 4;

    private Handler handler = new Handler(Looper.myLooper()){
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what)
            {
                case GET_VIDEO:
                    if(httpGetTask == null)
                    {
                        httpGetTask = new HttpGetTask();
                        httpGetTask.execute("");
                    }
                    break;
                case SHOW_BTN:
                    btn_set.setVisibility(View.INVISIBLE);
                    btn_capture.setVisibility(View.INVISIBLE);
                    spinner.setVisibility(View.INVISIBLE);
                    break;
                case PRESS_DOWN:
                    if(httpGetTask != null && httpGetTask.connected && !reported)
                    {
                        int viewWidth = videoView.getWidth()/3;
                        int viewHeight = videoView.getHeight()/3;
                        int clickX = msg.arg1;
                        int clickY = msg.arg2;
                        if(clickX <= viewWidth)
                        {
                            if(clickY <= viewHeight)
                                executeCommand(digestHttpHandler.ptz_control(93));
                            else if(clickY <= 2*viewHeight)
                                executeCommand(digestHttpHandler.ptz_control(6));
                            else
                                executeCommand(digestHttpHandler.ptz_control(91));
                        }
                        else if(clickX <= 2*viewWidth)
                        {
                            if(clickY <= viewHeight)
                                executeCommand(digestHttpHandler.ptz_control(2));
                            else if(clickY <= 2*viewHeight)
                                executeCommand(digestHttpHandler.ptz_control(25));
                            else
                                executeCommand(digestHttpHandler.ptz_control(0));

                        } else{
                            if(clickY <= viewHeight)
                                executeCommand(digestHttpHandler.ptz_control(92));
                            else if(clickY <= 2*viewHeight)
                                executeCommand(digestHttpHandler.ptz_control(4));
                            else
                                executeCommand(digestHttpHandler.ptz_control(90));
                        }
                        reported = true;
                    }
                    break;
                case PRESS_UP:
                    executeCommand(digestHttpHandler.ptz_control(1));
                    reported = false;
                    break;
                case  CONNECT_ERROR:
//                    int width, int height, String mString,int size, int color
                    Utils.getImage(videoView.getWidth(),videoView.getHeight(),"请点击设置按钮配置摄像头信息",20,Color.RED);
                    Canvas canvas = videoView.lockCanvas();
                    if (canvas != null) {
                        canvas.drawBitmap(Utils.getImage(videoView.getWidth(), videoView.getHeight(), "请点击设置按钮配置摄像头信息",
                                30, Color.RED), null, new Rect(0, 0, videoView.getWidth(), videoView.getHeight()), null);
                        videoView.unlockCanvasAndPost(canvas);
                    }
                    break;
            }
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        app = (MyApplication) getActivity().getApplicationContext();
        digestHttpHandler = new DigestHttpHandler(app);
        reported = false;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video, null);
        videoView = view.findViewById(R.id.videoview);
        btn_capture = view.findViewById(R.id.btn_capture);
        btn_set = view.findViewById(R.id.btn_setting);
        spinner = view.findViewById(R.id.spinner);

        List<String> list = new ArrayList<String>();
        list.add("160*120");
        list.add("240*320");
        list.add("640*480");
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.select_dialog_singlechoice);
        spinner.setAdapter(adapter);
        spinner.setSelection(2,true);
        spinner.setOnItemSelectedListener(new Spinner.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
                int value = 0;
                if(arg2==0)
                    value = 2;
                if(arg2==1)
                    value = 1;
                if(arg2==2)
                    value = 0;
                executeCommand(digestHttpHandler.camera_control("0", value));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        btn_set.setOnClickListener(this);
        btn_capture.setOnClickListener(this);
        videoView.setOnClickListener(this);
        videoView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                switch (event.getAction()){
                    case MotionEvent.ACTION_DOWN:

                        break;
                    case MotionEvent.ACTION_UP:
                        handler.sendMessage(handler.obtainMessage(PRESS_UP,(int)event.getX(),(int)event.getY()));
                        break;
                    case MotionEvent.ACTION_MOVE:
                        long pressTime = Math.abs(event.getDownTime() - event.getEventTime());
                        if(pressTime > 300L)
                        {
                            handler.sendMessage(handler.obtainMessage(PRESS_DOWN,(int)event.getX(),(int)event.getY()));
                        }
                        break;
                }
                return false;
            }
        });
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        handler.sendEmptyMessageAtTime(GET_VIDEO,500);
    }

    @Override
    public void onPause() {
        handler.removeMessages(GET_VIDEO);
        if(httpGetTask.getStatus() == AsyncTask.Status.RUNNING) {
            httpGetTask.cancel(true);
            httpGetTask = null;
            rect = null;
        }
        super.onPause();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn_setting:
                LayoutInflater inflater = (LayoutInflater) app.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view_camera = inflater.inflate(R.layout.camera_info,null);
                final EditText usernameText = view_camera.findViewById(R.id.username);
                final EditText passwordText = view_camera.findViewById(R.id.password);
                final EditText IPAddrText = view_camera.findViewById(R.id.ipaddress);
                final EditText PortText = view_camera.findViewById(R.id.port_camera);
                usernameText.setText(app.getCamera_UserName());
                passwordText.setText(app.getCamera_Paswd());
                IPAddrText.setText(app.getCamera_IpStr());
                PortText.setText(app.getCamera_Port() + "");
                new AlertDialog.Builder(getActivity())
                        .setTitle("监控设置")
                        .setIcon(R.mipmap.ic_launcher)
                        .setMessage("请输入IP，端口，用户名，密码信息")
                        .setView(view_camera)
                        .setPositiveButton(R.string.btn_ok,new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int which) {
                                String username = usernameText.getText().toString().trim();
                                if(!TextUtils.isEmpty(username))
                                    app.setCamera_UserName(username);
                                else {
                                    app.showToast("用户名不能为空，请重新输入");
                                    return;
                                }
                                String pwd = passwordText.getText().toString().trim();
                                if(!TextUtils.isEmpty(pwd)&&pwd.length() >= 6 && pwd.length() <= 20)
                                    app.setCamera_Paswd(pwd);
                                else {
                                    app.showToast("请输入密码，密码长度为6到20位");
                                    return;
                                }
                                String ipaddr = IPAddrText.getText().toString().trim();
                                if(!TextUtils.isEmpty(ipaddr)&& Utils.checkIp(ipaddr))
                                    app.setCamera_IpStr(ipaddr);
                                else {
                                    app.showToast("您输入的IP不合法，请重新输入");
                                    return;
                                }
                                String portStr = PortText.getText().toString().trim();
                                if(!TextUtils.isEmpty(portStr)&&TextUtils.isDigitsOnly(portStr))
                                {
                                    int port = Integer.parseInt(portStr);
                                    app.setCamera_Port(port);
                                }
                                else {
                                    app.showToast("您输入的端口号不合法，请重新输入");
                                    return;
                                }
                                app.showToast("信息保存成功");
                            }
                        })
                        .setNegativeButton(R.string.btn_cancel, null)
                        .create().show();
                break;
            case R.id.videoview:
                if(handler.hasMessages(SHOW_BTN))
                    handler.removeMessages(SHOW_BTN);
                btn_set.setVisibility(View.VISIBLE);
                btn_capture.setVisibility(View.VISIBLE);
                spinner.setVisibility(View.VISIBLE);
                if(!handler.hasMessages(SHOW_BTN))
                    handler.sendEmptyMessageDelayed(SHOW_BTN,3000);
                break;
            case R.id.btn_capture:
                if(handler.hasMessages(SHOW_BTN))
                    handler.removeMessages(SHOW_BTN);
                savePic = true;
                if(!handler.hasMessages(SHOW_BTN))
                    handler.sendEmptyMessageDelayed(SHOW_BTN,3000);
                break;
        }
    }

    private void executeCommand(final String url)
    {
        new Thread(new Runnable() {
            @Override
            public void run() {
                int status = 0;
                try {
                    digestHttpHandler.setURI(url);
                } catch (URISyntaxException e1) {
                    e1.printStackTrace();
                }
                try {
                    status = digestHttpHandler.execResponse();
                    if(status == 200)
                    {
                        Log.i(TAG, EntityUtils.toString(digestHttpHandler.getHttpResponse().getEntity()));
                    }
                    else
                    {
                        Log.i(TAG,"StatusCode: " + status);
                    }
                }catch(SocketTimeoutException e){
                    app.showToast("Tips:  " + e.getMessage());
                } catch (ClientProtocolException e) {
                    app.showToast("Tips:  " + e.getMessage());
                    e.printStackTrace();
                } catch (IOException e) {
                    app.showToast("Tips:  " + e.getMessage());
                    e.printStackTrace();
                }
            }
        }).start();
    }
    /**
     * **********************************************
     * @fileName:    VideoFragment.java
     * **********************************************
     * @descriprion 通过异步任务获取视频数据
     * @author       up-tech@jianghj
     * @email:       huijun2014@sina.cn
     * @time         2018/9/19 0019 16:49
     * @version     1.0
     *
     *************************************************/
    private class HttpGetTask extends AsyncTask<String, Integer, String> {
        private Boolean connected;
        private int oldWidth = 0;
        private BlockingQueue<SoftReference<Bitmap>> imgCache;
        public HttpGetTask()
        {
            savePic = false;
            imgCache = new ArrayBlockingQueue<>(6);
        }
        @Override
        protected String doInBackground(String... params) {
            ByteArrayOutputStream outStream = new ByteArrayOutputStream();
            InputStream input = null;
            int readLength = -1;
            String strData;
            int dataSize = 1024 * 1024;
            byte[] buffer = new byte[128];
            byte[] buffer1 = new byte[dataSize];
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inPreferredConfig = Bitmap.Config.RGB_565;
            options.inJustDecodeBounds = false;
            try {
                while (!isCancelled()) {
                    try {
                        if (!connected) {
                            URL url = new URL("http://" + app.getCamera_IpStr() + ":" + app.getCamera_Port() +
                                    "/videostream.cgi?user=" + app.getCamera_UserName() + "&pwd=" + app.getCamera_Paswd() + "&rate=8");
                            URLConnection conn = url.openConnection();
                            conn.connect();
                            input = conn.getInputStream();
                            connected = true;
                        }
                        readLength = input.read(buffer, 0, 128);
                        if (readLength > 0) {
                            strData = new String(buffer, 0, readLength);
                            int index = strData.indexOf("Content-Length:");
                            int index1 = strData.indexOf("\r\n", index);
                            int streamLength = 0;
                            if (index1 != -1 && strData.length() > 16) {
                                try {
                                    streamLength = Integer.parseInt(strData.substring(index+ "Content-Length:".length(),index1));
                                } catch (Exception e) {
//										Log.e(TAG, e.getMessage());
                                    continue;
                                }
                            } else {
                                continue;
                            }
                            if (streamLength > 0) {
                                if ((index1 + 4) < readLength) {
                                    outStream.write(buffer, index1 + 4, readLength - index1 - 4);
                                    streamLength = streamLength - readLength + index1 + 4;
                                }
                                if (dataSize < streamLength) {
                                    dataSize = streamLength;
                                    buffer1 = new byte[streamLength];
                                }
                                int length = 0;
                                while (length < streamLength) {
                                    length += input.read(buffer1, length, streamLength - length);
                                }
                                outStream.write(buffer1, 0, streamLength);
                                outStream.write((byte) 0xFF);
                                outStream.write((byte) 0xD9);
                                byte[] data = outStream.toByteArray();
                                imgCache.put(new SoftReference<Bitmap>(BitmapFactory.decodeByteArray(data, 0,data.length,options)));
                                publishProgress(2);
                                outStream.reset();
                            }
                        }
                    } catch (Exception e) {
                        Thread.sleep(3000);
                        connected = false;
                        handler.sendEmptyMessage(CONNECT_ERROR);
                        e.printStackTrace();
                    }
                }
                input.close();
                outStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            if(isCancelled()){
                return;
            }
            try {
                Bitmap bitmap = imgCache.take().get();
                if(bitmap == null) return;

                if(rect == null || bitmap.getWidth() != oldWidth) {
                    int viewWidth = videoView.getWidth();
                    int viewHeight = videoView.getHeight();
                    int imgWidth = bitmap.getWidth();
                    int imgHeight = bitmap.getHeight();
                    int left = imgWidth > viewWidth ? 0:(viewWidth - imgWidth)/2;
                    int top = imgHeight > viewHeight ? 0:(viewHeight - imgHeight)/2;
                    int right = left + (imgWidth > viewWidth ? viewWidth:imgWidth);
                    int bottom = top + (imgHeight > viewHeight ? viewHeight:imgHeight);
                    rect = new Rect(left,top,right,bottom);
                }
                Canvas canvas = videoView.lockCanvas();
                if (canvas != null)
                {
                    oldWidth = bitmap.getWidth();
                    canvas.drawColor(Color.BLACK, PorterDuff.Mode.CLEAR);
                    canvas.drawBitmap(bitmap, null, rect, null);
                    videoView.unlockCanvasAndPost(canvas);
                    if(savePic)
                    {
                        PermisionUtils.verifyStoragePermissions(app.getActivity());
                        String imagePath = "SmartHome/Capture/images/";
                        Utils.saveBitmapToSDCard(bitmap,imagePath);
                        savePic = false;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
