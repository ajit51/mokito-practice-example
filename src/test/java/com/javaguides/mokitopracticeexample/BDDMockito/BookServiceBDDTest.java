package com.javaguides.mokitopracticeexample.BDDMockito;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

public class BookServiceBDDTest {
    @Test
    public void testGetBookTitleById() {
        // Given: Set up the scenario
        BookService mockBookService = BDDMockito.mock(BookService.class);
        int testId = 123;
        BDDMockito.given(mockBookService.getBookTitleById(testId)).willReturn("Test Title");
        // When: Execute the method under test
        String title = mockBookService.getBookTitleById(testId);
        // Then: Verify the outcome
        System.out.println("Retrieved title: " + title);
    }
}
