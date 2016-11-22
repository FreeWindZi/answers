package com.navy.answers.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by navychen on 16/11/21.
 */
public class BaseDao  {

    protected  String TAG = getClass().getSimpleName();
    private Context context;

    MySqLiteHelper mySqLiteHelper;

    public BaseDao(Context context) {
        this.context = context;
        mySqLiteHelper = new MySqLiteHelper(context);
    }


}
