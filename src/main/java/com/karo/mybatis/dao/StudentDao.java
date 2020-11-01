package com.karo.mybatis.dao;

import com.karo.mybatis.domain.Student;

import java.io.IOException;
import java.util.List;

public interface StudentDao {

	public List<Student> selectStudents() throws IOException;

	public int insertStudent(Student student) throws IOException;

	public Student selectStudent(Integer id);
}