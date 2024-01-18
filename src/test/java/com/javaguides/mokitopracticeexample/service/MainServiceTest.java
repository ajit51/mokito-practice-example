package com.javaguides.mokitopracticeexample.service;

import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MainServiceTest {

    @Mock
    private DependencyService dependencyService;

    @InjectMocks
    private MainService mainService;

    @Test
    public void fetchMessageTest() {
        // Define behavior for the mock object
        when(dependencyService.getMessage()).thenReturn("Mocked message from DependencyService");
        String result = mainService.fetchMessage();
        Assertions.assertEquals("Main Service: Mocked message from DependencyService", result);
    }
}
