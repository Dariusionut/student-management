package com.spring.student_management.exceptions;

/**
 * Created at 11/14/2022 by Darius
 **/
public class AddressTypeNotFoundException extends Exception {
    public AddressTypeNotFoundException(long addressTypeUser) {
        super(String.format("Address type with id %s not found!", addressTypeUser));
    }
}
