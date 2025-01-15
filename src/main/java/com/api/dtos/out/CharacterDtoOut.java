package com.api.dtos.out;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties;

public class CharacterDtoOut {
    private int id;
    private String name;
    private String status;
    private String location;
    private String episode;
    private String image;

    private CharacterDtoOut(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.status = builder.status;
        this.location = builder.location;
        this.episode = builder.episode;
        this.image = builder.image;
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

    public String getLocation() {
        return location;
    }

    public String getEpisode() {
        return episode;
    }

    public String getImage() {
        return image;
    }

    public static class Builder {
        private int id;
        private String name;
        private String status;
        private String location;
        private String episode;
        private String image;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder setEpisode(String episode) {
            this.episode = episode;
            return this;
        }

        public Builder setImage(String image) {
            this.image = image;
            return this;
        }

        public CharacterDtoOut build() {
            return new CharacterDtoOut(this);
        }
    }
}