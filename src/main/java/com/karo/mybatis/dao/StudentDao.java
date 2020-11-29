package com.karo.mybatis.dao;

import com.karo.mybatis.domain.Student;
import com.karo.mybatis.vo.QueryParam;
import org.apache.ibatis.annotations.Param;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface StudentDao {

	public List<Student> selectStudents() throws IOException;

	public int insertStudent(Student student) throws IOException;

	public Student selectStudent(Integer id);

	public List<Student> mulitParamSelect(@Param("myName") String name, @Param("myAge") Integer age);

	public List<Student> objectSelect(QueryParam param);

	public List<Student> studentSelect(Student student);

	public List<Student> mapSelect(Map<String,Object> map);

	public List<Student> orderSelect(@Param("column")String column);
}