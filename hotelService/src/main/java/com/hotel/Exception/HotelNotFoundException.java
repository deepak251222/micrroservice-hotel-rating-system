package com.hotel.Exception;

public class HotelNotFoundException extends RuntimeException {

    public HotelNotFoundException(String s) {
        super(s);
    }
    public HotelNotFoundException() {
        super();
    }
}
