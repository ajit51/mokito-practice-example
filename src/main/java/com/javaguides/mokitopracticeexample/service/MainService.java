package com.javaguides.mokitopracticeexample.service;

public class MainService {
    private DependencyService dependencyService;

    MainService(DependencyService dependencyService) {
        this.dependencyService = dependencyService;
    }

    String fetchMessage() {
        return "Main Service: " + dependencyService.getMessage();
    }
}
