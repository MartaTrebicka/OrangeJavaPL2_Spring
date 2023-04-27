package pl.sda.OrangeJavaPL2.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name ="addresses")

public class Address {


    @Id   // primary key
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String number;
    String postalCode;
    String country;

    public Address(String name, String number, String postalCode, String country) {
        this.name = name;
        this.number = number;
        this.postalCode = postalCode;
        this.country = country;
    }
}
