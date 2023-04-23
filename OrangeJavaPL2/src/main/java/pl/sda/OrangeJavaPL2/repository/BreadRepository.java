package pl.sda.OrangeJavaPL2.repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.sda.OrangeJavaPL2.entity.Bread;
import java.util.List;
@Repository
@RequiredArgsConstructor
public class BreadRepository {
    // to klasa ktora lączy projekt z JDRepository.
    //odpowiedzialna za komunikację z bazą danych

    private final IBreadRepository breadRepository;
    public List<Bread> getAllBreads(){
        return  breadRepository.findAll();
    }
    public void addBread(Bread bread) {
        breadRepository.save(bread);
    }

    public Bread getBreadByName(String name){
       return breadRepository.findByName(name);
    }
}