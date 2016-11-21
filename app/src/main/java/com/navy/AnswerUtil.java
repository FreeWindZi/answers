package com.navy;


import java.math.BigDecimal;
import java.math.BigInteger;

public class AnswerUtil {
	

	int init_shift_byte = 0b0001;
	
	int no_selection = 0b0000;//
	int A = 0b0001;   //1	65	    
	int B = 0b0010;	 //2	66	
	int C = 0b0100;	 //4	67	
	int D = 0b1000;//8	68

	public BigDecimal getSimpleSingleSelectionAccuracy(String answers, String userAnswers) {
		BigInteger answersInt = parseAnswer(answers);
		BigInteger userAnswersInt = parseAnswer(userAnswers);
		BigInteger result = answersInt.xor(userAnswersInt);
		System.out.println("运算结果:" + result.toString(16));
		int non_zeros = result.toString(16).replaceAll("0", "").length();//计算非零数
		BigDecimal accuracy = new BigDecimal(""+ (answers.length()-non_zeros)*1.0)
				.divide(new BigDecimal(answers.length() +""), BigDecimal.ROUND_UP);

		return accuracy;
	}
	

	public BigInteger parseAnswer(String answer){
		char []selections = answer.toCharArray();
		BigInteger answersInt = BigInteger.ZERO;
		
		for(int i=0, length = selections.length; i<length; i++){
			int answerInt = parseSelection(selections[i]);
		
			if (i == 0) {
				answersInt = answersInt.add(new BigInteger(""+answerInt));
			} else {
				answersInt =answersInt.shiftLeft(4).add(new BigInteger(""+answerInt));//必须加括号,运算的优先级
			}
		}
		System.out.println("答案"+answer+"对于的16进制"+answersInt.toString(16));
		return answersInt;
	
	}
	
	/**
	 * 
	 * @param selection
	 * @return
	 */
	public int parseSelection(char selection){
		int answer;
		if (Character.isWhitespace(selection)) {
			answer =  no_selection;
		} else {
			answer = (byte) (init_shift_byte << (int)selection-65);  
		}
		return answer;
	}
	
	
	
	public static String printAnswer(int answer){
		String temp = Integer.toBinaryString(answer);
		if (temp.length()>4) {
			System.out.println(answer+"对应的二进制长度不能大于4");
			throw new IllegalArgumentException(answer+"对应的二进制长度不能大于4");
		}
		int needZeros = 4 - temp.length();
		for(int i = 0; i<needZeros; i++) {
			temp = "0"+temp;
		}
		return temp;
	}

}
