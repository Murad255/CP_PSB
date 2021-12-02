package com.hack.cp.Data;

import javax.persistence.Entity;

public class TestData {

    private long  id;
    private long  plantId;
    private String title;
    private String code;
    private String lan;
    private String lon;

    public TestData() {
    }

    public TestData(int id, int plantId, String title, String code, String lan, String lon) {
        this.id = id;
        this.plantId = plantId;
        this.title = title;
        this.code = code;
        this.lan = lan;
        this.lon = lon;
    }


    ////GET////
    public long getId() {
        return id;
    }

    public long getPlantId() {
        return plantId;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }

    public String getLan() {
        return lan;
    }

    public String getLon() {
        return lon;
    }

    ////SET/////
    public void setId(long id) {
        this.id = id;
    }

    public void setPlantId(long plantId) {
        this.plantId = plantId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }


    @Override
    public String toString() {
        return "TestData [id=" + id + ", title=" + title + ", code=" + code + "]";
    }

}
