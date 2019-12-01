package com.example;

class StatusCodeImplementation implements IStatusCode {
    private int code;

    public StatusCodeImplementation(int code) {
        this.code = code;
    }

    public int getStatusCode() {
        return code;
    }
}
