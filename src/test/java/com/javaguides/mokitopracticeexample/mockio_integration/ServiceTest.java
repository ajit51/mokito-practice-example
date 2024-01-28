package com.javaguides.mokitopracticeexample.mockio_integration;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class ServiceTest {
    @Test
    public void mockServiceTest() {
        // Create a mock of the Service
        Service mockService = mock(Service.class);
        // Call greet method on mock
        mockService.greet("john");
        // Verify if greet method was called with the argument "John"
        verify(mockService).greet("john");
    }

    @Test
    public void stubServiceTest() {
        // Create a stub of the Service
        Service stubService = mock(Service.class);
        // Stub the greet method
        when(stubService.greet(anyString())).thenReturn("Hi there!");
        // Call greet method on stub
        String response = stubService.greet("john");
        System.out.println("response>>> " + response);
        // Assert that the stub returned the stubbed response
        assert (response.equals("Hi there!"));
    }
}
