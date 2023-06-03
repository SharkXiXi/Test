package org.IT.Entity;

public class apiResponse<T> {

    private int status;
    private String message;
    private T data;

    public apiResponse() {}

    public apiResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }
}