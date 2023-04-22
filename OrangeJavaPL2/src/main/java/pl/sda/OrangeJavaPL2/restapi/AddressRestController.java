//package pl.sda.OrangeJavaPL2.restapi;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import pl.sda.OrangeJavaPL2.entity.Address;
//import pl.sda.OrangeJavaPL2.repository.AddressRepository;
//
//import java.util.Set;
//
//@RestController
//@RequestMapping(path = "/api")
//@RequiredArgsConstructor
//public class AddressRestController {
//
//    AddressRepository addressRepository;
//
//    @GetMapping(path = "/addresses")
//    public Set<Address> getAllAddresses(){
//        return addressRepository.getAllAddresses();
//    }
//
//}
