package pl.sda.OrangeJavaPL2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.sda.OrangeJavaPL2.entity.Bread;

public interface IBreadRepository extends JpaRepository<Bread, Long> {

    //NAZWA INTERFEJSU MOŻE BYĆ ZDEFINIOWANA RÓŻNIE.

    Bread findByName(String name);
    //  Custom query to more sophisticated queries
//@Query(value = "SELECT f FROM fruits where f.name = :name", nativeQuery = false)
//    List[Fruit] selectAllFruitsByProvidedName(@Param("name")String name);
}


// extends JpaRepository  <- tak też może być
// extends CrudRepository  <- tak też może być