package com.codingapp.quizapp;

public class QuestionModel {
    private String question,optionA,optionB,optionC,correctANS;
    private int setNo;

    public QuestionModel(){//creating empty constructor
        //for firebase
    }

    public QuestionModel(String question, String optionA, String optionB, String optionC, String correctANS,int setNo) {
        this.setNo=setNo;
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.correctANS = correctANS;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getCorrectANS() {
        return correctANS;
    }

    public void setCorrectANS(String correctANS) {
        this.correctANS = correctANS;
    }

    public int getSetNo() {
        return setNo;
    }

    public void setSetNo(int setNo) {
        this.setNo = setNo;
    }
}
