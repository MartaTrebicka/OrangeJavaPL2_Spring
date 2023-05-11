package sda.testingadvanced.assertj;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import sda.testingadvanced.tdd.Calculator;

import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {

    @Test
    void whenAddTwoIntegersThenReturnsSumOfTheseIntegers() {  // metoda

        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.addTwoIntegers(2, 3);

        //then
        assertThat(result).isEqualTo(5);
    }


    @Test
    void whenSubstractionTwoIntegersThenReturnsSubstarctionOfTheseIntegers() {  // metoda

        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.substractTwoIntegers(18, 9);

        //then
        assertThat(result).isEqualTo(9);
    }
}
