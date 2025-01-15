package com.api.controllers;

import com.api.dtos.ErrorDto;
import com.api.exceptions.CharacterNotFoundException;
import com.api.exceptions.EpisodeNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApiExceptionController {
    @ExceptionHandler(CharacterNotFoundException.class)
    public ResponseEntity<ErrorDto> characterNotFoundExceptionHandler(CharacterNotFoundException characterNotFoundException) {
        ErrorDto error = new ErrorDto(characterNotFoundException.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(EpisodeNotFoundException.class)
    public ResponseEntity<ErrorDto> episodeNotFoundExceptionHandler(EpisodeNotFoundException episodeNotFoundException) {
        ErrorDto error = new ErrorDto(episodeNotFoundException.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}