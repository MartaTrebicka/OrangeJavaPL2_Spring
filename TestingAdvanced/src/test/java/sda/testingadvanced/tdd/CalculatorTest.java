package sda.testingadvanced.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // KLASA TESTOWA JEST TYPU VOID !

    @Test
    void whenAddTwoIntegersThenReturnsSumOfTheseIntegers(){  // metoda

        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.addTwoIntegers(2,3);
        //then
        Assertions.assertEquals(5, result );
    }

    @Test
    void whenAnyComponentIsGreaterThan100ThenIllegalExceptionIsThrown(){  // metoda

        //given
        Calculator calculator = new Calculator();

        //then
      Assertions.assertThrows(IllegalArgumentException.class,
              () -> calculator.addTwoIntegers(101, 2));
    }


    @Test
    void whenComponentBIsGreaterThanAThenIllegalExceptionIsThrown(){  // metoda

        //given
        Calculator calculator = new Calculator();

        //then
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.substractTwoIntegers(3, 15));
    }
}
