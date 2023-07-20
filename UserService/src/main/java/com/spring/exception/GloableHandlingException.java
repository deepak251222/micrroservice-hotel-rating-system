package com.spring.exception;

public class GloableHandlingException extends  RuntimeException{


    public GloableHandlingException(String message){
        super(message);
    }
    public GloableHandlingException(){
        super("server not found Exception !@");
    }


}
