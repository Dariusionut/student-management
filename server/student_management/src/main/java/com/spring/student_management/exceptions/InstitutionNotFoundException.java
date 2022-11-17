package com.spring.student_management.exceptions;

/**
 * Created at 11/13/2022 by Darius
 **/
public class InstitutionNotFoundException extends Exception {
    private static final long serialVersionUID = -4926783683245434228L;
    public InstitutionNotFoundException(long id) {
        super(String.format("Cannot find institution with id %d", id));
    }
}
