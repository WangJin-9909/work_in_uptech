package com.uptech.smarthomeimplmqtt.utils;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;

/**
 * 常用字节数组，方法集合
 * @author huijun2014@sina.cn
 *
 */
public class Utils {
    //传感器控制与获取信息命令
    public static byte[] sendBuffer = new byte[] { (byte) 0xFE, (byte) 0xE0,0x09, 0x78, 0x71, 0x00, (byte) 0xFF, (byte) 0xFF, 0x0A };
    public static byte[] sendCtlBuffer = new byte[] { (byte) 0xFE, (byte) 0xE0,0x0A, 0x50,0x72 ,0x00, 0x00, 0x00,0x00, 0x0A };
    /**
     * 获取当前设备的 DisplayMetrics
     * @param context 当前上下文对象
     * @return 如果获取到返回DisplayMetrics，否则返回null
     */
    public static DisplayMetrics getDM(Context context) {
        try {
            DisplayMetrics dm = new DisplayMetrics();
            WindowManager manager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
            manager.getDefaultDisplay().getMetrics(dm);
            return dm;
        } catch (Exception ex) {

        }
        return null;
    }

    /**
     * Check network connection status
     *
     * @return true, available； false，unavailable
     */
    public static boolean isOpenNetwork(Context context) {
        ConnectivityManager connManager = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connManager.getActiveNetworkInfo() != null) {
            return connManager.getActiveNetworkInfo().isAvailable();
        }
        return false;
    }

    /**
     * get String array index by the value
     * @param value the item of array
     * @param array value collection
     * @return if find index,not find -1
     */
    public static int getArrayIndex(int value,int[] array) {
        int index = -1;
        for(int i = 0; i < array.length; i ++)
            if(array[i] == value )
            {
                index = i;
                break;
            }
        return index;
    }

    /**
     *  get sdcard path
     * @return path
     */
    public static String getSDCardPath() {
        return Environment.getExternalStorageDirectory() + "/";
    }

    /**
     *  save picture to sdcard
     * @param bitmap the picture to be saved
     * @param picPath save path
     */
    public static void saveBitmapToSDCard(Bitmap bitmap,String picPath) {
        FileOutputStream fos = null;
        File file = new File(getSDCardPath(), picPath);
        try {
            if(!file.exists())
            {
                if(!file.mkdir())
                    Log.e("LOG : ",file.getAbsolutePath());
            }
            fos = new FileOutputStream(getSDCardPath() + picPath + new Date().getTime() + ".jpg");//picPath为保存SD卡路径
            if (fos != null) {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(fos != null)
                    fos.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    /**
     * Check the string is digit string
     *
     * @param strNum
     *            The string to be checked .
     * @return true if (and only if) the Pattern matches the entire region.
     */
    public static boolean isDigit(String strNum) {
        Pattern pattern = Pattern.compile("[0-9]{1,}");
        Matcher matcher = pattern.matcher((CharSequence) strNum);
        return matcher.matches();
    }

    /**
     * String to Integer
     *
     * @param str
     *            source string data
     * @return destnation int data
     * @throws NumberFormatException
     *             the string can't convert to int data
     */
    public static int string2int(String str) throws NumberFormatException {
        return Integer.valueOf(str).intValue();
    }

    /**
     * byte[] to hex string
     * @param src source byte[]
     * @return dest string
     */
    public static String bytesToHexString(byte[] src){
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }
    /**
     * byte to hex string
     * @param src source byte
     * @return dest string
     */
    public static String byteToHexString(byte src){
        StringBuilder stringBuilder = new StringBuilder("");
        String hv = Integer.toHexString(src & 0xFF);
        if (hv.length() < 2) {
            stringBuilder.append(0);
        }
        stringBuilder.append(hv);
        return stringBuilder.toString().toUpperCase(Locale.ENGLISH);
    }
    /**
     * 判断IP是否合法
     *
     * @param ip
     *            IP字符串
     * @return 如果合法返回true，否则返回false
     */
    public static boolean checkIp(String ip) {
        Pattern p = Pattern.compile("(?<=(\\b|\\D))(((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))\\.){3}((\\d{1,2})|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))(?=(\\b|\\D))");
        Matcher m = p.matcher(ip);
        return m.find();
    }

    /**
     * 判断当前设备是不是开发板设备
     *
     * @return 是返回true，否则返回false
     */
    public static Boolean isServerDevice() {
        try {
            String temp = null;
            Process localProcess = Runtime.getRuntime().exec("ps |grep server");
            BufferedReader reader = new BufferedReader(new InputStreamReader(
                    localProcess.getInputStream()));
            temp = reader.readLine();
            while ((temp = reader.readLine()) != null) {
                if (temp.contains("vendor/web/server"))
                    return true;
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return false;
    }

    /**
     * mesure md5 string
     *
     * @param string
     *            source string data
     * @return destnation string data
     */
    public static String md5(String string) {
        byte[] hash;
        try {
            hash = MessageDigest.getInstance("MD5").digest(
                    string.getBytes("UTF-8"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Huh, MD5 should be supported?", e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Huh, UTF-8 should be supported?", e);
        }
        StringBuilder hex = new StringBuilder(hash.length * 2);
        for (byte b : hash) {
            if ((b & 0xFF) < 0x10)
                hex.append("0");
            hex.append(Integer.toHexString(b & 0xFF));
        }
        return hex.toString();
    }

    /***
     * 图片的缩放方法
     *
     * @param bgimage
     *            ：源图片资源
     * @param newWidth
     *            ：缩放后宽度
     * @param newHeight
     *            ：缩放后高度
     * @return
     */
    public static Bitmap resizeImage(Bitmap bgimage, double newWidth,
                                     double newHeight) {
        // 获取这个图片的宽和高
        float width = bgimage.getWidth();
        float height = bgimage.getHeight();
        // 创建操作图片用的matrix对象
        Matrix matrix = new Matrix();
        // 计算宽高缩放率
        float scaleWidth = ((float) newWidth) / width;
        float scaleHeight = ((float) newHeight) / height;
        // 缩放图片动作
        matrix.postScale(scaleWidth, scaleHeight);
        Bitmap bitmap = Bitmap.createBitmap(bgimage, 0, 0, (int) width,
                (int) height, matrix, true);
        return bitmap;
    }

    /**
     * 绘制提示的 bitmap
     *
     * @param width
     *            bitmap的宽度
     * @param height
     *            bitmap的高度
     * @param mString
     *            要绘制的文字
     * @param size
     *            字体大小
     * @param color
     *            字体颜色
     * @return 绘制后的bitmap
     */
    public static Bitmap getImage(int width, int height, String mString,int size, int color) {
        int x = width;
        int y = height;

        Bitmap bmp = Bitmap.createBitmap(x, y, Bitmap.Config.RGB_565);
        Canvas canvasTemp = new Canvas(bmp);
        canvasTemp.drawColor(Color.BLACK);
        Paint p = new Paint();
        p.setColor(color);
        p.setTypeface(Typeface.create("宋体", Typeface.BOLD));
        p.setAntiAlias(true);
        p.setFilterBitmap(true);
        p.setTextSize(size);
        float tX = (x - getFontlength(p, mString)) / 2;
        float tY = (y - getFontHeight(p)) / 2 + getFontLeading(p);
        canvasTemp.drawText(mString, tX, tY, p);
        return bmp;
    }

    /**
     * 根据屏幕系数比例获取文字大小
     *
     * @return
     */
    public static int scalaFonts(Context context, int size) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        return (int) (size * dm.density);
    }

    /**
     * @return 返回指定笔和指定字符串的长度
     */
    public static float getFontlength(Paint paint, String str) {
        return paint.measureText(str);
    }

    /**
     * @return 返回指定笔的文字高度
     */
    public static float getFontHeight(Paint paint) {
        FontMetrics fm = paint.getFontMetrics();
        return fm.descent - fm.ascent;
    }

    /**
     * @return 返回指定笔离文字顶部的基准距离
     */
    public static float getFontLeading(Paint paint) {
        FontMetrics fm = paint.getFontMetrics();
        return fm.leading - fm.ascent;
    }

    /** 从SD卡中获取资源图片的路径 */
    public static List<String> getImagePathFromSD() {
        List<String> it = new ArrayList<String>();
        File[] files = getFiles();
        if(files != null)
        {
            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                if (checkIsImageFile(file.getPath()))
                    it.add(file.getPath());
            }
        }
        return it;
    }

    /**
     * 获取path文件夹下所有文件的文件名
     * @param path  文件夹路径
     * @return ArrayList<String> 的文件名集合
     */
    public static ArrayList<String> getFileNameList(String path){
        ArrayList<String> FileNameList=new ArrayList<String>();
        File mFile = new File(path);
        File[] files = null;
        if (mFile.exists())
            files = mFile.listFiles();
        if(files != null)
        {
            for (int i = 0; i < files.length; i++) {
                FileNameList.add( files[i].getName());
            }
        }
        return FileNameList;
    }

    /**
     * 获取image下的所有文件
     * @return 文件数组
     */
    public static File[] getFiles()
    {
        String imagePath = Environment.getExternalStorageDirectory().getAbsolutePath() + "/SmartHome/History/images/";
        File mFile = new File(imagePath);
        if (mFile.exists()) {
            return mFile.listFiles();
        }
        else return null;
    }
    /** 判断是否是相应的图片格式 */
    private static boolean checkIsImageFile(String fName) {
        boolean isImageFormat;
        String end = fName .substring(fName.lastIndexOf(".") + 1, fName.length()) .toLowerCase(Locale.ENGLISH);
        if (end.equals("jpg") || end.equals("gif") || end.equals("png")
                || end.equals("jpeg") || end.equals("bmp")) {
            isImageFormat = true;
        } else {
            isImageFormat = false;
        }
        return isImageFormat;
    }
    /**
     * 根据给定的数组返回list集合
     * @param array 原数组
     * @return List集合
     */
    public static List<String> getList(String[] array)
    {
        List<String> list = new ArrayList<String>();
        for(int i = 0 ; i < array.length ; i ++ )
        {
            list.add(array[i]);
        }
        return list;
    }
    /**
     * 根据给定的数组返回list集合
     * @param array 原数组
     * @return List集合
     */
    public static List<String> getList(int[] array)
    {
        List<String> list = new ArrayList<String>();
        for(int i = 0 ; i < array.length ; i ++ )
        {
            list.add(String.valueOf(array[i]));
        }
        return list;
    }
    /**
     * 根据给定的数组返回list集合
     * @param array 原数组
     * @return List集合
     */
    public static List<String> getList(Context context,int[] array)
    {
        List<String> list = new ArrayList<String>();
        for(int i = 0 ; i < array.length ; i ++ )
        {
            list.add(context.getString(array[i]));
        }
        return list;
    }
    /**
     * 设置图标可见
     *
     * @param menu
     * @param enable
     * @throws Exception
     */
    public static void setIconEnable(android.view.Menu menu, boolean enable)
            throws Exception {
        Class<?> clazz = Class
                .forName("com.android.internal.view.menu.MenuBuilder");
        java.lang.reflect.Method m = clazz.getDeclaredMethod(
                "setOptionalIconsVisible", boolean.class);
        m.setAccessible(true);
        m.invoke(menu, enable);
    }
    /**
     * 获取root权限
     * @param pkgCodePath
     * @return
     */
    public static boolean upgradeRootPermission(String pkgCodePath) {
        Process process = null;
        DataOutputStream os = null;
        try {
            String cmd="chmod 777 " + pkgCodePath;
            process = Runtime.getRuntime().exec("su"); //切换到root帐号
            os = new DataOutputStream(process.getOutputStream());
            os.writeBytes(cmd + "\n");
            os.writeBytes("exit\n");
            os.flush();
            process.waitFor();
        } catch (Exception e) {
            return false;
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
                process.destroy();
            } catch (Exception e) {
            }
        }
        return true;
    }
    /**
     * 整数转化为ip字符串
     * @param paramInt Ip
     * @return Ip String
     */
    public static String intToIp(int paramInt) {
        return (paramInt & 0xFF) + "." + (0xFF & paramInt >> 8) + "." + (0xFF & paramInt >> 16) + "."
                + (0xFF & paramInt >> 24);
    }
    /**
     * 整型转化为字节数组
     * @param i 要转化的整数
     * @return 转化后的字节数组
     */
    public static byte[] intToByteArray(int i) {
        byte[] result = new byte[4];
        result[0] = (byte)((i >> 24) & 0xFF);
        result[1] = (byte)((i >> 16) & 0xFF);
        result[2] = (byte)((i >> 8) & 0xFF);
        result[3] = (byte)(i & 0xFF);
        return result;
    }
    /**
     * 验证手机格式
     */
    public static boolean isMobileNumber(String mobiles) {
        String telRegex = "[1][358]\\d{9}";
        if (TextUtils.isEmpty(mobiles)) return false;
        else return mobiles.matches(telRegex);
    }

    public static String getCurrentTime()
    {
        long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.DEFAULT,DateFormat.FULL); //显示日期，周，上下午，时间（精确到秒）
        //SimpleDateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        return dateFormat.format(date);
    }

    /**
     * 把毫秒转化成日期
     * @param dateFormat(日期格式，例如：yyyy-MM-dd HH:mm:ss)
     * @param millSec(毫秒数)
     * @return
     */
    public static String transferMillToDate(String dateFormat,long millSec){
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Date date= new Date(millSec);
        return sdf.format(date);
    }

    /**
     *
     * @param context
     * @param fileName
     * @param object
     */
    public static void writeObject2File(Context context, String fileName,Object object)
    {
        FileOutputStream fos = null;
        ObjectOutputStream objectOutputStream = null;
        File dir = context.getFilesDir();
        File file = new File( dir , fileName);
        try {
            fos = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fos);
            objectOutputStream.writeObject(object);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fos != null)
                    fos.close();
                if(objectOutputStream != null)
                    objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     *
     * @param context
     * @param fileName
     * @return
     */
    public static Object readObjectFromFile(Context context,String fileName)
    {
        Object object = null;
        FileInputStream fis = null;
        ObjectInputStream objectInputStream = null;
        File dir = context.getFilesDir();
        File file = new File( dir , fileName);
        try {
            fis = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fis);
            object=objectInputStream.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fis != null)
                    fis.close();
                if(objectInputStream != null)
                    objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return  object;
    }
}
