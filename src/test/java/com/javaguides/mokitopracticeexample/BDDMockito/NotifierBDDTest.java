package com.javaguides.mokitopracticeexample.BDDMockito;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

public class NotifierBDDTest {
    @Test
    public void testNotifyUser() {
        // Given: Set up the mock and the scenario
        Notifier mockNotifier = BDDMockito.mock(Notifier.class);
        BDDMockito.given(mockNotifier.notifyUser(BDDMockito.anyString(), BDDMockito.anyString())).willReturn("Mocked Notification");
        // When: We take an action
        String result = mockNotifier.notifyUser("Alice", "You have a new message!");
        // Then: Verify the interaction with the mock
        BDDMockito.then(mockNotifier).should().notifyUser(BDDMockito.anyString(), BDDMockito.anyString());
        Assertions.assertEquals("Mocked Notification", result);
    }
}
