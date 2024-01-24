package com.javaguides.mokitopracticeexample.service1;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class UserServiceTest {
    @Test
    public void addUserTest() {
        // Create a mock of UserService
        UserService mockService = Mockito.mock(UserService.class);
        // Define the mock's behavior: return true when addUser is called with any string
        Mockito.when(mockService.addUser(Mockito.any(String.class))).thenReturn(true);
        // Call the addUser method on the mock
        mockService.addUser("JohnDoe");
        Mockito.verify(mockService, Mockito.times(1)).addUser(Mockito.any(String.class));
    }
}
