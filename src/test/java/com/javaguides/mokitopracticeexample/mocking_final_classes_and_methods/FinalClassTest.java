package com.javaguides.mokitopracticeexample.mocking_final_classes_and_methods;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class FinalClassTest {
    @Test
    public void testMockingFinalMethod() {
        // Mocking the FinalClass
        FinalClass mockFinalClass = mock(FinalClass.class);
        // Mocking the behavior of the final method
        when(mockFinalClass.finalMethod()).thenReturn("Mocked Output");
        // Using the mock object
        String result = mockFinalClass.finalMethod();
        System.out.println(result);
        // Verifying the mocked method was called
        verify(mockFinalClass, times(1)).finalMethod();

    }
}
