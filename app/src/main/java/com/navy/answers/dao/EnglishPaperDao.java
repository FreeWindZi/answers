package com.navy.answers.dao;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.navy.answers.MyApplication;
import com.navy.answers.app.Config;
import com.navy.answers.model.EnglishPaper;
import com.navy.answers.util.LogUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 * Created by navychen on 16/11/18.
 */
public class EnglishPaperDao extends BaseDao{




    public EnglishPaperDao(Context context) {
        super(context);
    }

    @Override
    public void initModelFromExcel(String name) throws IOException, BiffException {
        if (TextUtils.isEmpty(name)){
            LogUtil.d(TAG, "excel file cannot be null, please check file");
        }
        List list = new ArrayList();
        Workbook rwb = null;
        Cell cell = null;
        InputStream is = null;



        if (name.equals(Config.DEFAULT_FILE_NAME)) {
            is = context.getAssets().open(name);
        } else {
            is = new FileInputStream(name);
        }

        rwb = Workbook.getWorkbook(is);

        //获取文件的指定工作表 默认的第一个
        Sheet sheet = rwb.getSheet(0);

        //行数(表头的目录不需要，从1开始)
        for(int i=0; i<sheet.getRows(); i++){

            //创建一个数组 用来存储每一列的值
            String[] str = new String[sheet.getColumns()];

            //列数
            for(int j=0; j<sheet.getColumns(); j++){

                //获取第i行，第j列的值
                cell = sheet.getCell(j,i);
                str[j] = cell.getContents();

            }
            //把刚获取的列存入list
            list.add(str);
        }
        for(int i=0;i<list.size();i++){
            String[] str = (String[])list.get(i);
            for(int j=0;j<str.length;j++){
                LogUtil.d(TAG,str[j]);
            }
        }

    }



}
