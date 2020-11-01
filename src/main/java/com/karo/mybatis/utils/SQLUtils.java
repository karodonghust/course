package com.karo.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SQLUtils {

	public static SqlSession getSqlSession(String config) throws IOException {

		InputStream inputStream = Resources.getResourceAsStream(config);

		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

		SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

		SqlSession sqlSession = sqlSessionFactory.openSession();

		return sqlSession;
	}
}
