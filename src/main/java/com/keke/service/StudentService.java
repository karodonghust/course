package com.keke.service;

import com.keke.domain.Student;

import java.util.List;

public interface StudentService {

    int addStudent(Student student);
    List<Student> queryStudents();
}
