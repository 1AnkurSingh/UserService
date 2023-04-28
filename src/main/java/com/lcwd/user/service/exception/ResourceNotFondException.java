package com.lcwd.user.service.exception;

public class ResourceNotFondException extends RuntimeException{
    // extra pro
    public ResourceNotFondException(){
        super("Resource Not Fond on Server!!");
    }
    public ResourceNotFondException(String message){
        super(message);
    }
}
