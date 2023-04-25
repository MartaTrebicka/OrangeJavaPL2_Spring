package pl.sda.OrangeJavaPL2;

import org.assertj.core.util.Sets;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.entity.BreadType;

import java.math.BigDecimal;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootTest
class OrangeJavaPl2ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testTest() {

        Set<Bread> breads = Sets.set(
                new Bread("Bułka z budyniem", BreadType.SWEET, BigDecimal.valueOf(8.20)),
                new Bread("Bułka z budyniem", BreadType.SWEET, BigDecimal.valueOf(4.50)),
                new Bread("Bułka z budyniem", BreadType.SWEET, BigDecimal.valueOf(1.99)),
                new Bread("Kajzerka", BreadType.WHEAT, BigDecimal.valueOf(7.75)),
                new Bread("Kajzerka", BreadType.WHEAT, BigDecimal.valueOf(15.00)),
                new Bread("Kajzerka", BreadType.WHEAT, BigDecimal.valueOf(13.75)),
                new Bread("Kajzerka", BreadType.WHEAT, BigDecimal.valueOf(77.75)),
                new Bread("Kajzerka", BreadType.WHEAT, BigDecimal.valueOf(90.99))
        );
// Collection - List/Set/Queue



        // filtering kajzerki
        Set<Bread> kajzerkaBreads = breads.stream()
                .filter(bread -> bread.getName().equals("Kajzerka"))
                .collect(Collectors.toSet());

        System.out.println(kajzerkaBreads);
        System.out.println("..............................");

        //printing all kajzerka
        breads.stream()
                .filter(bread -> bread.getName().equals("Kajzerka"))
                .forEach(System.out::println);
        System.out.println("...............................");

        // printing all sweets
        Set<Bread> sweetBreads = breads.stream()
                .filter(b -> b.getBreadType().equals(BreadType.SWEET))
                .collect(Collectors.toSet())
                ;
        System.out.println(sweetBreads.size());

//        Set<Bread> expensiveBreads = breads
//                .stream()
//                .map(p -> p.getPrice())
//                .filter(p -> p > BigDecimal.valueOf(50))
//                .collect(Collectors.toSet());
//        System.out.println(expensiveBreads);
    }

    @Test
    void bigDecimalTest() {

        BigDecimal decimal = new BigDecimal(19.1234567890);
        BigDecimal bigDecimal = BigDecimal.valueOf(19.1234567890);

        System.out.println("..................new.................");
        System.out.println(decimal);
        System.out.println("................valueOf...............");
        System.out.println(bigDecimal);
    }
}
