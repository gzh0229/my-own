package com.java.mapper;

import com.java.dao.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    User getUserById(@Param("id") int id);

    List<User> getUser();
}
