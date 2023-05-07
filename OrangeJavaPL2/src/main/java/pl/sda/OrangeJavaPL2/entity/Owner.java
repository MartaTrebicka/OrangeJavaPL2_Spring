package pl.sda.OrangeJavaPL2.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
//@AllArgsConstructor
@NoArgsConstructor
public class Owner {

    String firstName; // -> by deafult in db = firstname ???
    String lastName;
    int age;

    public Owner(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
