package com.hack.cp.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//
//@Entity
public class Answer {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long userId;
    private String question;
    private String qnswer;
    private String tag;

    public long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getQnswer() {
        return qnswer;
    }

    public String getTag() {
        return tag;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setQnswer(String qnswer) {
        this.qnswer = qnswer;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
