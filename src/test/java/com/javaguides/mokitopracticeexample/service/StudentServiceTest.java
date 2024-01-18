package com.javaguides.mokitopracticeexample.service;

import com.javaguides.mokitopracticeexample.model.Student;
import com.javaguides.mokitopracticeexample.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class StudentServiceTest {
    @Mock
    private StudentRepository repository;
    @InjectMocks
    private StudentService service;
    @Spy
    private Student studentSpy = new Student();
    @Captor
    private ArgumentCaptor<Long> captor;

    @Test
    public void testGetStudentDetails() {
        Student student = new Student();
        student.setId(1L);
        student.setName("John Doe");
        Mockito.when(repository.findEmployeeById(1L)).thenReturn(student);
        Student result = service.getStudentDetails(1L);
        Assertions.assertEquals(student, result);
        Mockito.verify(repository).findEmployeeById(captor.capture());
        Assertions.assertEquals(1L, captor.getValue());

    }
}
