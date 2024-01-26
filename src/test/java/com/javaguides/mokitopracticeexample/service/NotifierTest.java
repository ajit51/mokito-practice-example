package com.javaguides.mokitopracticeexample.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class NotifierTest {
    @Test
    public void testDoThrow() {
        // Generate a mock of Notifier
        Notifier mockNotifier = Mockito.mock(Notifier.class);
        // Use doThrow to simulate an exception when notify method is called
        Mockito.doThrow(new RuntimeException("Notification Error")).when(mockNotifier).notify("Test Message");
        // Assert that an exception is thrown when calling the notify method on the mock
        Assertions.assertThrows(RuntimeException.class, () -> mockNotifier.notify("Test Message"));
    }
}
