package com.priyanshi.SpringBootCustomResponseEntity.controller;

import java.util.Date;

public class ApiErrorResponse {

    private Date timestamp;
    private String msg;
    private int status;

    public ApiErrorResponse(Date timestamp, String msg, int status) {
        this.timestamp = timestamp;
        this.msg = msg;
        this.status = status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMsg() {
        return msg;
    }

    public int getStatus() {
        return status;
    }
}
