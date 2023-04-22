package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;
import pl.sda.OrangeJavaPL2.service.BreadService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/breads")
@RequiredArgsConstructor
public class BreadRestController {

    private final BreadService breadService;  //breadRepository//  żeby tego na czerwono nie wywalalo trzeba dać adnotacje: @RequiredArgsConstructor

    // localhost: <port>/api/breads
    @GetMapping()
    public List<Bread> getAllBreads() {
        return breadService.getAllBreads();

    }

    // Controlles -> Services


//PostMapping without mapping error codes returrning to client
//    @PostMapping()
//    void addBread(@RequestBody Bread bread) {  // @RequestBody to map do bread
//        breadRepository.addBread(bread);
//
//    }

//    @PostMapping()
//    ResponseEntity addBread(@RequestBody Bread bread) {  // @RequestBody to map do bread
//        BreadService.addBread(bread);
//        return ResponseEntity
//                .status(201)
//        .build();
//}
}
// example: localhost:<port>/api/breads
// DI - implementacja IOC