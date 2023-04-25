package pl.sda.OrangeJavaPL2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.OrangeJavaPL2.entity.Bread;

import java.math.BigDecimal;

public interface IBreadRepository extends JpaRepository<Bread, Long> {

    //NAZWA INTERFEJSU MOŻE BYĆ ZDEFINIOWANA RÓŻNIE.

    Bread findByName(String name);


    @Query(value = "UPDATE Bread SET name = :name, price = :price, bread_type = :type WHERE id = :id")
    @Modifying
    @Transactional
    void updateBread(@Param("id")Long id,
                     @Param("name") String name,
                     @Param("price") BigDecimal price,
                     @Param("type") String type);
// Select * from users where name = [Marta];
    // Select * from users where name = [AND 1=1; DROP users]; -> SQL Injection   DO HAKOWANIA (?)


    //  Custom query to more sophisticated queries
//@Query(value = "SELECT f FROM fruits where f.name = :name", nativeQuery = false)
//    List[Fruit] selectAllFruitsByProvidedName(@Param("name")String name);
}


// extends JpaRepository  <- tak też może być
// extends CrudRepository  <- tak też może być