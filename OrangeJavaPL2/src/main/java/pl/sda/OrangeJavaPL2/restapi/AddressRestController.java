package pl.sda.OrangeJavaPL2.restapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.sda.OrangeJavaPL2.entity.Address;
import pl.sda.OrangeJavaPL2.repository.AddressRepository;

import java.util.Set;

// CONTROLER JEST ODPOWIEDZIALNY ZA KOMUNIKACJE I UDOSTEPNIANIE REST.API
@RestController
@RequestMapping(path = "/api")
@RequiredArgsConstructor
public class AddressRestController {

    private final AddressRepository addressRepository;


    @GetMapping(path = "/addresses")
    public Set<Address> getAllAddresses(){
        return addressRepository.getAllAddresses();
    }
    @PostMapping (path = "/addresses")
    public void addAddress(@RequestBody Address address){
        addressRepository.addAddress(address);
    }

        }
/*
ap/addresses -> Post - add resoures, Got - get all resources
 */
