package com.javaguides.mokitopracticeexample.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.Silent.class)
public class CalculatorTest {

    @Mock
    Calculator mockCalculator;

    @InjectMocks
    SimpleCalculator simpleCalculator;

    @Test
    public void testAddition() {
        // Mock the add method of mockCalculator
        when(mockCalculator.add(10, 20)).thenReturn(30);

        // Call the add method
        int result = simpleCalculator.add(10, 20);

        // Assert the result
        Assertions.assertEquals(30, result);
    }
}
