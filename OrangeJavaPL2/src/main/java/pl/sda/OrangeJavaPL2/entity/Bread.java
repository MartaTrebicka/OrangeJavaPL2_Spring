package pl.sda.OrangeJavaPL2.entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "breads")
public class Bread {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @Column(name = "price_in_pln")
    Double price;

    public Bread(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}