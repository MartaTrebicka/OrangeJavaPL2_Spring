package sda.testingadvanced.tdd;

public class Calculator {
    public int addTwoIntegers(int a, int b) {

        if (a > 100 || b > 100){
            throw new IllegalArgumentException(" Your number is too big");
        }
        return a+b;
    }

    public int substractTwoIntegers(int a, int b) {
        if (a < b) {
            throw new IllegalArgumentException("A has to be bigger then B");
        }
        return a - b;
    }
}
