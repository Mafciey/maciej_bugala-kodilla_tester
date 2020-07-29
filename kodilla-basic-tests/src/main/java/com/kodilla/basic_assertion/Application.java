package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 5;
        int sumResult = calculator.sum(a, b);
        int subResult = calculator.subtract(a, b);
        int sqResult = calculator.square(a);
        boolean correctSq = ResultChecker.assertEquals(25,sqResult);
        boolean correctSub = ResultChecker.assertEquals(0, subResult);
        boolean correct = ResultChecker.assertEquals(10, sumResult);
        if (correct) {
            System.out.println("Metoda dziala poprawnie");
        } else {
            System.out.println("Metoda nie dziala poprawnie");
        }

        if (correctSub) {
            System.out.println("Metoda dziala poprawnie");
        } else {
            System.out.println("Metoda nie dziala poprawnie");
        }
        if (correctSq) {
            System.out.println("Metoda dziala poprawnie");
        } else {
            System.out.println("Metoda nie dziala poprawnie");
        }
    }
}
