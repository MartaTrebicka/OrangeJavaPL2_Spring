package pl.sda.OrangeJavaPL2.entity;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity   // database entity -object to map
@Setter   // REQUIRED FOR ENTITY
@Getter   // REQUIRED FOR ENTITY
@NoArgsConstructor  // REQUIRED FOR ENTITY
@AllArgsConstructor
@ToString
@Table(name= "breads")  // TO ŻEBY TABELA NIE NAZYWAŁA SIĘ TAK SAMO JAK KLASA / CHANGE DEFAULT NAME TO CUSTOM ONE
public class Bread {


    @Id // Required for entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Autoincrement id with every single object
    Long id;
    String name;
    @Enumerated(EnumType.STRING)
    BreadType breadType;
    @Column(name = "price_in_pln") // Change default name to custom one
    BigDecimal price;

    public Bread(String name, BreadType breadType, BigDecimal price) {   //  KONSTRUKTOR / EVERY SINGLE FIELD INCLUDED EXCEPT ID
        this.name = name;
        this.breadType = breadType;
        this.price = price;
    }
}

//
//
//
//