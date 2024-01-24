package com.javaguides.mokitopracticeexample.service;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;

public class AccountServiceTest {
    @Test
    public void orderOfInvocationTest() {
        // Generate a mock of AccountService
        AccountService mockService = mock(AccountService.class);
        // Simulate deposit and withdraw operations on the mock
        mockService.deposit(100);
        mockService.withdraw(50);
        // Use inOrder to validate the order of invocation
        InOrder inOrder = Mockito.inOrder(mockService);
        inOrder.verify(mockService).deposit(100);
        inOrder.verify(mockService).withdraw(50);
    }
}
