package com.navy.answers.util;

import android.util.Log;

/**
 * Created by navychen on 16/11/18.
 */
public class LogUtil {

    public static String LOG_TAG = "MyApplication";

    public static void v(String tag, String msg) {
        Log.v(LOG_TAG+"=====    "+tag, msg);
    }




    public static void d(String tag, String msg) {
        Log.d(LOG_TAG+"=====    "+tag, msg);
    }





    public static void i(String tag, String msg) {
        Log.i(LOG_TAG+"=====    "+tag, msg);
    }




    public static void w(String tag, String msg) {
        Log.w(LOG_TAG+"=====    "+tag, msg);
    }




    public static void e(String tag, String msg) {
        Log.e(LOG_TAG+"=====    "+tag, msg);
    }
    

}
