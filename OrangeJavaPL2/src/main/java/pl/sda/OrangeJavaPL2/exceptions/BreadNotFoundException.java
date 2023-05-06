package pl.sda.OrangeJavaPL2.exceptions;

public class BreadNotFoundException extends RuntimeException {

// custom exception = class extending RuntimeException

    public BreadNotFoundException(String message) {
        super(message);
    }
}

