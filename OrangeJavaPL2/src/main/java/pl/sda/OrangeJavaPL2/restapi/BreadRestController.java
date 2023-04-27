package pl.sda.OrangeJavaPL2.restapi;

import ch.qos.logback.classic.Logger;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
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
    private Logger log;  // ?????????????????

    // localhost: <port>/api/breads

    @GetMapping()
    public ResponseEntity<List<Bread>> getAllBreads() {

        log.info("Getting all available breads");
        return ResponseEntity
                .status(200)
                .header("eluwina", "byku")
                .body(breadService.getAllBreads());

    }
//    @GetMapping()
//    public List<Bread> getAllBreads() {
//        return breadService.getAllBreads();
//    }

    @PostMapping()
    ResponseEntity addBread(@RequestBody Bread bread)
    { log.info("Adding new bread: ", bread);
        return breadService.addBread(bread);}
    // Controlles -> Services

//    @DeleteMapping(path = "/{id}")  //    /api/breads/{id}      Controller -> Service -> Repository ->JPARepo -> H2 database
//    public ResponseEntity deleteBreadById(@PathVariable Long id) {
//       log.info("Deleting bread with id: ", id);
//        breadService.deleteBreadById(id);
//        return ResponseEntity
//                .status(HttpStatus.NO_CONTENT)
//                .build();
//    }

    @DeleteMapping(path = "/{id}")//    /api/breads/{id}   Controller -> Service -> Repository -> JPARepo -> H2 database
    public ResponseEntity deleteBreadById(@PathVariable Long id) {
        log.info("Deleting bread with id: ", id);
        breadService.deleteBreadById(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }
    @PutMapping(path = "/{id}")
public  ResponseEntity updateBread( @PathVariable Long id, @RequestBody Bread bread) {
        breadService.updateBread(id, bread.getName(), bread.getPrice(), bread.getBreadType().toString());
        log.info("Updating bread with id: ", id);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
//                .status(202)// the same as above
                .build();
    }
//        return ResponseEntity
//                .status(HttpStatus.ACCEPTED);
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

// example: localhost:<port>/api/breads
// DI - implementacja IOC