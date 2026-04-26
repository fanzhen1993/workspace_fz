package com.fz.habx.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="com.fz.habx.service.api") 
public class OrderProperties {
	private ItemProperties item = new ItemProperties();

	public ItemProperties getItem() {
		return item;
	}

	public void setItem(ItemProperties item) {
		this.item = item;
	}
}
