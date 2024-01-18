package com.javaguides.mokitopracticeexample.repository;

import com.javaguides.mokitopracticeexample.model.Student;

public interface StudentRepository {
    Student findEmployeeById(Long id);
}
