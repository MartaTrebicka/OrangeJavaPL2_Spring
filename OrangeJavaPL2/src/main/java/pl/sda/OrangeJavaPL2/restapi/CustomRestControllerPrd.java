package pl.sda.OrangeJavaPL2.restapi;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Profile("prd")
@RestController
public class CustomRestControllerPrd {


    @GetMapping("/hello")
    public String helloDev(){
        return "Hello ByczQ from Prd";
    }


}
