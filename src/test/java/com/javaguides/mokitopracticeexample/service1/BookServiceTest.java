package com.javaguides.mokitopracticeexample.service1;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

public class BookServiceTest {
    @Test
    public void testArgumentMatchers() {
        // Mocking the BookService
        BookService mockBookService = Mockito.mock(BookService.class);
        // Use ArgumentMatchers to set expectations
        Mockito.when(mockBookService.isValidBook(ArgumentMatchers.anyString(), ArgumentMatchers.anyInt())).thenReturn(true);
        // Test with various inputs
        assert mockBookService.isValidBook("Mockito Guide", 2020);
        assert mockBookService.isValidBook("Some Title", -50);
        // Verify the interactions
        Mockito.verify(mockBookService, Mockito.times(2)).isValidBook(ArgumentMatchers.anyString(), ArgumentMatchers.anyInt());
    }
}
