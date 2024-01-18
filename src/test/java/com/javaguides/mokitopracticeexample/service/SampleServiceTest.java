package com.javaguides.mokitopracticeexample.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class SampleServiceTest {

    @Spy
    private SampleService sampleService;

    @Test
    public void toBeSpiedMethodTest(){
        // Modify behavior of one method using spy
        doReturn("Spied version of toBeSpiedMethod").when(sampleService).toBeSpiedMethod();
        String result = sampleService.toBeSpiedMethod();
        assertEquals("Spied version of toBeSpiedMethod", result);
    }

    @Test
    public void actualMethodTest(){
        String result = sampleService.actualMethod();
        assertEquals("Real implementation of actualMethod", result);
    }

}
