package pl.sda.OrangeJavaPL2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.auditing.config.AuditingBeanDefinitionRegistrarSupport;
import org.springframework.stereotype.Service;
import pl.sda.OrangeJavaPL2.repository.AddressRepository;

@Service // = @Component = @Repository = @Bean
//@Scope(value = "prototype") // changing default scope of bean
public class DependencyInjectionExample {

    // IoC Container -> beany
//    // Dependency injection example

    //3 sposoby wtrzykiwania:
//    1. @Autowired  // DI by field (przez pole)
//    AddressRepository addressRepository;
//
//  2.   @Autowired // DI by constructor
//    public DependencyInjectionExample (AddressRepository addressRepository) {
//        this.addressRepository = addressRepository;
//    }
//  3.    @Autowired // DI by setter
//    public void  setAddressRepository(AddressRepository addressRepository){
//        this.addressRepository = addressRepository;
//    }
}
