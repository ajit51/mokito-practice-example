package com.javaguides.mokitopracticeexample.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class LoggerServiceTest {
    @Test
    public void logMessageTest() {
        // Generate a mock of LoggerService
        LoggerService mockLoggerService = mock(LoggerService.class);
        // Invoke the mocked method multiple times
        mockLoggerService.logMessage(anyString());
        mockLoggerService.logMessage(anyString());
        mockLoggerService.logMessage(anyString());
        // Use verify() along with times() to confirm the number of invocations
        verify(mockLoggerService, times(3)).logMessage(anyString());
    }
}
