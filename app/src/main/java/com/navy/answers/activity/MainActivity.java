package com.navy.answers.activity;

import android.os.Bundle;

import com.navy.answers.R;
import com.navy.answers.app.Config;
import com.navy.answers.dao.EnglishPaperDao;

import java.io.IOException;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void initData() {
        EnglishPaperDao dao = new EnglishPaperDao(this);
        try {
            dao.initDb(getAssets().open(Config.DEFAULT_FILE_NAME));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void initUI() {

    }





}
