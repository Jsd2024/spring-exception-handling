package org.excp.demo.exception;

public class UserNotPermittedException extends RuntimeException {
    String message ;
    public UserNotPermittedException(String message) {
        super(message);
        this.message = message;
    }
}
