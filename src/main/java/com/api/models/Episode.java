package com.api.models;

import java.util.Date;

public class Episode {
    private int id;
    private String name;
    private Date airDate;
    private Date created;

    public Episode() {}

    public Episode(int id, String name, Date airDate, Date created) {
        this.id = id;
        this.name = name;
        this.airDate = airDate;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAirDate() {
        return airDate;
    }

    public void setAirDate(Date airDate) {
        this.airDate = airDate;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}