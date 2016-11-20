package com.navy;



public class AnswerUtil {
	
	//用于计算移位运算的二进制
	int init_shift_byte = 0b0001;
	
	int no_selection = 0b0000;//表示用户没有选择答案
	int A = 0b0001;   //1	65	    
	int B = 0b0010;	 //2	66	
	int C = 0b0100;	 //4	67	
	int D = 0b1000;//8	68
	/**
	 * 计算简单单选的正确率，简单单选是只有ABCD
	 * 注意：一次最多对20个选择题的答案
	 * @return
	 */
	public double getSimpleSingleSelectionAccuracy(String answers, String userAnswers) {
		int answersInt = parseAnswer(answers);
		int userAnswersInt = parseAnswer(userAnswers);
		String result = Integer.toHexString(answersInt ^ userAnswersInt);
		
		System.out.println("结果对应的16进制为"+result); 
		double accuracy = 1-((result.replaceAll("0", "")).length())*1.0/(answers.length());//0是正确的选择
		System.out.println("正确率为"+accuracy);
		return accuracy;
	}
	
	/*
	  流程，将answer变成二进制字符串
	 二进制换算， 
	 输出答案
	 */
	public int parseAnswer(String answer){
		char []selections = answer.toCharArray();
		int answersInt = 0;
		
		for(int i=0, length = selections.length; i<length; i++){
			int answerInt = parseSelection(selections[i]);
		
			if (i == 0) {
				answersInt = answerInt;		
			} else {
				answersInt =(answersInt<<4) + answerInt;//必须加括号，运算的优先级
			}
		}
		System.out.println("答案"+answer+"对应的16进制"+Integer.toHexString(answersInt));
		return answersInt;
	
	}
	
	/**
	 * 
	 * @param selection 只能是ABCD中的其中一个
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
			System.out.println(answer+"转换的二进制的字符串不能大于4");
			throw new IllegalArgumentException(answer+"转换的二进制的字符串不能大于4");
		}
		int needZeros = 4 - temp.length();
		for(int i = 0; i<needZeros; i++) {
			temp = "0"+temp;
		}
		return temp;
	}

}
