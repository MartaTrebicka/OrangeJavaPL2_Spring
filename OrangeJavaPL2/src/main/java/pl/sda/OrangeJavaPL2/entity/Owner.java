package pl.sda.OrangeJavaPL2.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Owner {

    String firstName; // -> by deafult in db = firstname ???
    String lastName;
    int age;
}
