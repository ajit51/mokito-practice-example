package com.javaguides.mokitopracticeexample.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DatabaseServiceTest {

    @Test
    public void fetchDataTest() throws Exception {
        // Generate a mock of DatabaseService
        DatabaseService mockService = mock(DatabaseService.class);
        // Use the thenThrow() method to simulate an exception
        when(mockService.fetchData("errorQuery")).thenThrow(new Exception("Database Error"));
        // Assert that the exception is thrown
        Assertions.assertThrows(Exception.class, () -> mockService.fetchData("errorQuery"));
    }
}
