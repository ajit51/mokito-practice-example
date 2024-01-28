package com.javaguides.mokitopracticeexample.mockio_integration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CalculatorTest {
    private Calculator mockCalculator;

    @BeforeEach
    public void setUp() {
        mockCalculator = mock(Calculator.class);
        when(mockCalculator.add(1.0, 1.0)).thenReturn(2.0);
        when(mockCalculator.subtract(2.0, 1.0)).thenReturn(1.0);
    }

    @Test
    public void testAddition() {
        assertEquals(2.0, mockCalculator.add(1.0, 1.0));
        verify(mockCalculator).add(1.0, 1.0);
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, mockCalculator.subtract(2.0, 1.0));
        verify(mockCalculator).subtract(2.0, 1.0);
    }
}
