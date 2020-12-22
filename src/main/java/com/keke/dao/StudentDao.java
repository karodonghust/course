package com.keke.dao;

import com.keke.domain.Student;

import java.util.List;

public interface StudentDao {

    int insertStudent(Student student);

    List<Student> selectStudents();
}
