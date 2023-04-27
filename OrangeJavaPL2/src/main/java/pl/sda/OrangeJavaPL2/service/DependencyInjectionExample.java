package pl.sda.OrangeJavaPL2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.auditing.config.AuditingBeanDefinitionRegistrarSupport;
import org.springframework.stereotype.Service;
import pl.sda.OrangeJavaPL2.repository.AddressRepository;

@Service // = @Component = @Repository = @Bean
public class DependencyInjectionExample {

//    // Dependency injection example
//    @Autowired  // DI by field
//    AddressRepository addressRepository;
//
//    @Autowired // DI by constructor
//    public DependencyInjectionExample (AddressRepository addressRepository) {
//        this.addressRepository = addressRepository;
//    }
//@Autowired // DI by setter
//    public void  setAddressRepository(AddressRepository addressRepository){
//        this.addressRepository = addressRepository;
//    }
}
