package ru.itsjava.exceptions;

class AgeNotValidException extends RuntimeException {
    public AgeNotValidException(String message) {
        super(message);
    }
}
