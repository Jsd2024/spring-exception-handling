// Class to handle exceptions globally
package org.excp.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = UserNotPermittedException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public @ResponseBody ErrorResponse handleException(UserNotPermittedException ex) {
        return new ErrorResponse(HttpStatus.NOT_ACCEPTABLE.value(), ex.getMessage());
    }
// Adding exception handlers for NoSuchUserExistsException
// and NoSuchElementException.
//    @ExceptionHandler(value = UserNotPermittedException.class)
//    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
//    public ErrorResponse exceptionHandlingForAge(UserNotPermittedException ex) {
//        ErrorResponse errorResponse = new ErrorResponse();
//        errorResponse.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
//        errorResponse.setMessage(ex.getMessage());
//        return errorResponse;
//    }
//    @ExceptionHandler(value = Exception.class)
//    @ResponseStatus(HttpStatus.NOT_FOUND)
//    public ErrorResponse exceptionHandlingOthers(Exception ex) {
//        return new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
//    }
    }