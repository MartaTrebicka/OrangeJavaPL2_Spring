package pl.sda.OrangeJavaPL2.restapi;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Profile("dev") // Runs with specific profile
@RestController
public class CustomRestControllerDev {


    @GetMapping("/hello")
    public String helloDev(){
        return "Hello ByczQ from Dev";
    }


}
