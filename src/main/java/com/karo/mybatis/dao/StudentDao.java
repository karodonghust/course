package com.karo.mybatis.dao;

import com.karo.mybatis.domain.Student;

import java.util.List;

public interface StudentDao {

	public List<Student> selectStudents();
}
