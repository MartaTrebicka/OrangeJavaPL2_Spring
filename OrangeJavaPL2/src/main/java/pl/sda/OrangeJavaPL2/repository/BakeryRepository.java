package pl.sda.OrangeJavaPL2.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.OrangeJavaPL2.entity.Bakery;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class BakeryRepository  {
    private final IBakeryRepository bakeryRepository;

    public List<Bakery> getAllBakeries() {
        return bakeryRepository.findAll();
    }

    public void saveBakery(Bakery bakery) {
        bakeryRepository.save(bakery);
    }

    public Optional<Bakery> getBakeryById(Long id) {
        return  bakeryRepository.findById(id);
    }
}
