package pl.sda.OrangeJavaPL2.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController //bean definition
public class DefaultRestController {

    @GetMapping("/hello")
    // @RequestMapping(method = RequestMethod.GET, path = "/hello") // Both mappings do the same job
    public String hello() { return "hello Ty from the hell";}
}
