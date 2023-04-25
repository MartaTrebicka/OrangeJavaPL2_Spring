package pl.sda.OrangeJavaPL2.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Owner {

    String firstName;
    String lastName;
    int age;
}
