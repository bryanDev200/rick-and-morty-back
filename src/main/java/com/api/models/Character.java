package com.api.models;

import java.util.Date;
import java.util.List;

public class Character {
    private int id;
    private String name;
    private String status;
    private String specie;
    private String location;
    private String image;
    private List<Episode> episodes;
    private Date created;

    public Character(int id, String name, String status, String specie, String location, String image, List<Episode> episodes, Date created) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.specie = specie;
        this.location = location;
        this.image = image;
        this.episodes = episodes;
        this.created = created;
    }

    public Character() {}

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(List<Episode> episodes) {
        this.episodes = episodes;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}