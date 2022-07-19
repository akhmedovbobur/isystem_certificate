package com.example.certificate.exception;

public class BadRequest extends RuntimeException {

    public BadRequest(String message){
        super(message);
    }
}
