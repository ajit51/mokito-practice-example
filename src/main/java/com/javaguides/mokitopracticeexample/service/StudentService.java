package com.javaguides.mokitopracticeexample.service;

import com.javaguides.mokitopracticeexample.model.Student;
import com.javaguides.mokitopracticeexample.repository.StudentRepository;

public class StudentService {
    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudentDetails(Long id) {
        return studentRepository.findEmployeeById(id);
    }
}
