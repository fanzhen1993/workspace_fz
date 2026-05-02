package com.example.springboot.service;

import java.util.List;
import com.example.springboot.model.User;

public interface UserService {

	User queryById(Long id);

	List<User> queryByUsername(String username);

	/**
	 * 分页查询用户
	 *
	 * @param pageNum  页码，从1开始
	 * @param pageSize 每页条数
	 * @return 用户列表
	 */
	List<User> queryAllByPage(int pageNum, int pageSize);

	List<User> queryAll();
}
