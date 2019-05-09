package com.java.service;

import com.alibaba.fastjson.JSONObject;
import com.java.dao.User;
import com.java.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserService {

    public SqlSessionFactory getSqlSessionFactory() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //从 XML 中构建 SqlSessionFactory
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            return sqlSessionFactory;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return null;
        }
    }


    public void test() {
        //从 SqlSessionFactory 中获取 SqlSession
        SqlSession session = getSqlSessionFactory().openSession();
        try {
            UserMapper userMapper = session.getMapper(UserMapper.class);
            User user = userMapper.getUserById(1);
            System.out.println(user.getRealName());
            List<User> list = userMapper.getUser();
            for (User u : list) {
                System.out.println(JSONObject.toJSONString(u));
            }
        } finally {
            session.close();
        }
    }


}
