package com.javaguides.mokitopracticeexample.mockio_integration;

import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class NotifierTest {
    @Test
    public void testNotifyUser() {
        Notifier mockNotifier = mock(Notifier.class);
        // Suppressing the method's behavior
        doNothing().when(mockNotifier).notifyUser(anyString());
        mockNotifier.notifyUser("Hello, User!");
        verify(mockNotifier).notifyUser("Hello, User!");
    }
}
