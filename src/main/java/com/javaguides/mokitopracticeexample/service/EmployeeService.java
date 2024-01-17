package com.javaguides.mokitopracticeexample.service;

import com.javaguides.mokitopracticeexample.model.Employee;
import com.javaguides.mokitopracticeexample.repository.EmployeeRepository;

public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public boolean saveEmployee(Employee employee) {
        // Business logic before saving
        return employeeRepository.save(employee);
    }
}
