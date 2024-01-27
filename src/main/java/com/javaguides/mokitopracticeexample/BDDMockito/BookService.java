package com.javaguides.mokitopracticeexample.BDDMockito;

public class BookService {
    String getBookTitleById(int id) {
        // In a real-world scenario, this might fetch data from a database
        return "Dummy Title";
    }

    String fetchBookTitleById(String bookId) {
        // In a real-world application, this method might interact with a database or an external service
        return "Sample Book";
    }
}
