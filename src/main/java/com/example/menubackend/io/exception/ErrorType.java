package com.example.menubackend.io.exception;

public interface ErrorType {
    int getCode();
    String getMessage();
    int getHttpCode();
}
