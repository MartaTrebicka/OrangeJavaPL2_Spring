package pl.sda.OrangeJavaPL2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name ="addresses")

public class Address {

// encja - obiekt bazodanowy
    // bezparametrowy konstruktor musi byc !!!!
    // gettery i settery musza byc !!!
    //  @Id  musi być !!!!



       @Id   // primary key
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String number;
    String postalCode;
    String country;

    //all fields except id
    public Address(String name, String number, String postalCode, String country) {
        this.name = name;
        this.number = number;
        this.postalCode = postalCode;
        this.country = country;
    }
}
