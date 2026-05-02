package com.example.springboot.service.impl;

import java.util.List;
import com.example.springboot.dao.UserMapper;
import com.example.springboot.model.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User queryById(Long id) {
		return userMapper.queryById(id);
	}

	@Override
	public List<User> queryByUsername(String username) {
		return userMapper.queryByUsername(username);
	}

	@Override
	public List<User> queryAllByPage(int pageNum, int pageSize) {
		if (pageNum < 1) {
			pageNum = 1;
		}
		if (pageSize < 1) {
			pageSize = 10;
		}
		int offset = (pageNum - 1) * pageSize;
		return userMapper.queryAllByPage(offset, pageSize);
	}

	@Override
	public List<User> queryAll() {
		return userMapper.queryAll();
	}
}
