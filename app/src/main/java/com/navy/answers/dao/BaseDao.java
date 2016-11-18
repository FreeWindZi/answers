package com.navy.answers.dao;

import android.content.Context;

import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.read.biff.BiffException;

/**
 * Created by navychen on 16/11/18.
 */
public abstract class BaseDao {

    protected String TAG = this.getClass().getSimpleName();

    protected Context context;

    abstract public void initModelFromExcel(String name) throws IOException, BiffException;

    public BaseDao(Context context) {
        this.context = context;
    }
}
