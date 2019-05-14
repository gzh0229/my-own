package com.java.mapper;

import org.apache.ibatis.annotations.Param;

import com.java.model.User;

import java.util.List;

public interface UserMapper {

    User getUserById(@Param("id") int id);

    List<User> getUser();
}
