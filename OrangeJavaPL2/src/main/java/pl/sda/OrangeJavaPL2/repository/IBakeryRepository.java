package pl.sda.OrangeJavaPL2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.OrangeJavaPL2.entity.Bakery;

public interface IBakeryRepository extends JpaRepository<Bakery, Long> {
}
