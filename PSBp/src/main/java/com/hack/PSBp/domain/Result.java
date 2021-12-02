package com.hack.PSBp.domain;

public class Result {
    private  long id;
    private  long userId;
    private  int rating;
    private  String tag;

    public Result() {

    }

    public Result(long id, long userId, int rating, String tag) {
        this.id = id;
        this.userId = userId;
        this.rating = rating;
        this.tag = tag;
    }

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public int getRating() {
        return rating;
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

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }


    @Override
    public String toString() {
        return "Answer [id=" + id + ", rating=" + rating + ", userId=" + userId + "]";
    }
}
