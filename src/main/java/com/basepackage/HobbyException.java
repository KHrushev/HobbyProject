package com.basepackage;

public class HobbyException extends Exception {

    HobbyException() { }

    public HobbyException(final String message) {
        super(message);
    }

    public HobbyException(final String message, final Exception cause) {
        super(message, cause);
    }
}
