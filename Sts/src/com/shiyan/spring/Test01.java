package com.shiyan.spring;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shiyan.spring.Person;

public class Test01 {

	public static void main(String[] args) {
		/*
		 * 	IOC控制反转
		 * 借助于spring赋值
		 */
		ApplicationContext bf = new ClassPathXmlApplicationContext("applicationContext.xml");

		Person person =(Person)bf.getBean("Herson");
		person.show();
		
	}

}
