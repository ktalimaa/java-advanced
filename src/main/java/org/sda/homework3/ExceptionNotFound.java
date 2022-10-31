package org.sda.homework3;

public class ExceptionNotFound extends Exception {

    public ExceptionNotFound(String sentence) {
        super(String.format("Hey! That's not a value! Try one more time!", sentence));
    }

    public ExceptionNotFound() {
    }
}
