package pl.sda.OrangeJavaPL2.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyFirstRestController {
@GetMapping(path = "/hello-world")
    public String hello(){
        return "Hello World";
    }
}
