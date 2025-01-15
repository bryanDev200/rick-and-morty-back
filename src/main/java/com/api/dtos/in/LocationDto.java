package com.api.dtos.in;

public class LocationDto {
    private String name;
    private String url;

    public LocationDto() {}

    public LocationDto(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }
}