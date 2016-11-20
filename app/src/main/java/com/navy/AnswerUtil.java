package com.navy;



public class AnswerUtil {
	
	//���ڼ�����λ����Ķ�����
	int init_shift_byte = 0b0001;
	
	int no_selection = 0b0000;//��ʾ�û�û��ѡ���
	int A = 0b0001;   //1	65	    
	int B = 0b0010;	 //2	66	
	int C = 0b0100;	 //4	67	
	int D = 0b1000;//8	68
	/**
	 * ����򵥵�ѡ����ȷ�ʣ��򵥵�ѡ��ֻ��ABCD
	 * ע�⣺һ������20��ѡ����Ĵ�
	 * @return
	 */
	public double getSimpleSingleSelectionAccuracy(String answers, String userAnswers) {
		int answersInt = parseAnswer(answers);
		int userAnswersInt = parseAnswer(userAnswers);
		String result = Integer.toHexString(answersInt ^ userAnswersInt);
		
		System.out.println("�����Ӧ��16����Ϊ"+result); 
		double accuracy = 1-((result.replaceAll("0", "")).length())*1.0/(answers.length());//0����ȷ��ѡ��
		System.out.println("��ȷ��Ϊ"+accuracy);
		return accuracy;
	}
	
	/*
	  ���̣���answer��ɶ������ַ���
	 �����ƻ��㣬 
	 �����
	 */
	public int parseAnswer(String answer){
		char []selections = answer.toCharArray();
		int answersInt = 0;
		
		for(int i=0, length = selections.length; i<length; i++){
			int answerInt = parseSelection(selections[i]);
		
			if (i == 0) {
				answersInt = answerInt;		
			} else {
				answersInt =(answersInt<<4) + answerInt;//��������ţ���������ȼ�
			}
		}
		System.out.println("��"+answer+"��Ӧ��16����"+Integer.toHexString(answersInt));
		return answersInt;
	
	}
	
	/**
	 * 
	 * @param selection ֻ����ABCD�е�����һ��
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
			System.out.println(answer+"ת���Ķ����Ƶ��ַ������ܴ���4");
			throw new IllegalArgumentException(answer+"ת���Ķ����Ƶ��ַ������ܴ���4");
		}
		int needZeros = 4 - temp.length();
		for(int i = 0; i<needZeros; i++) {
			temp = "0"+temp;
		}
		return temp;
	}

}
