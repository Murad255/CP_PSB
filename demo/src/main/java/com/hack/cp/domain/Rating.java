package com.hack.cp.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//@Entity
public class Rating {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long userId;
    private String question;
    private String qnswer;
    private String tag;



}
