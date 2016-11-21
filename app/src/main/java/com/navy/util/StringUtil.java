package com.navy.util;

import android.text.TextUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * Created by navychen on 16/11/21.
 */
public class StringUtil {
    /**
     * 计算str2相对str1来时的重复率,返回百分比,最多保留两位小数(如33.33%)
     * @param str1
     * @param str2
     */
    public static final String TAG = StringUtil.class.getSimpleName();
    public static String getRepetitionRate(String str1, String str2){
        if (str1.equals("") || str1.length()==0){
            LogUtil.e(TAG, str1+"不能为空");
            return "";
        }
        if (TextUtils.isEmpty(str2)){

            return "0";
        }
        int length1 = str1.length();
        int length2 = str2.length();
        if (length2>length1) {
            LogUtil.e(TAG, str2+"的长度不能大于"+str1+"的长度");
            return "";
        }
        char []array1 = str1.toCharArray();
        char []array2 = str2.toCharArray();

        int rightNums = 0;
        for (int i=0; i<length2;i++){
            if(array1[i]==array2[i]){
                rightNums++;
            }
        }
        LogUtil.d(TAG, "str1长度为"+length1+"  一共有"+rightNums+"字符相同");
        BigDecimal result = new BigDecimal(rightNums*1.0/length1);
        DecimalFormat a = new DecimalFormat("#.00%");

        return a.format(result);

    }
}
