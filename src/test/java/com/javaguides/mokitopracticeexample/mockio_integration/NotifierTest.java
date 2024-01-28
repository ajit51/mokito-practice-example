package com.javaguides.mokitopracticeexample.mockio_integration;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class NotifierTest {

    private final Logger logger = LoggerFactory.getLogger(NotifierTest.class);

    @Test
    public void testNotifyUser() {
        Notifier mockNotifier = mock(Notifier.class);
        // Suppressing the method's behavior
        doNothing().when(mockNotifier).notifyUser(anyString());
        mockNotifier.notifyUser("Hello, User!");
        verify(mockNotifier).notifyUser("Hello, User!");
    }

    @Test
    public void testMockingVoidMethod() {
        // Mocking the Notifier
        Notifier mockNotifier = mock(Notifier.class);
        // Use Mockito to mock behavior of void method
        doThrow(new IllegalArgumentException()).when(mockNotifier).notifyUser("Bad Message");
        // Test with a valid message
        mockNotifier.notifyUser("Good Message");
        // Test with a bad message, expecting an exception
        try {
            mockNotifier.notifyUser("Bad Message");
        } catch (IllegalArgumentException e) {
            logger.info("Caught expected exception: " + e.getMessage());
        }
        // Verify the interactions
        verify(mockNotifier, times(1)).notifyUser("Good Message");
        verify(mockNotifier, times(1)).notifyUser("Bad Message");
    }
}
