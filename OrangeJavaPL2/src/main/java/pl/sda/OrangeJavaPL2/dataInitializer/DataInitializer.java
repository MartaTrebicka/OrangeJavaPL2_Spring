package pl.sda.OrangeJavaPL2.dataInitializer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import pl.sda.OrangeJavaPL2.entity.*;
import pl.sda.OrangeJavaPL2.repository.AddressRepository;
import pl.sda.OrangeJavaPL2.repository.BakeryRepository;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;
import pl.sda.OrangeJavaPL2.service.AddressService;
import pl.sda.OrangeJavaPL2.service.BakeryService;
import pl.sda.OrangeJavaPL2.service.BreadService;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class DataInitializer {

    private final BreadService breadService;
    private final BakeryService bakeryService;
    private final AddressService addressService;

    @PostConstruct
    public void initData() {

        initAddresses();
        initBreads();
        initBakeries();
    }

    private void initBakeries() {
       // List<Bread> breadList = new ArrayList<>();
        Bread bread = new Bread("Bagietka", BreadType.WHEAT, BigDecimal.valueOf(3.50));
        Bread bread1 = new Bread("Grahamka", BreadType.MULTIGRAIN, BigDecimal.valueOf(1.00));
      //  breadList.add(bread);
       // breadList.add(bread1);

        Address address = new Address("Piłsudkiego", "10", "10-100", "Polska");

        Bakery bakery = new Bakery (
                Arrays.asList(bread, bread1),
                address,
                new Owner("Leyla", "Siaka", 34));

        Bakery bakery1 = new Bakery (
                Arrays.asList(bread, bread1),
                address,
                new Owner("Anna", "Packa", 25));

        bakeryService.saveBakery(bakery);
       // bakeryService.saveBakery(bakery1);

    }

    private void initAddresses () {
        Address address = new Address("Piłsudkiego", "10", "10-100", "Polska");
        Address address1 = new Address("Zwolska", "15", "12-125", "Polandia");

           addressService.addAddress(address);
            addressService.addAddress(address1);
        }


    // @PreDestroy // -> close db connection
    @PostConstruct // init -> open db connection
    // @EventListener(ApplicationReadyEvent.class) == @PostConstruct
    public void initBreads() {
        Bread bread = new Bread("Bagietka", BreadType.WHEAT, BigDecimal.valueOf(3.50));
        Bread bread1 = new Bread("Grahamka", BreadType.MULTIGRAIN, BigDecimal.valueOf(1.00));

        breadService.addBread(bread);
        breadService.addBread(bread1);

        //Single Responsibility Principal -> (jedna klasa pełni jedną funkcję) ->
        //        - RestController -> exposing
        //        - Service -> business logic
        //        - Repository -> DAO/Access to DB
    }

}
