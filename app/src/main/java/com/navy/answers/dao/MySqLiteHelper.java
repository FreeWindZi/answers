package com.navy.answers.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

/**
 * Created by navychen on 16/11/21.
 */
public class MySqLiteHelper extends SQLiteOpenHelper {
    public static final int VERSION = 1;
    public static final String DATABASE_NAME = "answers.db";
    private static final String TAG = "MySqLiteHelper";

    public static final String CREATE_ENGLISH_PAPER_ANSWER_SQL =
            "CREATE TABLE IF not EXISTS english_paper_answer \n"+
                    "(\n"+
                    "\tid integer PRIMARY KEY AUTOINCREMENT,\n"+
                    "\tyear integer,\n"+
                    "\ttype varchar\n"+
                    ")";
    public static final String CREATE_SECTION_SQL =
      "CREATE TABLE IF NOT EXISTS section\n" +
              "(\n" +
              "\tid integer PRIMARY KEY AUTOINCREMENT,\n" +
              "\tpaperId integer,\n" +
              "\tstartQustionID integer,\n" +
              "\tname varchar,\n" +
              "\tanswer varchar,\n" +
              "\tisAnswer tinyint,\n" +
              "\tuserAnswer varchar,\n" +
              "\ttimes integer,\n" +
              "\tdateTime DATETIME\n" +
              ")";

    public MySqLiteHelper(Context context) {
        super(context,DATABASE_NAME, null, VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_ENGLISH_PAPER_ANSWER_SQL);
        db.execSQL(CREATE_SECTION_SQL);
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }




}
