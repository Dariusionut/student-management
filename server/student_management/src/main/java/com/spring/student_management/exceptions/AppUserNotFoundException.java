package com.spring.student_management.exceptions;

/**
 * Created at 11/13/2022 by Darius
 **/
public class AppUserNotFoundException extends Exception {
    private static final long serialVersionUID = -9074585320995545787L;
    public AppUserNotFoundException(long id) {
        super(String.format("AppUser with id %d not found!", id));
    }
    public AppUserNotFoundException(String usernameOrEmail) {
        super(String.format("AppUser with usernameOrEmail %s not found!", usernameOrEmail));
    }

}
