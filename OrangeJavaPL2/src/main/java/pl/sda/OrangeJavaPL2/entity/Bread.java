package pl.sda.OrangeJavaPL2.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
@Entity   // data base entity -object to map
@Setter   // REQUIRED FOR ENTITY
@Getter   // REQUIRED FOR ENTITY
@NoArgsConstructor  // REQUIRED FOR ENTITY
@AllArgsConstructor
@Table(name= "breads")  // TO ŻEBY TABELA NIE NAZYWAŁA SIĘ TAK SAMO JAK KLASA / CHANGE DEFAULT NAME TO CUSTOM ONE
public class Bread {

    @Id  // REQUIRED FOR ENTITY
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // AUTOINCREMENT ID WITH EVERY SINGLE OBJECT
    Long id;
    String name;
    @Column(name = "price_in_pln")  // CHANGE DEFAULT NAME TO CUSTOM ONE
    Double price;

    public Bread(String name, Double price) {  // KONSTRUKTOR / EVERY SINGLE FIELD INCLUDED EXCEPT ID
        this.name = name;
        this.price = price;
    }
}