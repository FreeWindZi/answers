package com.navy;

import com.navy.util.StringUtil;

import java.math.BigDecimal;
import java.text.Format;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestAnswer {
	

	public static String ansers = "CADBA	BDCAB	ABDDA	BBCDC	CADBC	BCADA	ABCDA	CBDBD";
	public static String ansersUser = "DCABC	DABCA	BDBCD	ADCAB	BDBAC	DABCB	ACBDA	DACDC";

	public static String ansers1 = "CADBA BDCAB";
	public static String ansersUser1 = "DCABCDABCA";
	
	static int init_shift_byte = 0b0001;
	public static void main(String[] args) {

		String s = "AaccpHelloWorldHH";
		String[] ss = s.split("(?=[A-Z])");

		Pattern pattern = Pattern.compile("(?=[A-Z])");
		Matcher matcher = pattern.matcher(s);
		matcher.replaceAll("(?=[a-z])");


		System.out.print(ss);

	}
	
	
	public static BigDecimal getSingleSelectionAccuracy(String ansers, String answerUser){
		char []answerChar = ansers.toCharArray();
		char []answerUserChar = answerUser.toCharArray();
		int length = ansers.length();
		int rightNums = 0;
		for (int i=0; i<length;i++){
			if(answerChar[i]==answerUserChar[i]){
				rightNums++;
			}
		}
		return new BigDecimal(rightNums*1.0/rightNums);

	}

}
