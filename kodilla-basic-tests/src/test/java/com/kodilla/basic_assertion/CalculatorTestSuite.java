package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 5;
        int c = -5;
        int d = 0;
        int sumResult = calculator.sum(a, b);
        assertEquals(10, sumResult);

        int subResult = calculator.subtract(a, b);
        assertEquals(0, subResult);

        int sqResult1 = calculator.square(a);
        assertEquals(25, sqResult1);

        int sqResult2 = calculator.square(c);
        assertEquals(25, sqResult2);

        int sqResult3 = calculator.square(d);
        assertEquals(0, sqResult3);

    }
}
