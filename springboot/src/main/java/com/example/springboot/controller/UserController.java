package com.example.springboot.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboot.model.User;
import com.example.springboot.service.UserService;
import com.example.springboot.util.JsonProtocol;
import com.example.springboot.util.ResultUtil;

@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger log = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	public JsonProtocol queryById(@PathVariable("id") Long id) {
		log.info("query user by id: {}", id);
		try {
			User user = userService.queryById(id);
			return ResultUtil.newSuccessResult(user);
		} catch (Exception e) {
			log.error("query user by id error", e);
			return ResultUtil.newFailResult(e.getMessage());
		}
	}

	@GetMapping("/list")
	public JsonProtocol queryAll(
			@RequestParam(value = "pageNum", defaultValue = "1") int pageNum,
			@RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
		log.info("query all users, pageNum: {}, pageSize: {}", pageNum, pageSize);
		try {
			List<User> users = userService.queryAllByPage(pageNum, pageSize);
			return ResultUtil.newSuccessResult(users);
		} catch (Exception e) {
			log.error("query all users error", e);
			return ResultUtil.newFailResult(e.getMessage());
		}
	}

	@GetMapping("/search")
	public JsonProtocol queryByUsername(@RequestParam("username") String username) {
		log.info("query user by username: {}", username);
		try {
			List<User> users = userService.queryByUsername(username);
			return ResultUtil.newSuccessResult(users);
		} catch (Exception e) {
			log.error("query user by username error", e);
			return ResultUtil.newFailResult(e.getMessage());
		}
	}
}
