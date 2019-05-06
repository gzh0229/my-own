package com.java.service;

import com.alibaba.fastjson.JSONObject;
import com.java.dao.User;
import com.java.mapper.UserMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

public class UserService {

    @Test
    public void test() {
        try {
            String resource = "com/java/service/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            UserMapper mapper = session.getMapper(UserMapper.class);
            User user = mapper.getUser(1);
            System.out.println(user.getRealName());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testDemo() throws IOException {
        //mybatis配置文件的名称
        String resource = "mybatis-config.xml";
        //初始化mybatis配置环境
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //打开和数据库之间的会话
        SqlSession session = factory.openSession();
        //执行查询
        List<User> ulist = session.selectList("getUser");
        //遍历查询结果
        for (User u : ulist) {
            System.out.println(JSONObject.toJSONString(u));
        }
        //关闭会话
        session.close();
    }

}
