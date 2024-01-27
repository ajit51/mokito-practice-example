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

    @Test
    public void testFetchBookTitle() {
        // Given: Setting up the scenario
        BookService mockBookService = BDDMockito.mock(BookService.class);
        String dummyBookId = "123";
        BDDMockito.willReturn("Mocked Book Title").given(mockBookService).fetchBookTitleById(dummyBookId);
        // When: Performing the action
        String returnedTitle = mockBookService.fetchBookTitleById(dummyBookId);
        // Then: Verifying the outcome
        System.out.println("Returned Book Title: " + returnedTitle);
    }
}
