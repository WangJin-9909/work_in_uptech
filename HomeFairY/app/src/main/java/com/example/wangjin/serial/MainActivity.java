package com.example.wangjin.serial;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.io.IOException;
import java.io.OutputStream;

public class MainActivity extends AppCompatActivity {
    private SerialPort serialPort;
    private OutputStream outputStream;
    private static final int TIME_FLAG_1 = 0;
    private static final int TIME_FLAG_2 = 1;
    private static final int TIME_FLAG_3 = 2;
    /**
     * 0：帧头 1：帧头 2：方向  3：暂无【后期可选速度】 4：转弯时长  5：  6：帧尾
     */
    private byte[] buffer = new byte[]{(byte) 0xFE, (byte) 0xAA, 0x01, (byte) 0xFF, 0x00, 0x07, 0x0A};
    private EditText et_Timeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        try {
            serialPort = new SerialPort("/dev/ttymxc4", 115200, 0);
            outputStream = serialPort.getOutputStream();
            if (serialPort != null) {
                showMessage(serialPort.getInputStream().toString());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        findViewById(R.id.btn_up).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[2] = 0x01;
                try {
                    outputStream.write(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        findViewById(R.id.btn_right).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[2] = 0x04;
                try {
                    outputStream.write(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        findViewById(R.id.btn_left).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[2] = 0x03;
                try {
                    outputStream.write(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        findViewById(R.id.btn_down).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[2] = 0x02;
                try {
                    outputStream.write(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[2] = 0x05;
                try {
                    outputStream.write(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        findViewById(R.id.btn_circle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[2] = 0x06;
                try {
                    outputStream.write(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });


        findViewById(R.id.btn_turn_time_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[4] = 0;
            }
        });
        findViewById(R.id.btn_turn_time_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[4] = 1;
            }
        });
        findViewById(R.id.btn_turn_time_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buffer[4] = 2;
            }
        });



        findViewById(R.id.btn_test_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread() {
                    @Override
                    public void run() {
                        super.run();
                        while (true) {

                            try {
                                buffer[2] = 0x02;
                                outputStream.write(buffer);
                                outputStream.flush();
                                Thread.sleep(100);

                                buffer[2] = 0x01;
                                outputStream.write(buffer);
                                Thread.sleep(100);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        }

                    }
                }.start();
            }
        });
    }


    private void showMessage(String str) {
        AlertDialog.Builder b = new AlertDialog.Builder(this);
        b.setTitle("Information");
        b.setMessage(str);
        b.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        b.show();
    }
}
