package com.lab2.dao.impl;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by rasmus on 4/21/16.
 */
public class DaoExceptions {

    @ResponseStatus(value= HttpStatus.NOT_FOUND, reason="Item could not be found")
    public static class CouldNotBeFoundException extends RuntimeException {}

    @ResponseStatus(value= HttpStatus.FORBIDDEN, reason="Item could not be updated")
    public static class CouldNotBeUpdatedException extends RuntimeException {}

    @ResponseStatus(value= HttpStatus.FORBIDDEN, reason="Item could not be added")
    public static class CouldNotBeAddedException extends RuntimeException {}
}
