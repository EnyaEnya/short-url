package com.shortUrl.domain;

public class Link {

    //private long id;
    private String long_link;
    private String short_link;


//    public long getId() {
//        return id;
//    }
//
//    public void setId(long id) {
//        this.id = id;
//    }

    public String getLongLink() {
        return long_link;
    }

    public void setLongLink(String long_link) {
        this.long_link = long_link;
    }

    public String getShortLink() {
        return short_link;
    }

    public void setShortLink(String short_link) {
        this.short_link = short_link;
    }

    @Override
    public String toString() {
        return "Link{" +
                "long_link=" + long_link +
                ", short_link= " + short_link +
                '}';
    }
}
