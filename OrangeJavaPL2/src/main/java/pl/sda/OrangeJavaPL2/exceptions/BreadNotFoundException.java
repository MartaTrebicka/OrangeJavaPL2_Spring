package pl.sda.OrangeJavaPL2.exceptions;

public class BreadNotFoundException extends RuntimeException {

    public BreadNotFoundException() {
    }

    public BreadNotFoundException(String message) {
        super(message);
    }
}

