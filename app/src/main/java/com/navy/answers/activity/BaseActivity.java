package com.navy.answers.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by navychen on 16/11/18.
 */
public abstract class BaseActivity extends AppCompatActivity {

    protected Context context;
    protected final String TAG = getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.context = this;
        initUI();
        initData();
    }

    protected abstract void initData();

    protected abstract void initUI();


}
