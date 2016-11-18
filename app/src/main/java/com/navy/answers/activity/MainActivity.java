package com.navy.answers.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.navy.answers.R;
import com.navy.answers.app.Config;
import com.navy.answers.dao.BaseDao;
import com.navy.answers.dao.EnglishPaperDao;
import com.navy.answers.model.EnglishPaper;

import java.io.IOException;

import jxl.read.biff.BiffException;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void initData() {
        BaseDao dao =new EnglishPaperDao(this);
        try {
            dao.initModelFromExcel(Config.DEFAULT_FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (BiffException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void initUI() {

    }


    private void rendExcelFiles(){

    }


}
