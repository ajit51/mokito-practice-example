package com.javaguides.mokitopracticeexample.service1;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class CalculatorTest {
    @Test
    public void testDoReturn() {
        // Generate a mock of Calculator
        Calculator mockCalculator = Mockito.mock(Calculator.class);
        // Use doReturn to stub the add method
        Mockito.doReturn(5).when(mockCalculator).add(2, 3);
        // Execute the printSum method
        mockCalculator.add(2, 3);
        // Verify if the stubbed method was called
        Mockito.verify(mockCalculator).add(2, 3);
    }
}
