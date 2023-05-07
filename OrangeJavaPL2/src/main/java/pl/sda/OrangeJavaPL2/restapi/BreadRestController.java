package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.exceptions.BreadNotFoundException;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;
import pl.sda.OrangeJavaPL2.service.BreadService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/breads")
@RequiredArgsConstructor
@Slf4j
public class BreadRestController {

    private final BreadService breadService;

    // example:    localhost:<port>/api/breads
    @Secured(value = "admin")
    @GetMapping()
    public ResponseEntity<List<Bread>> getAllBreads() {
        log.info("Getting all available breads");
        return ResponseEntity
                .status(200)
                .header("eluwina", "byku")
                .body(breadService.getAllBreads());

    }


    /*
    Request - client (on go wysyła) - Postman/Browser(Mozilla/Chrome/Safari) / header in request headers
    Response - Server - Springboot application - header in Response Entity
     */

    @GetMapping("/{id}") //localhost:<port>/api/breads/30 -> get bread with id of 30
    public ResponseEntity getBreadById(@PathVariable Long id) {
        log.info("Get a bread with id: {}", id);
        return ResponseEntity
                .status(200)
                .body(breadService.getBreadById(id)
                        .orElseThrow(()-> new BreadNotFoundException("Bread with specified id does not exist")));
        //repo - Optional<Bread>, Service - Optional<Bread>, Controller - Bread or Exception - Exception Handler
        //repo - Optional<Bread>, Service - Optional<Bread>, Controller - Try/Catch(BreadNotFoundException) -> return ResponseEntity
    }


    //PostMapping without mapping error codes returning to client
//    @PostMapping()
//    void addBread(@RequestBody Bread bread) { // @RequestBody to map to bread
//        breadRepository.addBread(bread);
//    } //
    @PostMapping()
    ResponseEntity addBread(@RequestBody Bread bread) {
        log.info("Adding new bread: ", bread);
        return breadService.addBread(bread);

    }

    @DeleteMapping(path = "/{id}")//    /api/breads/{id}   Controller -> Service -> Repository -> JPARepo -> H2 database
    public ResponseEntity deleteBreadById(@PathVariable Long id) {
        log.info("Deleting bread with id: ", id);
        breadService.deleteBreadById(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity updateBread(@PathVariable Long id, @RequestBody Bread bread) {
        breadService.updateBread(id, bread.getName(), bread.getPrice(), bread.getBreadType().toString());
        log.info("Updating bread with id: {}", id);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
//                .status(202)// the same as above
                .build();
    }
}


// example: localhost:<port>/api/breads
// DI - implementacja IOC