package com.spring.student_management.exceptions;

/**
 * Created at 11/14/2022 by Darius
 **/
public class AddressNotFoundException extends Exception {
    public AddressNotFoundException(long addressId) {
        super(String.format("Address with id %d not found!", addressId));
    }
}
