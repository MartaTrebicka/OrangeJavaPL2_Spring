//package pl.sda.OrangeJavaPL2.repository;
//
//import lombok.RequiredArgsConstructor;
//import pl.sda.OrangeJavaPL2.entity.Address;
//
//import java.util.Set;
//import java.util.stream.Collectors;
//
//@RequiredArgsConstructor
//public class AddressRepository {
//
//    IAddressRepository addressRepository;
//
//    public void addAddress(Address address){
//        addressRepository.save(address);
//    }
//
//    public Set<Address> getAllAddresses(){
//        return addressRepository.findAll()
//                .stream()
//                .collect(Collectors.toSet());
//    }
//}