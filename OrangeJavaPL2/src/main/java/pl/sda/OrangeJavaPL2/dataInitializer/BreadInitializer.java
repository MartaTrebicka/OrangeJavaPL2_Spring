package pl.sda.OrangeJavaPL2.dataInitializer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.entity.BreadType;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;

@Component
@RequiredArgsConstructor
public class BreadInitializer {

    private final BreadRepository breadRepository;
    @PostConstruct
    // @PreDestroy
    public void initBreads(){
        Bread bread = new Bread( "Bagietka", BreadType.WHEAT, BigDecimal.valueOf(3.50));
        Bread bread1 = new Bread( "Grahamka", BreadType.MULTIGRAIN,BigDecimal.valueOf(1.00));

        breadRepository.addBread(bread);
        breadRepository.addBread(bread1);
    }

}
