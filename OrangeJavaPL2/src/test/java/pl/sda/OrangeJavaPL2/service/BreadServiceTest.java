package pl.sda.OrangeJavaPL2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import pl.sda.OrangeJavaPL2.entity.Bread;
import pl.sda.OrangeJavaPL2.entity.BreadType;
import pl.sda.OrangeJavaPL2.repository.BreadRepository;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class BreadServiceTest {

    @Mock
    BreadRepository breadRepository;

    @InjectMocks
    BreadService breadService;
    @Test
    void getAllBreads() {
        Bread bread = new Bread(1L, "Pytlowy", BreadType.DRY, BigDecimal.ONE);
        Bread bread1 = new Bread(2L, "Kajzerka", BreadType.WHEAT, BigDecimal.TEN);
        Mockito.when(breadRepository.getAllBreads()).thenReturn(List.of(bread, bread1));

        Assertions.assertEquals(breadService.getAllBreads(),List.of(bread,bread1));
    }
}