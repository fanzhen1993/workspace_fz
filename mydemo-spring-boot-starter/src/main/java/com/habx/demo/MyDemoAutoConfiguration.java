package com.habx.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.extern.slf4j.Slf4j;

@EnableConfigurationProperties(MyDemoProperties.class)
@ConditionalOnClass(MyDemoBean.class)
@Configuration
@Slf4j
public class MyDemoAutoConfiguration {
	@Bean
	public MyDemoBean getMyDemoBean(MyDemoProperties myDemoProperties) {
		MyDemoBean myDemoBean = new MyDemoBean();
		myDemoBean.setName(myDemoProperties.getName());
		myDemoBean.setPassword(myDemoProperties.getPassword());
		log.info("打印myDemo"+myDemoBean);
		return myDemoBean;
	}

}
