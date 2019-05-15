package com.java.service;

import com.alibaba.fastjson.JSONObject;
import com.java.mapper.UserMapper;
import com.java.model.User;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class UserService {

    @Test
    public void test() {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            UserMapper userMapper = session.getMapper(UserMapper.class);
            User user = userMapper.getUserById(1);
            System.out.println(user.getRealName());
            List<User> list = userMapper.getUser();
            for (User u : list) {
                System.out.println(JSONObject.toJSONString(u));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
