package com.navy.answers.model;

/**
 * Created by navychen on 16/11/21.
 */
public class Section {

    private int id;//主键
    private int paperId;//外键

    private int startQustionId;
    private String name;
    private String answer;
    private boolean isAnswer;

    private String userAnswer;
    private int times;//做题次数
    private String dateTime;//做题时间


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPaperId() {
        return paperId;
    }

    public void setPaperId(int paperId) {
        this.paperId = paperId;
    }

    public int getStartQustionId() {
        return startQustionId;
    }

    public void setStartQustionId(int startQustionId) {
        this.startQustionId = startQustionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public boolean isAnswer() {
        return isAnswer;
    }

    public void setIsAnswer(boolean isAnswer) {
        this.isAnswer = isAnswer;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}
