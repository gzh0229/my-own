package com.java.mapper;

import com.java.dao.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    User getUser(@Param("id") int id);
}
