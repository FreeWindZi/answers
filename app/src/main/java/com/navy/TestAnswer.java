package com.navy;

public class TestAnswer {
	

	public static String ansers = "CADBA	BDCAB	ABDDA	BBCDC	CADBC	BCADA	ABCDA	CBDBD";
	public static String ansersUser = "DCABC	DABCA	BDBCD	ADCAB	BDBAC	DABCB	ACBDA	DACDC";

	public static String ansers1 = "BBCDCBDCAB";
	public static String ansersUser1 = "ADCABDABCA";
	
	static int init_shift_byte = 0b0001;
	public static void main(String[] args) {
		AnswerUtil util = new AnswerUtil();
		util.getSimpleSingleSelectionAccuracy(ansers1.trim(), ansersUser1.trim());
	
	}
	
	
	

}
