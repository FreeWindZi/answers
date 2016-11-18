package com.navy.answers.model;

/**
 * Created by navychen on 16/11/18.
 */
public class EnglishPaper {

    //英语考试分类
    public static final int EnglishOne = 1; //表示英语考研1
    public static final int EnglishTwo = 2; //表示英语考研2

    //英语题型分类
    public static final String Section_1  ="Section 1 Use of English";
    public static final String Section_2  ="Section Ⅱ Reading Comprehension";

    //由于题的名字比较复杂,选择
    private String choice1_5 = "";
    private String choice6_10 = "";
    private String choice11_15 = "";
    private String choice16_20 = "";
    private String choice21_25_Text1 = "";
    private String choice26_30_Text2 = "";
    private String choice31_35_Text3 = "";
    private String choice36_40_Text4 = "";
    private String choice41_45_PartB = "";

    public String getChoice6_10() {
        return choice6_10;
    }

    public void setChoice6_10(String choice6_10) {
        this.choice6_10 = choice6_10;
    }

    public String getChoice1_5() {
        return choice1_5;
    }

    public void setChoice1_5(String choice1_5) {
        this.choice1_5 = choice1_5;
    }

    public String getChoice16_20() {
        return choice16_20;
    }

    public void setChoice16_20(String choice16_20) {
        this.choice16_20 = choice16_20;
    }

    public String getChoice11_15() {
        return choice11_15;
    }

    public void setChoice11_15(String choice11_15) {
        this.choice11_15 = choice11_15;
    }

    public String getChoice21_25_Text1() {
        return choice21_25_Text1;
    }

    public void setChoice21_25_Text1(String choice21_25_Text1) {
        this.choice21_25_Text1 = choice21_25_Text1;
    }

    public String getChoice26_30_Text2() {
        return choice26_30_Text2;
    }

    public void setChoice26_30_Text2(String choice26_30_Text2) {
        this.choice26_30_Text2 = choice26_30_Text2;
    }

    public String getChoice31_35_Text3() {
        return choice31_35_Text3;
    }

    public void setChoice31_35_Text3(String choice31_35_Text3) {
        this.choice31_35_Text3 = choice31_35_Text3;
    }

    public String getChoice36_40_Text4() {
        return choice36_40_Text4;
    }

    public void setChoice36_40_Text4(String choice36_40_Text4) {
        this.choice36_40_Text4 = choice36_40_Text4;
    }

    public String getChoice41_45_PartB() {
        return choice41_45_PartB;
    }

    public void setChoice41_45_PartB(String choice41_45_PartB) {
        this.choice41_45_PartB = choice41_45_PartB;
    }
}
