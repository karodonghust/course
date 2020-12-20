package com.karo.mybatis.dao.impl;

import com.karo.mybatis.dao.StudentDao;
import com.karo.mybatis.domain.Student;
import com.karo.mybatis.utils.SQLUtils;
import com.karo.mybatis.vo.QueryParam;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class StudentDaoImpl implements StudentDao {
	public static final String CONFIG = "mybatis/mybatis.xml";
	@Override
	public List<Student> selectStudents() throws IOException {
		SqlSession sqlSession = SQLUtils.getSqlSession(CONFIG);
		String sqlId = "com.karo.mybatis.dao.StudentDao.selectStudents";
		List<Student> students = sqlSession.selectList(sqlId);
		students.forEach(student -> System.out.println(student));
		sqlSession.close();
		return students;
	}

	@Override
	public List<Student> studentSelect(Student student) {
		return null;
	}

	@Override
	public List<Student> mapSelect(Map<String, Object> map) {
		return null;
	}

	@Override
	public List<Student> orderSelect(String column) {
		return null;
	}

	@Override
	public int insertStudent(Student student) throws IOException {
		SqlSession sqlSession = SQLUtils.getSqlSession(CONFIG);
		String sqlId = "com.karo.mybatis.dao.StudentDao.insertStudent";
		int nums = sqlSession.insert(sqlId,student);
		sqlSession.commit();
		sqlSession.close();
		return nums;
	}

	@Override
	public Student selectStudent(Integer id) {
		return null;
	}

	@Override
	public List<Student> mulitParamSelect(String name, Integer age) {
		return null;
	}

	@Override
	public List<Student> test(Map<String, Object> map) {
		return null;
	}

	@Override
	public List<Student> objectSelect(QueryParam param) {
		return null;
	}
}
