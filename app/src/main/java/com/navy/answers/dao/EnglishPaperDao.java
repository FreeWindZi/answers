package com.navy.answers.dao;

import android.content.Context;


import com.navy.util.LogUtil;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;



/**
 * Created by navychen on 16/11/18.
 */
public class EnglishPaperDao extends BaseDao {




    public EnglishPaperDao(Context context) {
        super(context);
    }


    public void initDb(InputStream is) throws IOException {
        Workbook workbook = null;
        try {
            workbook = new XSSFWorkbook(); //poi-ooxml-3.15.jar 解决冲突2007以后的
        } catch (Exception ex) {
            workbook = new HSSFWorkbook(); //2003以前的excel
        }
        Sheet sheet = workbook.getSheetAt(0);

        int cols = sheet.getLeftCol();//一共好多列
        int rows = sheet.getLastRowNum();//一共好的行
        LogUtil.d(TAG, String.format("该excel文本的sheet0,一共有%d行,%d列", rows, cols));

    }





}
