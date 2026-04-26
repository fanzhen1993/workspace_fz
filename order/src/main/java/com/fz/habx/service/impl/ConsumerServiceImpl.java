package com.fz.habx.service.impl;

import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.fz.habx.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;

//@DubboService
@Service
@Slf4j
public class ConsumerServiceImpl implements ConsumerService {
	
	private static final Logger log = LoggerFactory.getLogger(ConsumerServiceImpl.class);

	//@DubboReference
	//private DubboProviderService dubboService;
	
	public void consumer() {
		log.info("start consumer=======================");
		//dubboService.print();
		log.info("end consumer=======================");
	}
}
