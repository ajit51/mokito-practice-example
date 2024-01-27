package com.javaguides.mokitopracticeexample.service1;

public class BookService {
    public boolean isValidBook(String title, int yearPublished) {
        return title != null && !title.trim().isEmpty() && yearPublished > 0;
    }
}
