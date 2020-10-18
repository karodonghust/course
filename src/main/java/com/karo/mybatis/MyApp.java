package com.karo.mybatis;

import com.karo.mybatis.domain.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyApp {

	public static void main(String[] args) throws IOException {
		String config = "mybatis/mybatis.xml";

		InputStream inputStream = Resources.getResourceAsStream(config);

		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

		SqlSession sqlSession = sqlSessionFactory.openSession();

		String sqlId = "com.karo.mybatis.dao.StudentDao.selectStudents";

		List<Student> students = sqlSession.selectList(sqlId);

		students.forEach(stu -> System.out.println(stu));

		sqlSession.close();
	}
}
