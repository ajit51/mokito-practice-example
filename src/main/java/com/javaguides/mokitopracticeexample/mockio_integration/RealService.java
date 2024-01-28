package com.javaguides.mokitopracticeexample.mockio_integration;

public class RealService implements Service {
    @Override
    public String greet(String name) {
        return "Hello, " + name;
    }
}
