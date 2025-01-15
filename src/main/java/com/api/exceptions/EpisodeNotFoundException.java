package com.api.exceptions;

import com.api.dtos.in.EpisodeDto;

public class EpisodeNotFoundException extends  RuntimeException {
    public EpisodeNotFoundException(String message) {
        super(message);
    }
}