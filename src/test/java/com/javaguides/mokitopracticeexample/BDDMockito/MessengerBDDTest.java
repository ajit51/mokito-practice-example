package com.javaguides.mokitopracticeexample.BDDMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.ArgumentMatchers.*;

import static org.mockito.BDDMockito.*;


public class MessengerBDDTest {
    @Test
    public void testSendMessage() {
        // Given: Creating the mock and setting up the scenario
        Messenger mockMessenger = mock(Messenger.class);
        given(mockMessenger.sendMessage(anyString(), anyString())).willReturn("Mocked Message");
        // When: Performing the action
        String result = mockMessenger.sendMessage("John", "Hello!");
        // Then: Verifying the mock interaction
        then(mockMessenger).should().sendMessage("John", "Hello!");
        Assertions.assertEquals("Mocked Message", result);
    }
}
