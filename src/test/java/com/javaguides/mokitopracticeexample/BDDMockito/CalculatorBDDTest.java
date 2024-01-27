package com.javaguides.mokitopracticeexample.BDDMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;

public class CalculatorBDDTest {
    @Test
    public void testCalculatorAdd() {
        // Given: Setup the test scenario
        Calculator mockCalculator = BDDMockito.mock(Calculator.class);
        BDDMockito.given(mockCalculator.add(10.0, 20.0)).willReturn(30.0);
        // When: Execute the actual behavior
        double result = mockCalculator.add(10.0, 20.0);
        // Then: Verify the expected outcome
        BDDMockito.then(mockCalculator).should(BDDMockito.times(1)).add(10.0, 20.0);
        System.out.println(result);

    }

    @Test
    public void testAddMethod() {
        // Given: Creating the mock and setting up the scenario
        Calculator mockCalculator = BDDMockito.mock(Calculator.class);
        // Mocking subtract while letting add execute its real implementation
        BDDMockito.given(mockCalculator.subtract(ArgumentMatchers.anyDouble(), ArgumentMatchers.anyDouble())).willReturn(0.0);
        BDDMockito.willCallRealMethod().given(mockCalculator).add(ArgumentMatchers.anyDouble(), ArgumentMatchers.anyDouble());
        // When: Performing the actions
        double result = mockCalculator.add(3.0, 4.0);
        // Then: Verifying the results
        Assertions.assertEquals(7.0, result);
    }
}
