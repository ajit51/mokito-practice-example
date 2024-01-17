package com.javaguides.mokitopracticeexample.service;

import com.javaguides.mokitopracticeexample.model.Employee;
import com.javaguides.mokitopracticeexample.repository.EmployeeRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.when;

public class EmployeeServiceTest {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeService employeeService;

    @Test
    public void testSaveEmployee(){
        MockitoAnnotations.openMocks(this);
        Employee employee = new Employee();
        when(employeeRepository.save(employee)).thenReturn(true);
        boolean result = employeeService.saveEmployee(employee);
        Assertions.assertTrue(result);
    }
}
