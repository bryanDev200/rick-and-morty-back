package com.api.exceptions;

public class TimeOutException extends  RuntimeException{
    public TimeOutException(String message) {
        super(message);
    }
}