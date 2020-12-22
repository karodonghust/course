package com.keke.service.impl;

import com.keke.dao.StudentDao;
import com.keke.domain.Student;
import com.keke.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {

    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao){
        this.studentDao = studentDao;
    }


    @Override
    public int addStudent(Student student) {
        int nums = studentDao.insertStudent(student);
        return 0;
    }

    @Override
    public List<Student> queryStudents() {
        List<Student> students = studentDao.selectStudents();
        return students;
    }
}
