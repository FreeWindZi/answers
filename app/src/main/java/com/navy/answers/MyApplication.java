package com.navy.answers;

import android.app.Application;

import com.navy.answers.util.LogUtil;

/**
 * Created by navychen on 16/11/18.
 */
public class MyApplication extends Application {

    public static Application app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        LogUtil.d("", "---------------");
    }

}
