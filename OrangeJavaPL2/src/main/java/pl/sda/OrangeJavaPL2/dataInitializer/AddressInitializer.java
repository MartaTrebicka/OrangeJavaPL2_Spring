//package pl.sda.OrangeJavaPL2.dataInitializer;
//
//import org.springframework.stereotype.Component;
//import pl.sda.OrangeJavaPL2.entity.Address;
//import pl.sda.OrangeJavaPL2.repository.AddressRepository;
////import pl.sda.OrangeJavaPL2.repository.IAddressRepository;
//
//
//import javax.annotation.PostConstruct;
//
//@Component
//public class AddressInitializer {
//
//    private AddressRepository addressRepository;
//
//    @PostConstruct
//   public void initAddresses(){
//        Address address = new Address("Piłsudkiego", "10", "10-100", "Polska");
//        Address address2 = new Address("Zwolska", "15", "12-125", "Polandia");
//
//       addressRepository.addAddress(address);
//        addressRepository.addAddress(address2);
//    }
//}
