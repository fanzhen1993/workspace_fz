package com.fz.habx.controller;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fz.habx.model.Order;
import com.fz.habx.service.OrderService;
import com.fz.habx.service.impl.ConsumerServiceImpl;
import com.habx.demo.MyDemoBean;

@RestController
@RequestMapping("/")
public class OrderController {
	private static final Logger log = LoggerFactory.getLogger(OrderController.class);
	@Autowired
	private OrderService orderService;
		
	@Autowired
	private MyDemoBean myDemoBean;
	
	@Autowired
	private ConsumerServiceImpl consumerService;
	
	@GetMapping(value = "/order/{orderId}")
	public Order queryOrderById(@PathVariable("orderId") String orderId) {
		log.info("==========================");
		return this.orderService.queryOrderById(orderId);
	}
	
	@GetMapping(value = "/queryList")
	public Order queryList(@Param("id") String id) {
		log.info("start dubbo=========================");
		consumerService.consumer();
		log.info("end dubbo=========================");
		return null;
	}
	
	@PostMapping(value = "/getMyDemoBean")
	public MyDemoBean getMyDemoBean() {
		return myDemoBean;
	}
}
