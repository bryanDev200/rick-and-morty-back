package com.api.dtos.in;

public class OriginDto {
    private String name;
    private String url;

    public OriginDto() {}

    public OriginDto(String name, String url) {
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