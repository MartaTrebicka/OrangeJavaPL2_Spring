package sda.testingadvanced.tdd;

import org.junit.jupiter.api.*;

public class CalculatorTest {

    // KLASA TESTOWA JEST TYPU VOID !

    //  @BeforeAll - run one time before first test
    //  @AfterAll - run one time after last test
    //  @AfterEach - run after each test
    //  @BeforeEach - run before each test

    Calculator calculator;
    @BeforeEach
    void createCalculator(){
        calculator = new Calculator();

    }
    @Test
    void whenAddTwoIntegersThenReturnsSumOfTheseIntegers() {  // metoda

        //given
       // Calculator calculator = new Calculator();  // tego nie trzeba już bo w @BeforeEach daliśmy calculator
        //when
        int result = calculator.addTwoIntegers(2, 3);
        //then
        Assertions.assertEquals(5, result);
    }

    @Test
    void whenAnyComponentIsGreaterThan100ThenIllegalExceptionIsThrown() {  // metoda

        //given
       // Calculator calculator = new Calculator(); // tego nie trzeba już bo w @BeforeEach daliśmy calculator

        //then
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.addTwoIntegers(101, 2));
    }


    @Test
    void whenComponentBIsGreaterThanAThenIllegalExceptionIsThrown() {  // metoda

        //given
       // Calculator calculator = new Calculator(); // tego nie trzeba już bo w @BeforeEach daliśmy calculator

        //then
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.substractTwoIntegers(3, 15));
    }
}
