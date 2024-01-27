package com.javaguides.mokitopracticeexample.BDDMockito;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

public class UserServiceBDDTest {
    @Test
    public void testDeleteUserExceptionScenario() {
        // Given: Establish the situation
        UserService mockUserService = BDDMockito.mock(UserService.class);
        int invalidUserId = -1;
        BDDMockito.willThrow(new IllegalArgumentException("Invalid user ID")).given(mockUserService).deleteUser(invalidUserId);
        try {
            // When: Perform the action under scrutiny
            mockUserService.deleteUser(invalidUserId);
        } catch (Exception e) {
            // Then: Confirm the result
            System.out.println("Exception caught: " + e.getMessage());
        }

    }
}
