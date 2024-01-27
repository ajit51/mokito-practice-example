package com.javaguides.mokitopracticeexample.BDDMockito;

import org.junit.jupiter.api.Test;
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
}
