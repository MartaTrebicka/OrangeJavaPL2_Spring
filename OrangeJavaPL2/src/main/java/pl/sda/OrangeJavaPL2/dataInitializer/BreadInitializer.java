package pl.sda.OrangeJavaPL2.dataInitializer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class BreadInitializer {

    private final BreadRepository breadRepository;
    @PostConstruct
    public void initBreads(){
        Bread bread = new Bread(1L, "Bagietka", 3.50);
        Bread bread1 = new Bread(2L, "Grahamka", 1.00);

        breadRepository.addBread(bread);
        breadRepository.addBread(bread1);
    }

}
