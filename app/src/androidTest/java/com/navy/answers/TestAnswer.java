package com.navy.answers;

import android.test.InstrumentationTestCase;

import com.navy.util.StringUtil;

/**
 * Created by navychen on 16/11/21.
 */
public class TestAnswer extends InstrumentationTestCase {

    public static String ansers1 = "BBCDCBDCABCADBA\tBDCAB\tABDDA\tBBCDC\tCADBC\tBCADA\tABCDA\tCBDBDDCABC\tDABCA\tBDBCD\tADCAB\tBDBAC\tDABCB\tACBDA\tDACDC";
    public static String ansersUser1 = "ADCABDABCADCABC\tDABCA\tBDBCD\tADCAB\tBDBAC\tDABCB\tACBDA\tDACDCCADBA\tBDCAB\tABDDA\tBBCDC\tCADBC\tBCADA\tABCDA\tCBDBD";

    public void main()throws Exception{
        String accuracy1=  StringUtil.getRepetitionRate(ansers1.trim(), ansersUser1.trim());
        System.out.print(accuracy1);
    }

}
