package com.javaguides.mokitopracticeexample.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class BookServiceTest {
    @Test
    public void isAvailableTest() {
        // Generate a mock of BookService
        BookService mockService = Mockito.mock(BookService.class);
        // Define the mock's behavior: return true when isAvailable is called with "Mockito Guide"
        Mockito.when(mockService.isAvailable(Mockito.eq("Mockito Guide"))).thenReturn(true);
        // Invoke the isAvailable method on the moc
        mockService.isAvailable("Mockito Guide");
        // Validate that the isAvailable method was called with "Mockito Guide" as the argument
        Mockito.verify(mockService).isAvailable(Mockito.eq("Mockito Guide"));
    }
}
