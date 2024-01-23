package com.javaguides.mokitopracticeexample.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotificationServiceTest {
    @Test
    public void sendNotificationTest() {
        // Create a mock of NotificationService
        NotificationService mockService = Mockito.mock(NotificationService.class);
        // Call the mocked method
        mockService.sendNotification("Hello", "John");
        // Use verify() to ensure the method was called with the right parameters
        Mockito.verify(mockService).sendNotification("Hello", "John");
    }
}
