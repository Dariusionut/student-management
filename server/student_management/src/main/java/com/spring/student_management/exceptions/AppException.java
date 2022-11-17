package com.spring.student_management.exceptions;

/**
 * Created at 11/12/2022 by Darius
 **/
public class AppException extends Exception {
    private static final long serialVersionUID = -8390868795553694825L;
    public AppException(Exception e) {
        super(e);
    }
    public AppException(String errorMsg) {
        super(errorMsg);
    }
}
