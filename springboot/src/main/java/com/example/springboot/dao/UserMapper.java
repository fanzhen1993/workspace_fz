package com.example.springboot.dao;

import java.util.List;
import com.example.springboot.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

	User queryById(@Param("id") Long id);

	List<User> queryByUsername(@Param("username") String username);

	List<User> queryAllByPage(@Param("offset") int offset, @Param("pageSize") int pageSize);

	List<User> queryAll();
}
