package com.karo.mybatis;

import com.karo.mybatis.dao.StudentDao;
import com.karo.mybatis.dao.impl.StudentDaoImpl;
import com.karo.mybatis.domain.Student;
import com.karo.mybatis.utils.SQLUtils;
import com.karo.mybatis.vo.QueryParam;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestMyBatis {

	public static final String CONFIG = "mybatis/mybatis.xml";

	private void printStudents(List students){
		students.forEach(student ->{
			System.out.println(student);
		});
	}

	@Test
	public void insertTest()  {
		String config = "mybatis/mybatis.xml";

		SqlSession sqlSession = SQLUtils.getSqlSession(config);

		String sqlId = "com.karo.mybatis.dao.StudentDao.insertStudent";

		Student student = new Student();
		student.setId(1003);
		student.setName("张飞");
		student.setEmail("zhangfei@163.com");
		student.setAge(20);
		int insertNum = sqlSession.insert(sqlId, student);
		sqlSession.commit();
		System.out.println("插入" + insertNum + "条数据成功");
		sqlSession.close();
	}

	@Test
	public void selectTest()  {
		String config = "mybatis/mybatis.xml";
		SqlSession sqlSession = SQLUtils.getSqlSession(config);

		String sqlId = "com.karo.mybatis.dao.StudentDao.selectStudents";
		List<Student> students = sqlSession.selectList(sqlId);
		students.forEach(stu -> System.out.println(stu));

		sqlSession.close();
	}

	@Test
	public void selectStudentsTest() throws IOException {
		StudentDao dao = new StudentDaoImpl();
		List<Student> students = dao.selectStudents();
		students.forEach(student -> {
			System.out.println("dao查询测试");
			System.out.println(student);
		});
	}

	@Test
	public void insertStudentTest() throws IOException {
		StudentDao dao = new StudentDaoImpl();
		Student student = new Student();
		student.setAge(20);
		student.setEmail("zhugeliang@163.com");
		student.setName("诸葛亮");
		student.setId(1004);
		int nums = dao.insertStudent(student);
		System.out.println(nums + "条数据插入成功");
	}

	@Test
	public void selectDaoTest() throws IOException {
		SqlSession sqlSession = SQLUtils.getSqlSession(CONFIG);
		StudentDao dao = sqlSession.getMapper(StudentDao.class);
		List<Student> students = dao.selectStudents();
		students.forEach(student -> {
			System.out.println(student);
		});
		sqlSession.close();
	}

	@Test
	public void selectStuByIdTest()  {
		SqlSession sqlSession = SQLUtils.getSqlSession(CONFIG);
		StudentDao dao = sqlSession.getMapper(StudentDao.class);
        System.out.println("dao:" + dao);
		Student student = dao.selectStudent(1003);
		System.out.println(student);
		sqlSession.close();
	}

	@Test
	public void mulitParam()  {
		SqlSession sqlSession = SQLUtils.getSqlSession(CONFIG);
		StudentDao dao = sqlSession.getMapper(StudentDao.class);
		List students = dao.mulitParamSelect("李四",21);
		students.forEach(student ->{
			System.out.println(student);
		});
		sqlSession.close();
	}

	@Test
	public void objectSelectTest()  {
		SqlSession sqlSession = SQLUtils.getSqlSession(CONFIG);
		StudentDao dao = sqlSession.getMapper(StudentDao.class);
		QueryParam queryParam = new QueryParam();
		queryParam.setAge(21);
		queryParam.setName("李四");
		List students = dao.objectSelect(queryParam);
		students.forEach(student ->{
			System.out.println(student);
		});
		sqlSession.close();
	}

	@Test
	public void studentSelect()  {
		SqlSession sqlSession = SQLUtils.getSqlSession(CONFIG);
		StudentDao dao = sqlSession.getMapper(StudentDao.class);
		Student student = new Student();
		student.setAge(21);
		student.setName("李四");
		List students = dao.studentSelect(student);
		printStudents(students);
		sqlSession.close();
	}

	@Test
	public void mapStudent() {
		SqlSession sqlSession = SQLUtils.getSqlSession(CONFIG);
		StudentDao dao = sqlSession.getMapper(StudentDao.class);
		Map<String,Object> student = new HashMap<>();
		student.put("age",21);
		student.put("name","李四");
		List students = dao.mapSelect(student);
		printStudents(students);
	}

	@Test
	public void orderSelect(){
		SqlSession sqlSession = SQLUtils.getSqlSession(CONFIG);
		StudentDao dao = sqlSession.getMapper(StudentDao.class);
		List<Student> students = dao.orderSelect("email");
		printStudents(students);
	}



}
