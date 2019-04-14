package com.qetch.gmall;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qetch.gmall.service.OrderService;
import com.qetch.gmall.service.impl.OrderServiceImpl;

public class ConsumerMainApplication {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("consumer.xml");
		ioc.start();
		
		OrderService orderService = ioc.getBean(OrderServiceImpl.class);
		orderService.initOrder("1");
		System.out.println("调用完成...");
		System.in.read();
	}
}
