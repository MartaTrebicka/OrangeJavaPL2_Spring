package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    private final BreadService breadService;  //breadRepository//  żeby tego na czerwono nie wywalalo trzeba dać adnotacje: @RequiredArgsConstructor

    // localhost: <port>/api/breads
    @GetMapping()

    public List<Bread> getAllBreads() {
        return breadService.getAllBreads();
    }

    @PostMapping()
    ResponseEntity addBread(@RequestBody Bread bread) {
        log.info("Adding new bread", bread);
        return breadService.addBread(bread);
    }
    // Controlles -> Services

    @DeleteMapping(path = "/{id}")  //    /api/breads/{id}      Controller -> Service -> Repository ->JPARepo -> H2 database
    public void deleteById(@PathVariable Long id) {
        breadService.deleteById(id);
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


    @GetMapping("/{id}")  // localhost:<port>/api/breads/30 -> get bread with id 30
    public Bread getBreadById (@PathVariable Long id) {
        log.info("Get a bread with ID: {}", id);
        return breadService.getBreadById(id)
                .orElseThrow(() -> new BreadNotFoundException("Bread with specified id does not exist"));
        //repo -> Optional<Bread>.  Service -> Optional<Bread>, Controller -> Bread or Exception - Exception Handler
        //repo -> Optional<Bread>.  Service -> Optional<Bread>, Controller -> Try/Catch(BreadNotFoundException) -> return Response ????
   // To expensive ??????
    }

//        if (breadService.getBreadById(id).equals(null)) {
//            throw new BreadNotFoundException("Bread not found ");
//        } else {
//            return breadService.getBreadById(id);
//        }



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