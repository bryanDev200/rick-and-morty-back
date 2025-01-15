package com.api.dtos.in;

import java.util.Arrays;
import java.util.Date;

public class CharacterDto {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private OriginDto origin;
    private LocationDto location;
    private String image;
    private String[] episode;
    private String url;
    private Date created;

    public CharacterDto() {}

    public CharacterDto(int id, String name, String status, String species, String type, String gender, OriginDto origin, LocationDto location, String image, String[] episode, String url, Date created) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.species = species;
        this.type = type;
        this.gender = gender;
        this.origin = origin;
        this.location = location;
        this.image = image;
        this.episode = episode;
        this.url = url;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getSpecies() {
        return species;
    }

    public String getType() {
        return type;
    }

    public String getGender() {
        return gender;
    }

    public OriginDto getOrigin() {
        return origin;
    }

    public LocationDto getLocation() {
        return location;
    }

    public String getImage() {
        return image;
    }

    public String[] getEpisode() {
        return episode;
    }

    public String getUrl() {
        return url;
    }

    public Date getCreated() {
        return created;
    }

    @Override
    public String toString() {
        return "CharacterDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", species='" + species + '\'' +
                ", type='" + type + '\'' +
                ", gender='" + gender + '\'' +
                ", origin=" + origin +
                ", location=" + location +
                ", image='" + image + '\'' +
                ", episode=" + Arrays.toString(episode) +
                ", url='" + url + '\'' +
                ", created=" + created +
                '}';
    }
}