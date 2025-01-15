package com.api.dtos.in;

import java.util.Arrays;
import java.util.Date;

public class EpisodeDto {
    private int id;
    private String name;
    private String air_date;
    private String episode;
    private String[] characters;
    private String url;
    private Date created;

    public EpisodeDto() {}

    public EpisodeDto(int id, String air_date,String name , String episode, String[] characters, String url, Date created) {
        this.id = id;
        this.air_date = air_date;
        this.name = name;
        this.episode = episode;
        this.characters = characters;
        this.url = url;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public String getAir_date() {
        return air_date;
    }

    public String getName() {
        return name;
    }

    public String getEpisode() {
        return episode;
    }

    public String[] getCharacters() {
        return characters;
    }

    public String getUrl() {
        return url;
    }

    public Date getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "EpisodeDto{" +
                "id=" + id +
                ", air_date=" + air_date +
                ", name=" + name +
                ", episode='" + episode + '\'' +
                ", characters=" + Arrays.toString(characters) +
                ", url='" + url + '\'' +
                ", created=" + created +
                '}';
    }
}