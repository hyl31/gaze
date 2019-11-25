package com.gaze.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gaze.biz.UserBiz;
import com.gaze.util.MD5Util;

public class test1 {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		UserBiz u= (UserBiz) context.getBean("userBizImpl");
		
		System.out.println(u.getUser("11188886666", "123456"));
	}
}
