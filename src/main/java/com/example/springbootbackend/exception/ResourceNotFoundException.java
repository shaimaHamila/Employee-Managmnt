package com.example.springbootbackend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//We use this custom exception so whenever a record not exist in database then rest api will throw this exception, and we have to annotate this exception with address response status annotation so api will return a not found status to the client
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException  extends RuntimeException{
    public static final long serialVersionUID = 1L;

    public ResourceNotFoundException(String message){
        super(message);
    }
}
