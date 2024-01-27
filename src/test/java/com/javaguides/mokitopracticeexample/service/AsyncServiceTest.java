package com.javaguides.mokitopracticeexample.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class AsyncServiceTest {
    @Test
    public void testTimeout() throws InterruptedException {
        // Create a mock of AsyncService
        AsyncService mockSsyncService = Mockito.mock(AsyncService.class);
        // Invoke the method
        mockSsyncService.asyncMethod();
        // Verify that the method was called within 100 milliseconds
        Mockito.verify(mockSsyncService, Mockito.timeout(100)).asyncMethod();
    }
}
