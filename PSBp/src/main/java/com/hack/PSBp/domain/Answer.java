package com.hack.PSBp.domain;

public class Answer {
    private  long id;
    private  long userId;
    private  String question;
    private  String userAnswer;
    private  String tag;

    public Answer() {
    }

    public Answer(long id, long userId, String question, String userAnswer, String tag) {
        this.id = id;
        this.userId = userId;
        this.question = question;
        this.userAnswer = userAnswer;
        this.tag = tag;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public String getQuestion() {
        return question;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public String getTag() {
        return tag;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setUserAnswer(String userAnswer) {
        this.userAnswer = userAnswer;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


    @Override
    public String toString() {
        return "Answer [id=" + id + ", question=" + question + ", userAnswer=" + userAnswer + "]";
    }


}
