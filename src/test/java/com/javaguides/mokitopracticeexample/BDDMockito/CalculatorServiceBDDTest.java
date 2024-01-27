package com.javaguides.mokitopracticeexample.BDDMockito;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;

public class CalculatorServiceBDDTest {
    @Test
    public void testMultiply() {
        // Given: Setting up the scenario
        CalculatorService mockCalculator = BDDMockito.mock(CalculatorService.class);
        // Using willAnswer() to provide a dynamic response
        BDDMockito.willAnswer(invocation -> {
            double agr1 = invocation.getArgument(0);
            double agr2 = invocation.getArgument(1);
            return agr1 * 2 + agr2 * 2;
        }).given(mockCalculator).multiply(ArgumentMatchers.anyDouble(), ArgumentMatchers.anyDouble());
        // When: Executing the action
        double result = mockCalculator.multiply(2, 3);
        // Then: Asserting the expected outcome
        System.out.println("Multiplication Result: " + result);
    }
}
