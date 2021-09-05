package com.tr.mybatis;

import com.tr.demo.entity.User;
import com.tr.demo.mapper.UserMapper;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @author trangle
 */
public class MybatisApplication {

    public static SqlSessionFactory sqlSessionFactory() {
        String resource = "mybatis.xml";
        InputStream inputStream = ClassLoader.getSystemClassLoader().getResourceAsStream(resource);
        return new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = sqlSessionFactory();
        SqlSession session = sqlSessionFactory.openSession();

        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            List<User> userList = userMapper.selectUser();
            System.out.println(userList);
        } finally {
            session.close();
        }
    }
}
