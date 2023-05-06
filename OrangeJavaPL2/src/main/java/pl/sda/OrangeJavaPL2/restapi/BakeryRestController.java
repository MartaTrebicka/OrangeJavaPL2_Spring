package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.OrangeJavaPL2.entity.Bakery;
import pl.sda.OrangeJavaPL2.service.BakeryService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/bakeries")
@RequiredArgsConstructor
@Slf4j
public class BakeryRestController {

    private final BakeryService bakeryService;

    //localhost:8080/api/bakeries
    @GetMapping
    public List<Bakery> getAllBakeries() {
        return bakeryService.getAllBakeries();
    }

    //localhost:8080/api/bakeries/{id}
    @GetMapping(path = "/{id}")
public Bakery getBakeryById(@PathVariable Long id) {
        return bakeryService.getBakeryById(id);

    }

}
