package com.api.dtos.out;

import java.util.List;

public class Response<T> {
    private ResponseInfoDto info;
    private T data;

    public Response(ResponseInfoDto info, T data) {
        this.info = info;
        this.data = data;
    }

    public ResponseInfoDto getInfo() {
        return info;
    }

    public T getData() {
        return data;
    }
}