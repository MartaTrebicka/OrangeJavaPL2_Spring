package pl.sda.OrangeJavaPL2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class BakeryGlobalExceptionHandler {
    //to catch exceptions and return specific response status if
    // exception will be thrown
    @ResponseBody
    @ExceptionHandler(BreadNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String breadNotFoundExceptionHandler(BreadNotFoundException exception) {
        return exception.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(BakeryNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String BakeryNotFoundExceptionHandler(BakeryNotFoundException exception) {
        return exception.getMessage();
    }


    @ResponseBody
    @ExceptionHandler(AddressNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String AddressNotFoundExceptionHandler(AddressNotFoundException exception) {
        return exception.getMessage();
    }
}
// @ResponseBody
// @ ExceptionHandler(TooExpensiveBreadException.class)
//@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)