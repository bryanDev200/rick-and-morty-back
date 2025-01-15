package com.api.dtos.in;

import java.util.List;

public class RickAndMortyApiResponse {
    private InfoDto info;
    private List<CharacterDto> results;

    public RickAndMortyApiResponse() {}

    public RickAndMortyApiResponse(InfoDto info, List<CharacterDto> results) {
        this.info = info;
        this.results = results;
    }

    public InfoDto getInfo() {
        return info;
    }

    public List<CharacterDto> getResults() {
        return results;
    }

    @Override
    public String toString() {
        return "RickAndMortyApiResponse{" +
                "info=" + info +
                ", results=" + results +
                '}';
    }
}