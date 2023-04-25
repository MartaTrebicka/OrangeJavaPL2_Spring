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

    @PostMapping()
    ResponseEntity addBread(@RequestBody Bread bread) {return breadService.addBread(bread);}
    // Controlles -> Services

    @DeleteMapping(path = "/{id}")  //    /api/breads/{id}      Controller -> Service -> Repository ->JPARepo -> H2 database
    public void deleteById(@PathVariable Long id) {
        breadService.deleteById(id);
    }

    @PutMapping(path = "/{id}")
public void updateBread(@PathVariable Long id, @RequestBody Bread bread) {
        breadService.updateBread(id, bread.getName(), bread.getPrice(), bread.getType());
    }
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