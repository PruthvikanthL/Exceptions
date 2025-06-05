package com.rcb.resturent.exception;

public class InvalidBookingDateException extends Exception{
    public InvalidBookingDateException(String message){
        super(message);
    }
}
