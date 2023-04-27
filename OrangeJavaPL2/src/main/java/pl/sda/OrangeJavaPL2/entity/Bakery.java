package pl.sda.OrangeJavaPL2.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter

public class Bakery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id; // pole typu long

    @OneToMany(cascade = CascadeType.ALL)
    List<Bread> breadList;

    @OneToOne(cascade = CascadeType.ALL)
    Address address;

    @Embedded
    Owner owner;
}
